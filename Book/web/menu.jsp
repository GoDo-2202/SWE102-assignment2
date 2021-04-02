
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div id="templatemo_menu">
    <ul>
        <li><a href="home" class="current">Home</a></li>   
            <c:if test="${sessionScope.acc != null}">
            <li><a href="#">${sessionScope.acc.user}</a></li> 
            <li><a href="logout">Logout</a></li>
            </c:if>
            <c:if test="${sessionScope.acc == null}">
            <li><a href="Login.jsp">Login</a></li>
            </c:if>
            <c:if test="${sessionScope.acc.isAdmin == 1}">
            <li><a href="#">Manager Account</a></li>
            </c:if>
            <c:if test="${sessionScope.acc.issell == 1}">
            <li><a href="manager">Manager Product</a></li>
            </c:if>
        <li>
            <a class="btn btn-success btn-sm ml-3" href="show">
                <i class="fa fa-shopping-cart"></i> Cart
                <span class="badge badge-light">3</span>
            </a>
        </li>
        <form action="search" method="post">
            <div>
                <input value="${txtS}" name="txt" type="text" aria-label="Small" aria-describedby="inputGroup-sizing-sm" placeholder="Search...">
                <li><input type="submit" value="Search" id="buttonSearch"></li>
            </div>
        </form>
    </ul>
</div> <!-- end of menu -->

<div id="templatemo_header">
    <div id="templatemo_special_offers">
        <p>
            <span>50%</span> khi mua 10 cuốn
        </p>
        <a href="js/subpage.jsp" style="margin-left: 50px;">Read more...</a>
    </div>

    <div id="templatemo_new_books">
        <ul>
            <li><a href="">Tôi tài giỏi bản cũng thế</a></li>
            <li><a href="">Khéo ăn nói sẽ có đc thiên hạ</a></li>
            <li><a href="">Đánh thức con người phi thường trong bạn</a></li>
        </ul>
        <a href="js/subpage.jsp" style="margin-left: 50px;">Read more...</a>
    </div>
</div> <!-- end of header -->
