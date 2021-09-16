<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>signUp</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
<div class="container">
        <div class="row justify-content-center align-items-center" style="height:100vh">
            <div class="col-4">
                <div class="card">
                    <div class="card-body">
                        <form id="signup" action="insertUser.do" autocomplete="off" method="post">
                            <div class="form-group">
                                <input placeholder="NAME" type="text" class="form-control" name="userName"/>
                            </div>
                            <div class="form-group">
                                <input placeholder="PW" type="password" class="form-control" name="userPassword"/>
                            </div>
                            <button type="button" id="sendSignup" class="btn btn-primary">signup</button>
                            <button type="button" id="back" class="btn btn-primary">back</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>

<script type="text/javascript">
	
	$(document).on('click', '#sendSignup', function(e) {
			if(confirm("회원가입 하시겠습니까 ?") == true)
			{
				$("#signup").submit();
			}
			else
			{
				return ;
			}
	});

	//이전 클릭 시 testList로 이동
	$("#back").click(function javascript_onclikc() {
		$(location).attr('href', 'testList.do');
	});
</script>

</html>
