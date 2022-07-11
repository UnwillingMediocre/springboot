<!doctype html>
<html lang="en">
    <#include "../common/head.ftl" />

    <body>
    <div id="app" style="margin: 20px 20%">
        欢迎登录，${user.name}！

        <p>${date?string('yyyyMMdd')}</p>


        <#list productList as product>
            <div>
                ${product.productNumber} -> ${product.name}
            </div>
        </#list>

    </div>
    </body>
</html>