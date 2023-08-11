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
