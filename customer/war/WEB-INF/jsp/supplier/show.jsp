<jsp:directive.include file="/WEB-INF/jsp/includes.jsp"/>
<jsp:directive.include file="/WEB-INF/jsp/header.jsp"/>
<div>
    <c:if test="${not empty result}">
        <div id="supplier_name">
            <label for="_name">Name:</label>
            <div class="box" id="_name">${result.name}</div>
        </div>
        <br/>
        <div id="supplier_url">
            <label for="_url">URL:</label>
            <div class="box" id="_url"><a href="${result.url}">${result.url}</a></div>
        </div>
        <br/>
    </c:if>
    <c:if test="${empty result}">No Supplier found with this id.</c:if>
</div>
<jsp:directive.include file="/WEB-INF/jsp/footer.jsp"/>
