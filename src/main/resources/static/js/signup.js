document.getElementById("check-email-btn").addEventListener("click", function(){

    const email = document.getElementById("email");

    if(!email){
        alert("이메일을 입력하세요.")
        return;
    }

    fetch("/api/email/send", {
        method : "POST",
        headers: {"Content-Type" : "application/json"},
        body: JSON.stringify({email:email})
    })
    .then(response => {
        if(!response.ok){
            throw new Error("서버 오류");
        }
        return response.text();
    })
    .then(message => alert(message))
    .catch(error => {
        console.error("Error:", error);
        alert("이메일 전송에 실패했습니다.");
    });
    
});