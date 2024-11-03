<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="UTF-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<title>Hệ thống quản lý vận hành Green Mart</title>
		<link rel="icon" href="./images/favicon.svg" type="image/x-icon" />

		<!-- Icon -->
		<script
			type="module"
			src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"
		></script>
		<script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>

		<!-- Fonts -->
		<link rel="preconnect" href="https://fonts.googleapis.com" />
		<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
		<link
			href="https://fonts.googleapis.com/css2?family=Lexend:wght@100..900&family=Montserrat:ital,wght@0,100..900;1,100..900&family=Raleway:ital,wght@0,100..900;1,100..900&display=swap"
			rel="stylesheet"
		/>
		<!-- CSS -->
		<link rel="stylesheet" href="./css/app.css" />
	</head>
	<body>
		<div class="wrapper">
			<div class="gm-login-main">
				<div class="gm-logo">
					<img src="./images/logo.svg" alt="Green Mart" />
				</div>
				<form action="login" class="form-login"	method="post">
					<h2 class="heading-2">Hệ Thống Quản Lý</h2>
					<div class="form-field">
						<input name = "username" id="username" type="text" placeholder="Tên đăng nhập" required />
					</div>
					<div id="password" class="form-field form-password-box">
						<input name = "password" type="password" placeholder="Mật khẩu" required />
						<ion-icon class="form-password-box-icon" name="eye-outline"></ion-icon>
					</div>
					<input type="submit" value="ĐĂNG NHẬP" class="form-submit" />
				</form>
			</div>
		</div>
		<script src="./js/script.js"></script>
	</body>
</html>
