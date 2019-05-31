<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head>
<base href="${pageContext.request.contextPath }/" />
<title>편지</title>
</head>
<body>
	<h2>글 보기</h2>
	<p>
		<span>${letter.letterId }</span> | <span style="font-weight: bold;">${letter.title }</span> | <span>${letter.cdate }</span>
	</p>
	<p>
		 <span>${letter.senderId }</span> | <span>${letter.senderName }</span>
	</p>	
	<hr />
	<p>
		 <span>${letter.receiverId }</span> | <span>${letter.receiverName }</span>
	</p>	
	<hr />
	<p>${letter.contentHtml }</p>
	<hr />
</body>
</html>