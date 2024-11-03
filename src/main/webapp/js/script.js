// SHOW/HIDE PASSWORD
const showPw = document.querySelectorAll(".form-password-box-icon"),
	inputPws = document.querySelectorAll(".form-password-box input");

showPw.forEach((eyeIcon) => {
	eyeIcon.addEventListener("click", () => {
		inputPws.forEach((inputPw) => {
			if (inputPw.type === "password") {
				inputPw.type = "text";
				eyeIcon.name = "eye-off-outline";
			} else {
				inputPw.type = "password";
				eyeIcon.name = "eye-outline";
			}
		});
	});
});