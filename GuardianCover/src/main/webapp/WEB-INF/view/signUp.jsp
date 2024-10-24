<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Guardian Cover</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body>
<section class="sign-up-form">
    <!-- component -->
    <div class="bg-grey-lighter min-h-screen flex flex-col">
        <div class="container max-w-sm mx-auto flex-1 flex flex-col items-center justify-center px-2">
            <div class="bg-white px-6 py-8 rounded shadow-md text-black w-full">
                <h1 class="mb-8 text-3xl text-center">Sign up</h1>
                <form method="post" enctype="application/x-www-form-urlencoded" action="${pageContext.request.contextPath}/sign-up">
                    <input
                            type="text"
                            class="block border border-grey-light w-full p-3 rounded mb-4"
                            name="firstName"
                            placeholder="First Name" />
                    <input
                            type="text"
                            class="block border border-grey-light w-full p-3 rounded mb-4"
                            name="lastName"
                            placeholder="Last Name" />

                    <input
                            type="email"
                            class="block border border-grey-light w-full p-3 rounded mb-4"
                            name="email"
                            placeholder="Email" />

                    <input
                            type="password"
                            class="block border border-grey-light w-full p-3 rounded mb-4"
                            name="password"
                            placeholder="Password" />

                    <input
                            type="text"
                            class="block border border-grey-light w-full p-3 rounded mb-4"
                            name="address"
                            placeholder="Address" />

                    <button
                            type="submit"
                            class="w-full text-center py-3 rounded bg-green text-white hover:bg-green-dark focus:outline-none my-1"
                    >Create Account</button>
                </form>

                <div class="text-center text-sm text-grey-dark mt-4">
                    By signing up, you agree to the
                    <a class="no-underline border-b border-grey-dark text-grey-dark" href="#">
                        Terms of Service
                    </a> and
                    <a class="no-underline border-b border-grey-dark text-grey-dark" href="#">
                        Privacy Policy
                    </a>
                </div>
            </div>

            <div class="text-grey-dark mt-6">
                Already have an account?
                <a class="no-underline border-b border-blue text-blue" href="${pageContext.request.contextPath}/login-form">
                    Log in
                </a>.
            </div>
        </div>
    </div>
</section>
</body>
