# بازآرایی کد

## اعمال الگوی Facade:
این تکنیک برای ساده کردن رابط یک سیستم پیچیده با ارائه‌ی یک نقطه‌ی ورودی واحد و یکپارچه به سیستم استفاده می‌شود.
ایده‌ی پشت facade این است که تعداد کلاس‌ها و روش‌هایی را که یک کد کلاینت باید با آن‌ها تعامل داشته باشد، کاهش دهد و استفاده و درک سیستم را آسان‌تر کند.
الگوی Facade به عنوان یک واسطه بین کد مشتری و سیستم زیربنایی عمل می‌کند و پیچیدگی‌های سیستم را در پشت یک رابط ساده و کاملاً تعریف شده پنهان می‌کند.
### مورد اول: CodeGenerator
در اینجا برای کلاس CodeGenerator یک facade ایجاد شده و استفاده شده است:

<img width="886" alt="Screenshot 1402-05-20 at 18 17 03" src="https://github.com/fatemeh-asgari/SELab4/assets/59364998/39419147-0a24-4e50-90b7-0ceaee4a5912">

<img width="1348" alt="Screenshot 1402-05-20 at 18 17 25" src="https://github.com/fatemeh-asgari/SELab4/assets/59364998/c66d301a-8944-486e-a609-86bf344a9e8b">

<img width="1359" alt="Screenshot 1402-05-20 at 18 17 37" src="https://github.com/fatemeh-asgari/SELab4/assets/59364998/92b718e4-4a31-4e3c-a8a4-a6e6fff6ec5c">

<img width="1355" alt="Screenshot 1402-05-20 at 18 18 11" src="https://github.com/fatemeh-asgari/SELab4/assets/59364998/7277a1ef-b0f1-457c-8f2f-26dc35fb1a5b">

### مورد دوم: Memory
در اینجا برای کلاس Memory یک facade ایجاد شده و استفاده شده است:

<img width="1363" alt="Screenshot 1402-05-20 at 18 47 12" src="https://github.com/fatemeh-asgari/SELab4/assets/59364998/022361d5-f4c7-4e5d-a781-1037810682b8">

<img width="1359" alt="Screenshot 1402-05-20 at 18 47 42" src="https://github.com/fatemeh-asgari/SELab4/assets/59364998/ce2f06ef-efd5-4a69-a82b-4594f025a63b">

<img width="1360" alt="Screenshot 1402-05-20 at 18 48 24" src="https://github.com/fatemeh-asgari/SELab4/assets/59364998/1fa54618-ccdc-495f-8fad-dc3f1e32fb26">

<img width="1339" alt="Screenshot 1402-05-20 at 18 48 50" src="https://github.com/fatemeh-asgari/SELab4/assets/59364998/b8b8c342-9cd0-4f83-8f1a-b8daa217fedb">

<img width="1343" alt="Screenshot 1402-05-20 at 18 49 06" src="https://github.com/fatemeh-asgari/SELab4/assets/59364998/15def6bb-12c6-4b0b-9743-0022792cedd4">

## استفاده از Polymorphism به جای شرط:
داشتن switch-caseها در کد جزو مواردی است که باید بازآرایی شود. این هنگامی رخ می‌دهد که ما یک شرطی داریم که بسته به نوع شی یا خصوصیات، اعمال مختلفی را انجام می دهد. برای اصلاح آن باید کلاس‌های فرعی مطابق با شاخه‌های شرطی ایجاد کنیم. در آن‌ها یک متد اشتراکی ایجاد کنیم و کد را از شاخه مربوط به شرط به آن منتقل کنیم. سپس شرط را با فراخوانی متد مربوطه جایگزین کنیم. در فایل Address.java یک نمونه از این کار با ساختن یک اینترفیس به نام TypeAddress صورت گرفته است:

<img width="1360" alt="Screenshot 1402-05-20 at 20 19 47" src="https://github.com/fatemeh-asgari/SELab4/assets/59364998/904df9cb-e725-488f-8cb9-8a56b47b7079">

<img width="1357" alt="Screenshot 1402-05-20 at 20 20 05" src="https://github.com/fatemeh-asgari/SELab4/assets/59364998/b7d7467c-edfa-4d9b-a598-d05bf18ba6b3">

<img width="1357" alt="Screenshot 1402-05-20 at 20 20 13" src="https://github.com/fatemeh-asgari/SELab4/assets/59364998/c3fb87cc-670b-4d17-aea5-645aefa961f7">

<img width="1356" alt="Screenshot 1402-05-20 at 20 20 19" src="https://github.com/fatemeh-asgari/SELab4/assets/59364998/926378b5-3fa7-4986-b4e6-0392b809e2b3">

<img width="1351" alt="Screenshot 1402-05-20 at 20 20 40" src="https://github.com/fatemeh-asgari/SELab4/assets/59364998/8e882470-7212-42dd-9814-d1e15407c4c0">

سپس در فایل‌های دیگر هم تغییرات لازم اعمال شده است:

<img width="1065" alt="Screenshot 1402-05-20 at 22 47 17" src="https://github.com/fatemeh-asgari/SELab4/assets/59364998/6ce44ab5-21ec-4545-8359-5966c51d988a">

<img width="1057" alt="Screenshot 1402-05-20 at 22 49 01" src="https://github.com/fatemeh-asgari/SELab4/assets/59364998/a37aa59b-72b0-4268-8c25-5354a112a17e">

## جدا کردن query از modifier:
این بازآرایی زمانی انجام می‌شود که متدی داریم که مقداری را برمی‌گرداند اما چیزی را در داخل یک شی نیز تغییر می‌دهد. این کار به این شکل انجام می‌شود که متد به دو متد جداگانه تقسیم می‌شود. همانطور که انتظار می‌رود، یکی از آن‌ها باید مقدار را برگرداند و دیگری شی را تغییر دهد. یک نمونه از این بازآرایی در کلاس Memory انجام شده است:

<img width="1356" alt="Screenshot 1402-05-20 at 20 36 16" src="https://github.com/fatemeh-asgari/SELab4/assets/59364998/69446dfa-6cfd-41ce-952f-5215e96788b5">

سپس در جاهای لازم در پروژه، تغییرات به این شکل اعمال شده است:

<img width="1359" alt="Screenshot 1402-05-20 at 20 36 30" src="https://github.com/fatemeh-asgari/SELab4/assets/59364998/fb660d92-a69b-4872-9b7f-f1244bcf7862">

## اعمال Self Encapsulate Field:
این بازآرایی بیان می‌کند که نباید از دسترسی مستقیم به فیلدهای خصوصی در داخل یک کلاس استفاده کرد بلکه باید یک getter برای فیلد ایجاد کرد و فقط از آن برای دسترسی به فیلد استفاده کرد. یک نمونه از این بازآرایی در کلاس Address انجام شده است:

<img width="1058" alt="Screenshot 1402-05-20 at 23 02 47" src="https://github.com/fatemeh-asgari/SELab4/assets/59364998/d35703c3-a7b2-4bcc-83d3-7aa1d5652d1f">

سپس در جاهای لازم در پروژه، تغییرات اعمال شده است:

<img width="1352" alt="Screenshot 1402-05-20 at 21 02 34" src="https://github.com/fatemeh-asgari/SELab4/assets/59364998/f0fa0f06-0cd8-40d4-b375-e6dc582df719">

## استفاده از Polymorphism به جای شرط:
این بازآرایی در بالاتر توضیح داده شده است. در اینجا یک نمونه‌ی دیگر از آن در کلاس Action اعمال شده است:

<img width="1329" alt="Screenshot 1402-05-20 at 21 40 57" src="https://github.com/fatemeh-asgari/SELab4/assets/59364998/ef802a0b-9d6d-4cc1-bc7d-b1815ede6524">

<img width="1335" alt="Screenshot 1402-05-20 at 21 41 13" src="https://github.com/fatemeh-asgari/SELab4/assets/59364998/159cbd26-58d3-4760-ae50-00b6a5d61b4d">

سپس تغییرات لازم در پروژه اعمال شده است:

<img width="1352" alt="Screenshot 1402-05-20 at 21 41 26" src="https://github.com/fatemeh-asgari/SELab4/assets/59364998/b3ca59e8-4e10-4fa7-a23b-c25d911c58b9">

<img width="1352" alt="Screenshot 1402-05-20 at 21 42 23" src="https://github.com/fatemeh-asgari/SELab4/assets/59364998/2b88b530-522b-4787-a650-002767b8dfb6">

## جدا کردن query از modifier:
این بازآرایی که در بالاتر توضیح داده شد، یک بار دیگر در کلاس Memory انجام شده است و سپس تغییرات لازم در پروژه اعمال شده است:

<img width="1060" alt="Screenshot 1402-05-20 at 23 11 00" src="https://github.com/fatemeh-asgari/SELab4/assets/59364998/7bc70383-4cac-4c01-a853-6f369ae7002e">

<img width="1059" alt="Screenshot 1402-05-20 at 23 11 11" src="https://github.com/fatemeh-asgari/SELab4/assets/59364998/b6d544b8-0fbb-448f-915a-ea65b59e49fa">

<img width="1061" alt="Screenshot 1402-05-20 at 23 11 25" src="https://github.com/fatemeh-asgari/SELab4/assets/59364998/988a8011-1d27-4976-bf74-1c2f6dd0e186">
