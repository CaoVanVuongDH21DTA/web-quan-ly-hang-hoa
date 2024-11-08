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
			<div class="gm-home-main">
				<div class="gm-menu-left">
					<div class="gm-logo">
						<img src="./images/logo.svg" alt="Green Mart" />
					</div>
					<ul class="gm-nav-list">
						<li class="gm-nav-item">
							<a href="./index" class="gm-nav-link"
								><ion-icon class="gm-nav-icon" name="pie-chart-outline"></ion-icon>Báo cáo doanh
								thu</a
							>
						</li>
						<li class="gm-nav-item">
							<a href="./stock" class="gm-nav-link"
								><ion-icon class="gm-nav-icon" name="storefront-outline"></ion-icon>Tồn kho cửa
								hàng</a
							>
						</li>
						<li class="gm-nav-item">
							<a href="./print-label.jsp" class="gm-nav-link gm-nav-link-active"
								><ion-icon class="gm-nav-icon" name="barcode-outline"></ion-icon>Các chức năng in</a
							>
						</li>
						<li class="gm-nav-item">
							<a href="./product-exp" class="gm-nav-link"
								><ion-icon class="gm-nav-icon" name="pricetags-outline"></ion-icon>Kiểm soát HSD</a
							>
						</li>
						<li class="gm-nav-item">
							<a href="./supplier" class="gm-nav-link"
								><ion-icon class="gm-nav-icon" name="car-outline"></ion-icon>Thông tin NCC</a
							>
						</li>
						<li class="gm-nav-item">
							<a href="./login.jsp" class="gm-nav-link"
								><ion-icon class="gm-nav-icon" name="exit-outline"></ion-icon>Đăng xuất</a
							>
						</li>
					</ul>
				</div>
				<div class="gm-content">
					<h2 class="heading-2">Chào, Green Mart 1266 Kha Vạn Cân!</h2>
				</div>
			</div>
		</div>
		<script src="./js/script.js"></script>
	</body>
</html>
