<jsp:directive.include file="/WEB-INF/jsp/includes.jsp"/>
<jsp:directive.include file="/WEB-INF/jsp/header.jsp"/>
<div>
	<h2>New Offer for Inquiry: ${inquiry.id.id}</h2>
    <form:form action="/rest/inquiry/${inquiry.id.id}/offer" method="POST" modelAttribute="inquiry">
        <div id="offer_comment">
            <label for="offer_comment">comment:</label>
            <form:textarea cssStyle="width:500px" id="_offer_comment" rows="3" cols="60" path="offer.comment"/>
            <br/>
            <form:errors cssClass="errors" id="_comment" path="offer.comment"/>
        </div>
        <br/>
        <div id="offer_fee">
            <label for="offer_fee">fee:</label>
            <form:input id="_fee" path="offer.fee"/>
            <br/>
            <form:errors cssClass="errors" id="_fee" path="offer.fee"/>
        </div>
        <br/>
        
        <div class="submit" id="offer_submit">
            <input id="proceed" type="submit" value="Create Offer"/>
        </div>
    </form:form>
</div>
<jsp:directive.include file="/WEB-INF/jsp/footer.jsp"/>
