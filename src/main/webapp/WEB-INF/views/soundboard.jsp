<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body>
	<tiles:insertDefinition name="soundboardTemplate">
		<tiles:putAttribute name="body">
			<div class="container">
				<div class="row">
					<c:forEach var="sound" items="${sounds}">
						<div class="audio-wrapper col-xs-4 col-sm-2">
							<audio name=${sound.id} id=${sound.id}>
								<source src=${sound.fileLocation} type='audio/wav' />
							</audio>
							<button id="pButton" class="play"></button>
							<label class="sound-label" for="pButton">${sound.friendlyTitle}</label>
						</div>
					</c:forEach>
				</div>
			</div>
		</tiles:putAttribute>
	</tiles:insertDefinition>
</body>