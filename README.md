<div align= "center">
    <img src="https://capsule-render.vercel.app/api?type=waving&color=0:00e1ff,100:07fc03&height=180&text=sumin2006&animation=fadeIn&fontColor=000000&fontSize=60" />
    </div>
    <div style="text-align: left;">
    <h2 style="border-bottom: 1px solid #d8dee4; color: #282d33;"> 🛠️ Tech Stacks </h2> <br> 
    <div style="margin: ; text-align: left;" "text-align: left;"> <img src="https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=Android&logoColor=white">
          <img src="https://img.shields.io/badge/C-A8B9CC?style=for-the-badge&logo=C&logoColor=white">
          <img src="https://img.shields.io/badge/C++-00599C?style=for-the-badge&logo=C%2B%2B&logoColor=white">
          <img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=Git&logoColor=white">
          <img src="https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=Python&logoColor=white">
          <br/><img src="https://img.shields.io/badge/Github-181717?style=for-the-badge&logo=Github&logoColor=white">
          <img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=HTML5&logoColor=white">
          </div>
    </div>
    <div style="text-align: left;"> 
    <h2 style="border-bottom: 1px solid #d8dee4; color: #282d33;"> Game Description </h2> <div style="text-align: left;"> <img src="https://github-readme-stats.vercel.app/api?username=sumin2006&custom_title=sumin2006's Github Stat&bg_color=180,000000,&title_color=000000&text_color=000000"
        /> <img src="https://github-readme-stats.vercel.app/api/top-langs/?username=sumin2006&layout=compact&bg_color=180,000000,&title_color=000000&text_color=000000"
           /> </div> 
    </div>

    틱택토 게임 (Tic Tac Toe Game)
📋 프로젝트 소개
코틀린(Kotlin)으로 제작한 안드로이드 틱택토 게임입니다. 두 명의 플레이어가 번갈아가며 3x3 보드에 X와 O를 놓아 가로, 세로, 대각선으로 3개를 먼저 완성하는 사람이 승리하는 게임입니다.
✨ 주요 기능

🎮 2인 대전 게임 (X vs O)
🏆 승리/무승부 판정
🔄 게임 다시 시작 기능
🏠 메인 메뉴로 돌아가기
📱 직관적인 UI/UX

🎯 실행 결과
1. 메인 화면
<img src="screenshot_main.png" width="300">

앱을 실행하면 나타나는 첫 화면입니다
"틱택토 게임" 타이틀이 표시됩니다
"게임 시작" 버튼을 누르면 게임 화면으로 이동합니다

2. 게임 플레이 화면
<img src="screenshot_game.png" width="300">

3x3 그리드 보드가 표시됩니다
상단에 현재 차례인 플레이어(X 또는 O)가 표시됩니다
빈 칸을 터치하면 현재 플레이어의 기호가 표시됩니다
"다시 시작" 버튼으로 현재 게임을 초기화할 수 있습니다

3. 결과 화면
<img src="screenshot_result.png" width="300">

게임이 끝나면 승리자 또는 무승부 결과를 표시합니다
"다시 하기" 버튼: 새로운 게임을 시작합니다
"메인으로" 버튼: 메인 화면으로 돌아갑니다.

Root<br>
java/com/example/tic_tac_toe/<br>
MainActivity.kt          # 메인 화면 액티비티<br>
GameActivity.kt          # 게임 플레이 액티비티<br>
ResultActivity.kt        # 결과 화면 액티비티<br>
<br>
res/<br>
layout/<br>
activity_main.xml    # 메인 화면 레이아웃<br>
activity_game.xml    # 게임 화면 레이아웃<br>
activity_result.xml  # 결과 화면 레이아웃<br>
<br>
AndroidManifest.xml          # 앱 설정 파일<br>



🔧 기술 스택
언어: Kotlin
플랫폼: Android
최소 SDK: API 21 (Android 5.0)
UI: XML Layouts
아키텍처: Activity 기반



🎯 게임 규칙

1. X 플레이어가 먼저 시작합니다
2. 플레이어는 번갈아가며 빈 칸에 자신의 기호를 놓습니다
3. 가로, 세로, 대각선 중 하나라도 3개를 먼저 연결하면 승리합니다
4. 모든 칸이 채워졌는데 승자가 없으면 무승부입니다
5. "다시 시작" 버튼으로 언제든지 게임을 초기화할 수 있습니다

🐛 제한사항

현재 2인 로컬 플레이만 지원 (AI 없음)
게임 기록 저장 기능 없음
점수 시스템 없음

🔮 향후 개선 사항

 AI 상대 추가 (1인 플레이 모드)
 게임 기록 및 통계
 사운드 효과 추가
 애니메이션 효과
 다크 모드 지원
 승리 라인 하이라이트
 난이도 설정 (쉬움, 보통, 어려움)
