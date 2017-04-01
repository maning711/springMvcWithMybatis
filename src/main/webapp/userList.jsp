<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<body>
<h2>Hello World!</h2>

<div>
    ${data.title}
</div>
<div>
    <c:forEach var="lists" items="${data.list}">
        <div>${lists.username}</div>
    </c:forEach>
</div>
</body>
</html>
