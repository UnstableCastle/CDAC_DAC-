<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Book Record Management</title>
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
</head>
<body class="bg-slate-900 text-slate-100 font-sans min-h-screen flex flex-col justify-between selection:bg-indigo-500 selection:text-white">

    <div class="h-1.5 w-full bg-gradient-to-r from-teal-400 via-indigo-500 to-purple-600"></div>

    <main class="flex-1 flex items-center justify-center p-6">
        <div class="max-w-md w-full bg-slate-800/50 border border-slate-700/50 rounded-2xl shadow-2xl backdrop-blur-sm overflow-hidden">
            
            <div class="bg-slate-800 border-b border-slate-700/60 p-6">
                <h2 class="text-xl font-bold text-white tracking-tight flex items-center gap-2">
                    <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.8" stroke="currentColor" class="w-5 h-5 text-indigo-400">
                        <path stroke-linecap="round" stroke-linejoin="round" d="M12 6.042A8.967 8.967 0 0 0 6 3.75c-1.052 0-2.062.18-3 .512v14.25A8.987 8.987 0 0 1 6 18c2.305 0 4.408.867 6 2.292m0-14.25a8.966 8.966 0 0 1 6-2.292c1.052 0 2.062.18 3 .512v14.25A8.987 8.987 0 0 0 18 18a8.967 8.967 0 0 0-6 2.292m0-14.25v14.25" />
                    </svg>
                    Book Record Management
                </h2>
                <p class="text-slate-400 text-xs mt-1">Fill out the information below to register or modify an archive.</p>
            </div>

            <div class="p-6">
                <form:form action="saveLibrary" modelAttribute="thelibrary" method="POST" class="space-y-5">
                    <form:hidden path="id" />
                    
                    <div class="space-y-1">
                        <label class="block text-xs font-semibold text-slate-400 uppercase tracking-wider">Book Name</label>
                        <form:input path="name" placeholder="Enter book title" class="w-full px-4 py-2.5 bg-slate-900 border border-slate-700 rounded-xl text-slate-200 placeholder-slate-600 focus:outline-none focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 text-sm transition-all" />
                    </div>

                    <div class="space-y-1">
                        <label class="block text-xs font-semibold text-slate-400 uppercase tracking-wider">Author Name</label>
                        <form:input path="authorName" placeholder="Enter author's full name" class="w-full px-4 py-2.5 bg-slate-900 border border-slate-700 rounded-xl text-slate-200 placeholder-slate-600 focus:outline-none focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 text-sm transition-all" />
                    </div>

                    <div class="space-y-1">
                        <label class="block text-xs font-semibold text-slate-400 uppercase tracking-wider">Price</label>
                        <form:input path="price" placeholder="0.00" class="w-full px-4 py-2.5 bg-slate-900 border border-slate-700 rounded-xl text-slate-200 placeholder-slate-600 focus:outline-none focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 text-sm transition-all" />
                    </div>

                    <div class="pt-2 flex flex-col sm:flex-row gap-3">
                        <input type="submit" value="Save Book" class="w-full sm:flex-1 px-5 py-2.5 bg-indigo-600 hover:bg-indigo-500 text-white font-medium text-sm rounded-xl transition-all shadow-lg shadow-indigo-600/10 cursor-pointer text-center" />
                        <a href="${pageContext.request.contextPath}/library/list" class="w-full sm:w-auto px-5 py-2.5 bg-slate-800 hover:bg-slate-700 border border-slate-700 rounded-xl text-slate-300 font-medium text-sm transition-all text-center">
                            Cancel
                        </a>
                    </div>
                </form:form>
            </div>
        </div>
    </main>

    <footer class="w-full text-center py-4 text-xs text-slate-600 border-t border-slate-800/50">
Library Dashboard. All Rights Reserved.
    </footer>

</body>
</html>