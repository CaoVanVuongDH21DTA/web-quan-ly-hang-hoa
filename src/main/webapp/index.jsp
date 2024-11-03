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
							<a href="./index.jsp" class="gm-nav-link gm-nav-link-active"
								><ion-icon class="gm-nav-icon" name="pie-chart-outline"></ion-icon>Báo cáo doanh
								thu</a
							>
						</li>
						<li class="gm-nav-item">
							<a href="./stock.jsp" class="gm-nav-link"
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
					<div class="gm-quick-report">
						<div class="gm-card">
							<p class="gm-card-title">Doanh số</p>
							<p class="gm-card-number">10.2tr</p>
						</div>
						<div class="gm-card">
							<p class="gm-card-title">Mục tiêu ngày</p>
							<p class="gm-card-number">76%</p>
						</div>
						<div class="gm-card">
							<p class="gm-card-title">Doanh số luỹ kế tháng</p>
							<p class="gm-card-number">402.3tr</p>
						</div>
						<div class="gm-card">
							<p class="gm-card-title">Mục tiêu tháng</p>
							<p class="gm-card-number">82%</p>
						</div>
					</div>
					<div class="gm-report-box">
						<div class="gm-report-col">
							<table class="gm-table">
								<caption class="gm-table-title">
									Doanh số theo ngành hàng tuần
								</caption>
								<thead class="gm-table-head">
									<tr class="gm-table-row">
										<th>Ngành hàng</th>
										<th>Thứ 2</th>
										<th>Thứ 3</th>
										<th>Thứ 4</th>
										<th>Thứ 5</th>
										<th>Thứ 6</th>
										<th>Thứ 7</th>
										<th>CN</th>
										<th>Tổng cộng</th>
										<th>Tuần trước</th>
									</tr>
								</thead>
								<tbody>
									<tr class="gm-table-row">
										<td class="gm-table-cell">Thực phẩm tươi sống</td>
										<td class="gm-table-cell">1.75tr</td>
										<td class="gm-table-cell">1.61tr</td>
										<td class="gm-table-cell">1.55tr</td>
										<td class="gm-table-cell">1.74tr</td>
										<td class="gm-table-cell">1.74tr</td>
										<td class="gm-table-cell">2.30tr</td>
										<td class="gm-table-cell">2.22tr</td>
										<td class="gm-table-cell">12.99tr</td>
										<td class="gm-table-cell">112.9% (11.50tr)</td>
									</tr>
									<tr class="gm-table-row">
										<td class="gm-table-cell">Thực phẩm công nghệ</td>
										<td class="gm-table-cell">7.75tr</td>
										<td class="gm-table-cell">7.61tr</td>
										<td class="gm-table-cell">7.61tr</td>
										<td class="gm-table-cell">6.55tr</td>
										<td class="gm-table-cell">8.74tr</td>
										<td class="gm-table-cell">12.30tr</td>
										<td class="gm-table-cell">9.22tr</td>
										<td class="gm-table-cell">12.99tr</td>
										<td class="gm-table-cell">112.9% (11.50tr)</td>
									</tr>
									<tr class="gm-table-row">
										<td class="gm-table-cell">Hoá mỹ phẩm</td>
										<td class="gm-table-cell">3.75tr</td>
										<td class="gm-table-cell">2.61tr</td>
										<td class="gm-table-cell">2.55tr</td>
										<td class="gm-table-cell">2.55tr</td>
										<td class="gm-table-cell">2.74tr</td>
										<td class="gm-table-cell">2.30tr</td>
										<td class="gm-table-cell">3.22tr</td>
										<td class="gm-table-cell">12.99tr</td>
										<td class="gm-table-cell">112.9% (11.50tr)</td>
									</tr>
									<tr class="gm-table-row">
										<td class="gm-table-cell">Đồ gia dụng</td>
										<td class="gm-table-cell">0.75tr</td>
										<td class="gm-table-cell">0.75tr</td>
										<td class="gm-table-cell">0.61tr</td>
										<td class="gm-table-cell">0.55tr</td>
										<td class="gm-table-cell">1.30tr</td>
										<td class="gm-table-cell">0.22tr</td>
										<td class="gm-table-cell">0.82tr</td>
										<td class="gm-table-cell">12.99tr</td>
										<td class="gm-table-cell">112.9% (11.50tr)</td>
									</tr>
								</tbody>
								<tfoot>
									<tr class="gm-table-row">
										<th>Tổng cộng</th>
										<th>13tr</th>
										<th>13tr</th>
										<th>13tr</th>
										<th>13tr</th>
										<th>13tr</th>
										<th>13tr</th>
										<th>13tr</th>
										<th>155tr</th>
										<th>105% (145tr)</th>
									</tr>
								</tfoot>
							</table>
						</div>
					</div>

					<div class="gm-row-2">
						<div class="gm-report-box">
							<div class="gm-report-col">
								<table class="gm-table">
									<caption class="gm-table-title">
										Tops sản phẩm theo số lượng
									</caption>
									<thead class="gm-table-head">
										<tr class="gm-table-row">
											<th>Barcode</th>
											<th>Tên sản phẩm</th>
											<th>Số lượng bán ra</th>
										</tr>
									</thead>
									<tbody>
										<tr class="gm-table-row">
											<td class="gm-table-cell">2653400</td>
											<td class="gm-table-cell">Dầu ăn Green ACE 2L</td>
											<td class="gm-table-cell">34</td>
										</tr>
										<tr class="gm-table-row">
											<td class="gm-table-cell">2653400</td>
											<td class="gm-table-cell">Dầu ăn Green ACE 2L</td>
											<td class="gm-table-cell">34</td>
										</tr>
										<tr class="gm-table-row">
											<td class="gm-table-cell">2653400</td>
											<td class="gm-table-cell">Dầu ăn Green ACE 2L</td>
											<td class="gm-table-cell">34</td>
										</tr>
										<tr class="gm-table-row">
											<td class="gm-table-cell">2653400</td>
											<td class="gm-table-cell">Dầu ăn Green ACE 2L</td>
											<td class="gm-table-cell">34</td>
										</tr>
										<tr class="gm-table-row">
											<td class="gm-table-cell">2653400</td>
											<td class="gm-table-cell">Dầu ăn Green ACE 2L</td>
											<td class="gm-table-cell">34</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
						<div class="gm-report-box">
							<div class="gm-report-col">
								<table class="gm-table">
									<caption class="gm-table-title">
										Tops sản phẩm theo giá trị
									</caption>
									<thead class="gm-table-head">
										<tr class="gm-table-row">
											<th>Barcode</th>
											<th>Tên sản phẩm</th>
											<th>Doanh số</th>
										</tr>
									</thead>
									<tbody>
										<tr class="gm-table-row">
											<td class="gm-table-cell">2653400</td>
											<td class="gm-table-cell">Dầu ăn Green ACE 2L</td>
											<td class="gm-table-cell">2.716tr</td>
										</tr>
										<tr class="gm-table-row">
											<td class="gm-table-cell">2653400</td>
											<td class="gm-table-cell">Dầu ăn Green ACE 2L</td>
											<td class="gm-table-cell">2.716tr</td>
										</tr>
										<tr class="gm-table-row">
											<td class="gm-table-cell">2653400</td>
											<td class="gm-table-cell">Dầu ăn Green ACE 2L</td>
											<td class="gm-table-cell">2.716tr</td>
										</tr>
										<tr class="gm-table-row">
											<td class="gm-table-cell">2653400</td>
											<td class="gm-table-cell">Dầu ăn Green ACE 2L</td>
											<td class="gm-table-cell">2.716tr</td>
										</tr>
										<tr class="gm-table-row">
											<td class="gm-table-cell">2653400</td>
											<td class="gm-table-cell">Dầu ăn Green ACE 2L</td>
											<td class="gm-table-cell">2.716tr</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
					
				</div>
			</div>
		</div>
		<script src="./js/script.js"></script>
	</body>
</html>
