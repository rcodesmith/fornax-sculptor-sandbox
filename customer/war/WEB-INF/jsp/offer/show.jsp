<jsp:directive.include file="/WEB-INF/jsp/includes.jsp"/>
<jsp:directive.include file="/WEB-INF/jsp/header.jsp"/>
<div>
    <c:if test="${not empty inquiry}">
    	<p>Offer in response to <a href="<c:url value="/rest/inquiry/${inquiry.id.id}" />">inquiry</a>.</p>
        <div id="inquiry_message">
            <label for="_inquiry_message">Inquiry message:</label>
            <div class="box" id="_inquiry_message">${inquiry.message}</div>
        </div>
        <br/>
    </c:if>
    <c:if test="${empty inquiry}">No inquiry found with this id.</c:if>
    
    <c:if test="${not empty supplier}">
        <div id="supplier_name">
            <label for="_supplier_name">Offer from supplier:</label>
            <div class="box" id="_supplier_name">
             <a href="<c:url value="/rest/supplier/${supplier.id.id}" />">${supplier.name}</a>.</div>
        </div>
        <br/>
    </c:if>
    <c:if test="${empty supplier}">Unknown supplier.</c:if>
    <br/>
    <c:if test="${not empty offer}">
        <div id="offer_message">
            <label for="_offer_message">Offer:</label>
            <div class="box" id="_offer_message">${offer.message}</div>
        </div>
        <br/>
    </c:if>
    <c:if test="${empty offer}">No offer found with this id.</c:if>
</div>
<jsp:directive.include file="/WEB-INF/jsp/footer.jsp"/>
