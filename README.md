<h1 align="center">홍홍홍_2021KNUhackathon</h1>


**https://gist.github.com/ihoneymon/652be052a0727ad59601 여기 참고 해서 쓰면 좋다!


## 🖥 프로그램 설명

이 프로그램 “KNU 강의실 및 좌석 예약 앱(가제)”은 

<center>**"언제 어디서나 경북대학교 내의 빈 강의실 또는 빈 강의실의 좌석을 예약할 수 있는 프로그램"** 입니다.</center> 

```
현재 구현은 컴퓨터학부의 IT4호관과 IT5호관, 이 두 건물만을 해 둔 상태지만, 

더 발전, 확장시킨다면 각 대학, 학부 내의 사용가능한 빈 강의실을 파악한 뒤, 

타과 학생들도 이 프로그램을 사용할 수 있도록 할 예정입니다. 
```
이 프로그램은 회의 또는 자습의 목적으로 빈 강의실을 이용해야 하는 경우 유용하게 사용될 것입니다. 

또한, 학생들뿐만 아니라, 다른 교직원분들이 정규 강의 등이 아닌 타목적으로 강의실을 이용해야 할 시에

직접 사무실에 알리지 않아도, 이 프로그램으로 보다 스마트하게 강의실 예약이 가능할 것입니다.

저희는 첨성인의 세 가지 덕목 "진리", "긍지", "봉사"에 걸맞는 프로그램을 제작하기 위해 노력했습니다.

* 기존의 프로그램에서 더 나아가 여러 학우분들의 의견을 수렴하여 컴퓨터학부 내에서 뿐만 아니라 

경북대학교 내의 타과의 학우분들의 학업 생활 또한 편리해질 수 있도록 생각하였고,

* 학생의 입장에서 강의실을 이용하는데에 있어 불편한 점들을 조사하여 보완점을 생각하고 

어떻게 해결할 수 있을지에 대한 고민을 했습니다.

* 또, 설문조사를 통해 타과 학생들의 의견을 수렴하려고 노력하였으며,

제작자들만의 이익이 아닌 경북대학교 학생 모두의 이익을 위해 이 프로그램을 제작하였습니다.

첨성인의 덕목 외에도 현재 COVID-19로 인해 바뀐 대학생활 중 일부를 보다 스마트한 방향으로 보완해 나가기 위해 노력하였습니다.


## ✍ 프로그램을 제작하게 된 동기

저희 팀원 모두가 경북대학교 컴퓨터학부의 재학생인 만큼, 시험기간동안 개방되는 IT 4호관, IT 5호관 등의 강의실을 많이 사용해 왔습니다. 

저희가 지난 기간 동안 이용해 온 강의실 이용 방식은 COVID-19의 위험성 증가로 인해 다음과 같이 변화하였습니다.

<center>2020-2: 지정 강의실의 빈 좌석 자율 이용  ⇨ 2021-1: 지정 강의실의 좌석 사전 예약 후 이용</center>

바뀐 방법의 장점은 다음과 같습니다.

* COVID-19로 인해 강의실 사용을 예약제로 바꾸면서 Google Form을 통한 좌석 예약 및 입실/퇴실 명부 관리로 기존에 취약했던 COVID-19 감염 및 전파의 대비책이 잘 마련되었다.

반면, 바뀐 방법의 불편한 점은 다음과 같습니다.

* 이 시스템을 이용하면서 학생들이 예약, 입실, 퇴실마다 Google Form을 작성해야 하는 번거로움이 존재한다.
* 또 이를 관리하는 사람들이 일일이 명단을 확인하고 좌석 배치까지 해야 한다.

이 외에도 빈 강의실을 학생들이 이용하기에는 다른 여러 불편함이 존재합니다. 

그래서 저희는 저희가 기존에 느껴왔던 불편함에서 주제를 떠올렸고, 아래의 설문조사 결과, 표본이 경북대학교 학생의 극히 일부이긴 하나 

어느 정도 필요성을 인정받았다고 판단, 이 프로그램(어플리케이션)을 제작하게 되었습니다.

## 프로그램의 필요성에 관한 설문조사 결과



## 프로그램 (어플리케이션) 사용 가이드


### <교수님 페이지>
1) 주요 기능: 강의실 사용 예약(날짜 및 시간)
2) 디자인: 캘린더 형태
3) 예약
	1. 건물을 선택하면 monthly 캘린더가 뜸
	2. monthly 캘린더 페이지에서 해당 날짜에 예약이 있는 경우 아이콘으로 표시
	3. 강의실은 색상으로 구분
	4. 날짜를 선택하고 강의실을 선택
	5. 강의실을 선택할 시 day 캘린더를 보여주며 예약 내용 보여주기
	6. 추가 버튼을 누르면 빈 시간대에 예약 가능 
	   * 추가 버튼은 monthly 캘린더 및 day캘린더에 모두 표시
	7. 예약 기간/예약 시간/예약 목적/예상 인원을 차례로 선택 및 입력 
	   * 관리자에게 알림 전송 -> 관리자 승인 여부 결정
	8. 관리자 승인이 완료될 시 예약 완료
4) 수정 및 취소
	1. 본인이 예약한 일정을 클릭한 후 수정 및 취소 버튼 클릭
	2. 수정 완료 후 다시 저장 버튼을 눌러 수정 내용 저장
	3. 취소 버튼을 누르면 확인 팝업이 뜨고 확인 버튼을 누르면 취소
5) 건의 및 공지사항 게시판
	1. 불편한 점이 있을 경우 건의 게시판 글 작성
	2. 공지사항 게시판에서 관리자의 공지사항 확인
6) 유의 사항
	1. 전후 30분 동안은 이용 불가능
	2. 늦어도 사용 1시간 전에 회의실을 예약하는 것으로 함.

* * * 

### <학생 페이지>
1) 주요 기능: 강의실 사용 예약(날짜 및 시간)
2) 디자인 동일
3) 강의실 예약
	* 회의용 예약 : 교수님 강의실 예약과 동일함.
	* 자습용 예약
		1. 건물을 선택하면 monthly 캘린더가 뜸
		2. monthly 캘린더 페이지에서 해당 날짜에 예약이 있는 경우 아이콘으로 표시
		3. 강의실은 색상으로 구분
		4. 날짜를 선택하고 강의실을 선택
		5 강의실을 선택할 시 팝업창으로 day 캘린더를 보여주며 예약 내용 보여주기
	    		* 팝업 창: 당일 예약 내용을 보여줌과 동시에 “진행하겠습니까?” 질문
		6. 추가 버튼을 누르면 빈 시간대 중 입실 시간 선택
	   		* 추가 버튼은 monthly 캘린더 및 day캘린더에 모두 표시
		7. 시간 선택하면 강의실의 남은 좌석 수가 표시됨
		8. 좌석 배치도가 나오며 좌석의 사용 가능 여부가 표시됨
		9. 좌석을 클릭했을 때, 사용이 가능하면 사용을 클릭하고 좌석 사용
4) 변경 및 취소
	* 회의용 예약 변경 및 취소는 교수님 페이지와 동일함.
	* 자습용 예약 변경 및 취소는 아래의 순서를 따름.
	     1. 좌석 변경을 원한다면 현재 좌석을 취소하고 다시 예약 해야함.
 	     2. 좌석 변경 및 취소는 변경 버튼과 취소 버튼을 활용
5) 연장
	* 회의용 예약과 자습용 예약의 연장은 연장 버튼을 이용하도록 함. 
6) 건의 및 공지사항 게시판
	* 교수님 페이지와 동일함.
7) 유의사항
	* 만약 학생들의 좌석 예약 이후 교수님들이 강의실을 예약하면 해당 강의실을 사용하고 
있는 학생들에게 알림 전송
	* 노쇼 방지를 위해 예약해두고 사용하지 않은 것이 적발된다면 다음과 같은 조치를 취함.
    		* 1회 적발 시 강의실 1일 사용 금지
		* 2회 적발 시 강의실 3일 사용 금지
    		* 3회 적발 시 7일 사용 금지
		* 4회 적발 시 강의실 2주 사용 금지 후 적발 횟수 초기화
	* 자습용 좌석 예약은 당일 예약만 가능하도록 함.
	* 자습용 좌석 사용 시간은 기본으로 2시간이 주어짐.

* * *

### <관리자용 페이지>
1) 주요 기능: 강의실 사용 승인
2) 디자인 동일
3) 승인
	1. 교수님이나 학생들이 예약 목적을 기타사항으로 직접 입력할 경우 관리자 앱에 
승인 알람이 전송됨.
	2. 사유를 확인한 후 승인 또는 거부 버튼을 눌러 승인 여부 등록
 4) 사용 가능 강의실 추가 및 삭제
	1. 시험 기간, 추가로 강의실을 개방할 경우 강의실 추가 버튼을 활용하여 강의실 추가
	2. 강의실 폐쇄를 해야 할 경우 삭제 버튼을 활용하여 강의실 삭제
5) 건의 사항 및 공지사항 페이지
	건의 사항에 대한 답변 작성 및 공지를 작성할 수 있는 페이지
	
## 프로그램 구성 코드 설명


## 프로그램 제작자 
🙆‍♀️ 홍송은 _KNU CSE 20_  //  Songeun's github link: 

🤸‍♀️ 서경희 _KNU CSE 20_  //  Kyunghee's github link: 

👩‍🚀 최희정 _KNU CSE 20_  //  [Heejung's github link](https://github.com/hdddhdd)
