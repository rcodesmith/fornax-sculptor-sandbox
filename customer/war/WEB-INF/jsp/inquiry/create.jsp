<jsp:directive.include file="/WEB-INF/jsp/includes.jsp"/>
<jsp:directive.include file="/WEB-INF/jsp/header.jsp"/>
<div>
	<h2>New Request for Resources</h2>
    <form:form action="/rest/inquiry" method="POST" modelAttribute="inquiry">
        <div id="inquiry_message">
            <label for="_message">Message:</label>
            <form:textarea cssStyle="width:500px" id="_message" rows="3" cols="60" path="message"/>
            <br/>
            <form:errors cssClass="errors" id="_message" path="message"/>
        </div>
        <br/>
        <div class="submit" id="inquiry_submit">
            <input id="proceed" type="submit" value="Save"/>
        </div>
    </form:form>
</div>
<jsp:directive.include file="/WEB-INF/jsp/footer.jsp"/>
