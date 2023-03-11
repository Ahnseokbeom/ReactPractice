import axios from 'axios'
import React, { useState } from 'react'

export default function SignUp() {
    const [reqResult, setreqRseult] = useState<String>('');
    const signUpHandler = ()=>{
        const data = {
            "userEmail" : "asb0312@gmail.com",
            "userPassword" : "1234",
            "userPasswordCheck" : "1234",
            "userNickname" : "seokbeom",
            "userPhone" : "010-1111-2222",
            "userAddress" : "대한민국 서울",
            "userAddressDetail" : "온수동"
        }
        axios.post('http://localhost:4000/api/auth/signUp',data)
        .then((res)=>{
            setreqRseult("Success!!")
        }).catch((err)=>{
            setreqRseult("Failed!!")
        })
    }
  return (
    <div>
        <h3>{reqResult}</h3>
        <button onClick={()=>signUpHandler}>회원가입</button>
    </div>
  )
}
