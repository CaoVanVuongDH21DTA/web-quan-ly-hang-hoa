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
							<a href="./index.jsp" class="gm-nav-link"
								><ion-icon class="gm-nav-icon" name="pie-chart-outline"></ion-icon>Báo cáo doanh
								thu</a
							>
						</li>
						<li class="gm-nav-item">
							<a href="./stock.jsp" class="gm-nav-link gm-nav-link-active"
								><ion-icon class="gm-nav-icon" name="storefront-outline"></ion-icon>Tồn kho cửa
								hàng</a
							>
						</li>
						<li class="gm-nav-item">
							<a href="./print-label.jsp" class="gm-nav-link"
								><ion-icon class="gm-nav-icon" name="barcode-outline"></ion-icon>Các chức năng in</a
							>
						</li>
						<li class="gm-nav-item">
							<a href="./product-exp.jsp" class="gm-nav-link"
								><ion-icon class="gm-nav-icon" name="pricetags-outline"></ion-icon>Kiểm soát HSD</a
							>
						</li>
						<li class="gm-nav-item">
							<a href="./supplier.jsp" class="gm-nav-link"
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
					<div class="gm-report-box">
						<div class="gm-report-col">
							<table class="gm-table">
								<caption class="gm-table-title">
									Tồn kho của cửa hàng
								</caption>
								<thead class="gm-table-head">
									<tr class="gm-table-row">
										<th>ID</th>
										<th>Tên sản phẩm</th>
										<th>ĐVT</th>
										<th>Tồn kho</th>
										<th>Giá trị tồn kho</th>
										<th>Nhà cung cấp</th>
									</tr>
								</thead>
								<tbody>
									<tr class="gm-table-row">
										<td class="gm-table-cell">10005045</td>
										<td class="gm-table-cell">Ô mai mơ chua mặn ngọt 200g</td>
										<td class="gm-table-cell">Hộp</td>
										<td class="gm-table-cell">2</td>
										<td class="gm-table-cell">106,364</td>
										<td class="gm-table-cell">Hồng Lam</td>
									</tr>
									<tr class="gm-table-row">
										<td class="gm-table-cell">10005123</td>
										<td class="gm-table-cell">Gạo tám Thái đỏ túi 5kg</td>
										<td class="gm-table-cell">G1</td>
										<td class="gm-table-cell">4</td>
										<td class="gm-table-cell">671,018</td>
										<td class="gm-table-cell">BẢO MINH</td>
									</tr>
									<tr class="gm-table-row">
										<td class="gm-table-cell">10005201</td>
										<td class="gm-table-cell">Kim chi cải thảo cắt lát 100g</td>
										<td class="gm-table-cell">G1</td>
										<td class="gm-table-cell">24</td>
										<td class="gm-table-cell">252,744</td>
										<td class="gm-table-cell">ÔNG KIM'S</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
		<script src="./js/script.js"></script>
	</body>
</html>
