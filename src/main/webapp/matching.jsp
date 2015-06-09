<%@ page import="mainpack.Items.Item"%>
<%@ page import="mainpack.BDD"%>

<html>

<head>

<meta charset=UTF-8>
<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

<title>Matching</title>
</head>

<%
	BDD bdd = new BDD();
	Item item = bdd.getRandomItem();
%>

<body>
	<div class="container">
	<div class='page-header'>
				<h1>Matching <small>Adopt 1 Com'</small></h1></div>
		<form action='/matching.jsp' method='post'>
			<div class="row">
				<div class="col-sm-6 col-md-4">
					<div class="thumbnail">
						<img src="http://static.openruby.com/assets/pages/d9/41/d9412a06dcc425bcc72a91c523749725_330.jpg" alt="image">
						<input type="hidden" id='iditem' name="idItem"  value="<%out.println(item.getIdt());%>">
						<input type="hidden"  id='itemtype' name="idType"  value="<%out.println(item.getType());%>">
						<div class="caption">
							<h3>
								<%out.println(item.getTitle());%>
							</h3>
							<p>
								<%out.println(item.renderHTML());%>
							</p>
							<p>
								<button type='submit' id='yes' class='btn btn-success btn-lg'>
									<span class="glyphicon glyphicon-heart"></span>
								</button>
								<button type='submit' id='no' class='btn btn-danger btn-lg'>
									<span class="glyphicon glyphicon-remove"></span>
								</button>
							</p>
						</div>
					</div>
				</div>
		</form>
	</div>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#yes").click(function() {postLike(true);	});
			$("#no").click(function() {postLike(false);	});
		});
		function postLike(aime) {
			$.ajax({
				type : 'POST',
				contentType : 'application/json',
				url : "v2/like/",
				dataType : "json",
				data : JSON.stringify({
					"userid" : 1,
					"itemid" : $("#iditem").val(),
					"itemtype" : $("#itemtype").val(),
					"aime": aime
				}),
				success : function(data, textStatus, jqXHR) {
					$(location).attr('href',"/matching.jsp");
				},
				error : function(jqXHR, textStatus, errorThrown) {
					alert('postUser error: ' + textStatus);
				}
			});
			
		}
	</script>
</body>