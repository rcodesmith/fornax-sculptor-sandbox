<jsp:directive.include file="/WEB-INF/jsp/includes.jsp"/>
<jsp:directive.include file="/WEB-INF/jsp/header.jsp"/>
<c:if test="${not empty systemMessage}">
<div id="_systemMessage">
${systemMessage}
</div>
</c:if>
<div>
    <c:if test="${not empty result}">
        <div id="inquiry_id">
            <label for="_id">ID:</label>
            <div class="box" id="_id">${result.id}</div>
        </div>
        <div id="inquiry_message">
            <label for="_message">Message:</label>
            <div class="box" id="_message">${result.message}</div>
        </div>
        <div id="inquiry_customer">
            <label for="_customer">Customer:</label>
            <div class="box" id="_customer">${result.customer}</div>
        </div>
        <div id="inquiry_replyUrl">
            <label for="_replyUrl">Reply Url:</label>
            <div class="box" id="_replyUrl">${result.replyUrl}</div>
        </div>
    </c:if>
    <c:if test="${not empty result.offer.fee}">
    	<div id="inquiry_offeredBy">
    		<label for="_offeredBy">Offered by:</label>
    		<div class="box" id="_offeredBy">${result.offer.givenBy}</div>
    	</div>
    	<div id="inquiry_fee">
    		<label for="_fee">Fee:</label>
    		<div class="box" id="_fee">${result.offer.fee}</div>
    	</div>
    	<div id="inquiry_comment">
    		<label for="_comment">Comment:</label>
    		<div class="box" id="_comment">${result.offer.comment}</div>
    	</div>
	    <c:if test="${empty result.offer.isSent}">
    	<div class="submit" id="offerReply_submit">
            <input id="proceed" type="button" value="Send offer to customer" onclick="location.href='/rest/inquiry/${inquiry.id.id}/offer?sendToCustomer=true'"/>
        </div>
        </c:if>
    </c:if>
    <c:if test="${empty result.offer.fee}">
    	<a href="/rest/inquiry/${result.id.id}/offer/form">Create offer for inquiry</a>
	</c:if>    
    <c:if test="${empty result}">No Request found with this id.</c:if>
</div>
<jsp:directive.include file="/WEB-INF/jsp/footer.jsp"/>
