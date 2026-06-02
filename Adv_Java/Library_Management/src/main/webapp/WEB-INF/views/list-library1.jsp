<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>List of Books Available</title>
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
</head>
<body class="bg-slate-900 text-slate-100 font-sans min-h-screen flex flex-col justify-between selection:bg-indigo-500 selection:text-white">

    <div class="h-1.5 w-full bg-gradient-to-r from-teal-400 via-indigo-500 to-purple-600"></div>

    <main class="flex-1 w-full max-w-5xl mx-auto p-4 sm:p-6 lg:p-8 space-y-6">
        
           <div class="bg-slate-800/30 border border-slate-700/50 rounded-2xl overflow-hidden shadow-2xl backdrop-blur-sm">
            <div class="overflow-x-auto">
                <table class="w-full text-left border-collapse">
                    <thead>
                        <tr class="bg-slate-800/80 border-b border-slate-700/70 text-slate-400 text-xs font-bold uppercase tracking-wider">
                            <th class="px-6 py-4">Name</th>
                            <th class="px-6 py-4">Author Name</th>
                           <!--   <th class="px-6 py-4">Price</th>-->
                            <th class="px-6 py-4">No of Copies</th>
                           <!--  <th class="px-6 py-4 text-right">Actions</th> -->
                        </tr>
                    </thead>
                    <tbody class="divide-y divide-slate-800 text-sm text-slate-300">
                        <c:forEach var="tempLibrary" items="${thelibrary}">
                            <c:url var="updateLink" value="/library/showFormForUpdate">
                                <c:param name="libraryId" value="${tempLibrary.id}" />
                            </c:url>
                            <c:url var="deleteLink" value="/library/delete">
                                <c:param name="libraryId" value="${tempLibrary.id}" />
                            </c:url>
                            
                            <tr class="hover:bg-slate-800/40 transition-colors">
                                <td class="px-6 py-4 font-semibold text-white">${tempLibrary.name}</td> 
                                <td class="px-6 py-4 text-slate-400">${tempLibrary.authorName}</td>
                                <td class="px-6 py-4 font-mono font-medium text-teal-400">${tempLibrary.copies}</td>
                            </tr>
                        </c:forEach>
                        
                        <c:if test="${empty thelibrary}">
                            <tr>
                                <td colspan="4" class="px-6 py-10 text-center text-slate-500 text-sm italic">
                                    No books found in the registry catalog. Click "Add New Book" to populate.
                                </td>
                            </tr>
                        </c:if>
                    </tbody>
                </table>
            </div>
        </div>
    </main>

    <footer class="w-full text-center py-4 text-xs text-slate-600 border-t border-slate-800/50">
      Library Dashboard. All Rights Reserved.
    </footer>

</body>
</html>