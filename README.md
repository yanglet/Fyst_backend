# Fyst_backend

##  💄👄👠💅당신의 피부를 위한 스킨케어 웹 서비스✨🧴💇‍♀️💁‍♀️

<br />
저희 프로젝트에서 제공하는 피부 타입 테스트를 통해 맞춤형 스킨 케어 제품을 찾아드립니다.      

<br />

## 💡 기본 Information

<br />

📌 개발 기간 📆 : 
- 2022.01 - 2022.02   

📌 팀 명: 
<li style="line-height: 50px;">
Latte는 <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQS5_pRZZCW6YgQ9Xleh9OjRsdgwyzwE9l_wA&usqp=CAU" alt="라떼는말이야 이미지" width="50px"  style="" /> 이야
</li>

 
📌 개발 인원: 프론트엔드 1명, 백엔드 1명
- [팀장 양** Github](https://github.com/yanglet/Fyst_backend)
- [팀원 박** Github](https://github.com/ekfka4863/for_your_skin_type_F)

<br />
<br />

## 💡 사용한 기술 stack

<br />


### Back-End
- `Java`
- `Spring Boot`
- `JPA`
- `MySQL`
- `Gradle`
- `Postman`


<br />

### 협업 Tool
- `Git`
- `Discord`
- `Notion`
<!-- - `` -->


<br />
<br />


## 💡 내가 한 것

<br />

### 엔티티 설계(UML)

<details>
  <summary>Click Me !</summary>
 
  ![foryourskintype_entity2](https://user-images.githubusercontent.com/96788792/152382220-f5b2dc75-3e25-4f2f-857e-d15612e61db9.PNG)
    
</details>

### 전반적인 모든 기능 구현
- session 방식을 통한 로그인
- 인터셉터, 예외처리 ( ControllerAdvice를 사용 )
- 회원, 상품, 장바구니 상품 API 구현 (Postman으로 테스트하며 진행)
- 데이터 수집 (데이터 크롤링 + 노동 .. -> Jsoup라이브러리를 이용했는데, robots.txt로 막혀있어서인지 크롤링이 안되는 항목이 많았음)

<!-- ### 팀원들 멘탈 케어 -->

<br />
<br />

## 💡 프로젝트 주요 서비스 및 화면

<br/>

####  화면
<details>
  <summary>Click Me !</summary>
	
  ![home](https://user-images.githubusercontent.com/96788792/152678692-a6ceba53-bc1c-43c4-81dd-970366c66ce2.PNG)
  ![bestseller](https://user-images.githubusercontent.com/96788792/152678748-9e6e9641-40ee-4101-aae5-034e7a73b38f.PNG)
  ![skintypetest](https://user-images.githubusercontent.com/96788792/152678754-e482f1ae-7a1c-4898-8342-da682203eace.PNG)
  ![testresult](https://user-images.githubusercontent.com/96788792/152678758-0e987886-968d-4a15-9087-88ceb3de3b4d.PNG)
	

</details>

####  주요 서비스

<!-- 백엔드 -->

	✅  피부 테스트를 통해 선정한 4가지 브랜드의 맞춤형 스킨 케어 제품을 제공
	✅  4가지 브랜드의 베스트 셀러들을 보여주는 기능
	✅  로그인하여 장바구니로 원하는 품목 관리가능


<br />
<br />


## 💡 프로젝트를 통해 느점 
<br />

### 배운점🧐
- 프론트엔드 & 백엔드 간의 의사소통 능력 향상
- Git, notion등을 활용한 협업 방법을 배울 수 있었다 https://www.notion.so/6cb50136ec434259ad3e63e2d2cc90d6
- CORS이슈 @CrossOrigin 어노테이션으로 해결
- 여러 연관관계에 있는 객체를 조회할때 무한으로 순환되며 조회가 되는 이슈 @JsonIgnore, Dto로 변환 하는 방식으로 해결

### 아쉬운점
- git 의 기능들을 제대로 활용하지 못했다. ( issue, PR, branch 전략 등 )
- jwt 방식 로그인을 도입했으면 좋았을 것 같았다.

<br />
