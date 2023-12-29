# آشنایی با نحوه پروفایل برنامه (Profiling)

لینک git: <https://github.com/Negarnbkhti42/SE-Lab-profiling>
## اعضای گروه
نگار نوبختی - 98171201

پریمهر مرصع‌فر - 98171148

## شرح آزمایش

1. در بخش اول، عملیات profiling را بر روی کلاس JavaCup انجام دادیم. نتیجه به شکل زیر بود که نشان می‌داد تابع `temp` بیشترین منابع cpu را مصرف می‌کند. مخصوصا آنکه توابع `add` و `grow` مربوط به `ArrayList` بارها باید فراخوانی ‌می‌شدند.

![unoptimized JavaCup CPU](./assets/javacup-unoptimized-cpu.png)

همچنین در حافظه نیز از garbage collector استفاده می‌شد.

![unoptimized JavaCup memory](./assets/javacup-unoptimized-memory.png)

برای رفع این مشکل در تابع `temp` به جای `ArrayList` از یک آرایه دوبعدی استفاده کردیم که اندازه آنها از قبل مشخص است. بدین صورت تغییر اندازه‌ای در ساختار داده رخ نمی‌دهد و مصرف منابع کم می‌شود. پس از pofiling همین نتیجه مشاهده شد. مصرف garbage collector نیز تقریبا به صفر رسید.

![optimized JavaCup CPU](./assets/javacup-optimized-cup.png)

![optimized JavaCup memory](./assets/javacup-optimized-memory.png)