package com.example.tic_tac_toe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GameActivity : AppCompatActivity() {
    private lateinit var buttons: Array<Array<Button>>
    private lateinit var turnText: TextView
    private var currentPlayer = "X"
    private val board = Array(3) { Array(3) { "" } }
    private var gameActive = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        turnText = findViewById(R.id.turnText)
        updateTurnText()

        buttons = Array(3) { row ->
            Array(3) { col ->
                val buttonId = resources.getIdentifier(
                    "button_${row}_${col}",
                    "id",
                    packageName
                )
                findViewById<Button>(buttonId).apply {
                    setOnClickListener { onCellClicked(row, col, this) }
                }
            }
        }

        findViewById<Button>(R.id.resetButton).setOnClickListener {
            resetGame()
        }
    }

    private fun onCellClicked(row: Int, col: Int, button: Button) {
        if (!gameActive || board[row][col].isNotEmpty()) return

        board[row][col] = currentPlayer
        button.text = currentPlayer
        button.isEnabled = false

        if (checkWinner()) {
            gameActive = false
            showResult("승리!", "$currentPlayer 플레이어 승리!")
        } else if (isBoardFull()) {
            gameActive = false
            showResult("무승부", "무승부입니다!")
        } else {
            currentPlayer = if (currentPlayer == "X") "O" else "X"
            updateTurnText()
        }
    }

    private fun checkWinner(): Boolean {
        for (i in 0..2) {
            if (board[i][0] == currentPlayer &&
                board[i][1] == currentPlayer &&
                board[i][2] == currentPlayer) {
                return true
            }
        }

        for (i in 0..2) {
            if (board[0][i] == currentPlayer &&
                board[1][i] == currentPlayer &&
                board[2][i] == currentPlayer) {
                return true
            }
        }

        if (board[0][0] == currentPlayer &&
            board[1][1] == currentPlayer &&
            board[2][2] == currentPlayer) {
            return true
        }

        if (board[0][2] == currentPlayer &&
            board[1][1] == currentPlayer &&
            board[2][0] == currentPlayer) {
            return true
        }

        return false
    }

    private fun isBoardFull(): Boolean {
        for (row in board) {
            for (cell in row) {
                if (cell.isEmpty()) return false
            }
        }
        return true
    }

    private fun showResult(result: String, message: String) {
        val intent = Intent(this, ResultActivity::class.java).apply {
            putExtra("RESULT", result)
            putExtra("MESSAGE", message)
        }
        startActivity(intent)
        finish()
    }

    private fun resetGame() {
        currentPlayer = "X"
        gameActive = true
        board.forEach { it.fill("") }
        buttons.forEach { row ->
            row.forEach { button ->
                button.text = ""
                button.isEnabled = true
            }
        }
        updateTurnText()
    }

    private fun updateTurnText() {
        turnText.text = "$currentPlayer 차례"
    }
}