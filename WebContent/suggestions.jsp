<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <style media="screen">
      #TutorsDiv{
        text-align: center;
      }
      .tutorDiv{
        background-color: orange;
        color: white;
        border-radius: 25px;
      }
    </style>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <meta charset="utf-8">
    <title>test</title>
  </head>
  <body>

    <div id="TutorsDiv">
      <form class="" action="index.html" method="post">
        <input id="searchTerm" type="text" name="name" value="">
        <input onClick="clickAlchemy()" type="button" name="submit" value="Submit">
      </form>
    </div>
    <script type="text/javascript">
 

    function renderResults(results)
    {
      var tutorArray = JSON.parse(results);
      var element = document.getElementById("TutorsDiv");
      for(var i = 0; i < tutorArray.length; i++){
        element.innerHTML +='<div class="tutorDiv"> <h3>' + tutorArray[i].name + '</h3><img src="' + tutorArray[i].picture + '" height="90" width="90"><div class="subject">Subject: ' + tutorArray[i].subject + '</div> <div class="school"> School: ' + tutorArray[i].school + '</div><div class="posReviews">Positive Reviews: ' + tutorArray[i].numPosReviews + '  </div>';
      }
      console.log(results);
    }
</html>
