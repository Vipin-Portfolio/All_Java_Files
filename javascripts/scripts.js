const form = document.getElementById("form");
        const UserName = document.getElementById("UserName");
        const email = document.getElementById("email");
        const password = document.getElementById("password");
        const password2= document.getElementById("password2");
        form.addEventListener('submit', e =>{
            e.preventDefault   //prevent reloading
            checkInput();
        });
        function checkInput(){
            const usernameValue = UserName.value.trim();
            const emailValue = email.value.trim();
            const passwordValue = password.value.trim();
            const password2Value = password2.value.trim();
            if(usernameValue===''){
                setError(UserName,'UserName cannot Be Empty');
            }
            else{
                setSuccess(UserName);
            }
            if(emailValue==='')
            {
                setError(email,'Email Cannot Be Empty');
            }
            else if(!isEmail(emailValue))
            {
                setError(email,'Not A Vaild Email');
            }
            else{
                setSuccess(email);
            }
            if(passwordValue===''){
                setError(password,'Password cannot Be Empty');
            }
            else{
                setSuccess(password);
            }
            if(password2Value===''){
                setError(password2,'Password cannot Be Empty');
            }
            else if(passwordValue!== password2Value)
            {
                setError(password2,'Password Does Not Match');
            }
            else{
                setSuccess(password2);
            }
        }
        function isEmail(email){
            return  /^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/.test(email);
        }
        function setError(input,message){
            const formControl = input.parentElement;
            const small = formControl.querySelector('small');
            formControl.className = 'form-control error';
            small.innerText = message;
        }
        function setSuccess(){
            const formControl = input.parentElement;
            formControl.className = 'form-control success';
        }
