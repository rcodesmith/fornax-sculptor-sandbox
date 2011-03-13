<jsp:directive.include file="/WEB-INF/jsp/includes.jsp"/>
<jsp:directive.include file="/WEB-INF/jsp/header.jsp"/>
<div>
    <c:if test="${not empty result}">
        <div id="salesman_name">
            <label for="_name">Name:</label>
            <div class="box" id="_name">${result.name}</div>
        </div>
        <br/>
        <div id="salesman_emailAddress">
            <label for="_emailAddress">Email:</label>
            <div class="box" id="_emailAddress">${result.emailAddress}</div>
        </div>
        <br/>
    </c:if>
    <c:if test="${empty result}">No Salesman found with this id.</c:if>
</div>
<jsp:directive.include file="/WEB-INF/jsp/footer.jsp"/>
