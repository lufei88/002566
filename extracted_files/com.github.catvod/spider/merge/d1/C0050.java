package com.github.catvod.spider.merge.d1;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.LocaleList;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.github.catvod.spider.AList;
import com.github.catvod.spider.ApplvDV2;
import com.github.catvod.spider.FishHxq;
import com.github.catvod.spider.HBDmSou;
import com.github.catvod.spider.HBlingDu;
import com.github.catvod.spider.HBmengya;
import com.github.catvod.spider.HBtiantianv3;
import com.github.catvod.spider.HBv1Class;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Quark;
import com.github.catvod.spider.Star;
import com.github.catvod.spider.Xb6v;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.E0.o;
import com.github.catvod.spider.merge.F0.AbstractC0151h;
import com.github.catvod.spider.merge.F0.C0148e;
import com.github.catvod.spider.merge.F0.C0166x;
import com.github.catvod.spider.merge.F0.K;
import com.github.catvod.spider.merge.F0.L;
import com.github.catvod.spider.merge.F0.S;
import com.github.catvod.spider.merge.H0.d;
import com.github.catvod.spider.merge.H0.f;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.K0.b;
import com.github.catvod.spider.merge.K0.c;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.U.n;
import com.github.catvod.spider.merge.U0.C0176b;
import com.github.catvod.spider.merge.U0.E;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V0.p;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.h;
import com.github.catvod.spider.merge.W.q;
import com.github.catvod.spider.merge.W.t;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0232A;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.C0259u;
import com.github.catvod.spider.merge.a0.M;
import com.github.catvod.spider.merge.a0.O;
import com.github.catvod.spider.merge.a0.T;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d.C0268c;
import com.github.catvod.spider.merge.d.C0269d;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.e0.C0288g;
import com.github.catvod.spider.merge.e0.ViewOnKeyListenerC0283b;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.g0.g;
import com.github.catvod.spider.merge.h0.C0335o;
import com.github.catvod.spider.merge.h0.w;
import com.github.catvod.spider.merge.h0.x;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.InterfaceC0364a;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.t0.AbstractC0368a;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.P.B;
import com.github.catvod.spider.p000mergexbpq.P.C;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.l0;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.r;
import com.github.catvod.spider.p000mergexbpq.d.e;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.zip.Inflater;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.d1.ۤۡۡ۠, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0050 {

    /* renamed from: ۣ۟ۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int f771 = 741;

    /* renamed from: ۟۟۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static String m8066(Object obj) {
        if (C0038.m6471() > 0) {
            return ((Xb6v) obj).b;
        }
        return null;
    }

    /* renamed from: ۟۟۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static String[] m8067() {
        if (C0028.m5152() <= 0) {
            return E.m;
        }
        return null;
    }

    /* renamed from: ۟۟ۡۡۥ, reason: not valid java name and contains not printable characters */
    public static ImageButton m8068(Object obj) {
        if (C0023.m4566() < 0) {
            return ((q) obj).e;
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static SharedPreferences.Editor m8069(Object obj) {
        if (C0005.m1599() <= 0) {
            return ((SharedPreferences) obj).edit();
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static String m8070(Object obj) {
        if (C0009.m2047() > 0) {
            return ((HBv1Class) obj).c;
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m8071(Object obj) {
        if (C0009.m2047() >= 0) {
            ((o) obj).f();
        }
    }

    /* renamed from: ۟۟ۨۦ۟, reason: not valid java name and contains not printable characters */
    public static String m8072() {
        if (C0025.m4797() > 0) {
            return "ssmoshi";
        }
        return null;
    }

    /* renamed from: ۣ۟۠۟۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m8073(Object obj) {
        if (C0041.m6823() < 0) {
            return ((p) obj).c;
        }
        return null;
    }

    /* renamed from: ۟۠ۢۧۨ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.G.a m8074(Object obj, Object obj2) {
        if (C0057.m9017() >= 0) {
            return ((AList) obj).c((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static void m8075(Object obj, int i) {
        if (C0064.m9659() <= 0) {
            ((AccessibilityNodeInfo) obj).setInputType(i);
        }
    }

    /* renamed from: ۟۠ۤۦۤ, reason: not valid java name and contains not printable characters */
    public static String m8076() {
        if (C0005.m1599() <= 0) {
            return "parse";
        }
        return null;
    }

    /* renamed from: ۟۠ۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m8077(Object obj) {
        if (C0058.m9131() < 0) {
            return ((M) obj).s;
        }
        return null;
    }

    /* renamed from: ۟۠ۦۧۡ, reason: not valid java name and contains not printable characters */
    public static l0 m8078(Object obj, Object obj2, Object obj3) {
        if (C0063.m9589() <= 0) {
            return ((l0) obj).d((B) obj2, (C) obj3);
        }
        return null;
    }

    /* renamed from: ۟۠ۧۨۦ, reason: not valid java name and contains not printable characters */
    public static String m8079(Object obj) {
        if (C0032.m5686() < 0) {
            return ((com.github.catvod.spider.merge.Q.a) obj).b();
        }
        return null;
    }

    /* renamed from: ۟ۡ۟۟, reason: not valid java name and contains not printable characters */
    public static int m8080(Object obj) {
        if (C0006.m1726() <= 0) {
            return ((LocaleList) obj).size();
        }
        return 0;
    }

    /* renamed from: ۣ۟ۡ۟۟, reason: not valid java name and contains not printable characters */
    public static void m8081(Object obj) {
        if (C0009.m2047() > 0) {
            ((n) obj).e();
        }
    }

    /* renamed from: ۟ۡۢۡۥ, reason: not valid java name and contains not printable characters */
    public static void m8082() {
        if (C0024.m4693() < 0) {
            Init.checkPermission();
        }
    }

    /* renamed from: ۟ۡۥۡۨ, reason: not valid java name and contains not printable characters */
    public static void m8083(Object obj, int i) {
        if (C0041.m6823() <= 0) {
            ((d) obj).a(i);
        }
    }

    /* renamed from: ۟ۡۧۡۨ, reason: not valid java name and contains not printable characters */
    public static C0288g m8084(Object obj) {
        if (C0030.m5375() > 0) {
            return ((ViewOnKeyListenerC0283b) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۢ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static String m8085(Object obj, Object obj2) {
        if (C0021.m4379() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.b.p) obj).p((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۨۧ, reason: not valid java name and contains not printable characters */
    public static String[][] m8086(Object obj) {
        if (C0015.m3433() > 0) {
            return ((DateFormatSymbols) obj).getZoneStrings();
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۧۤ, reason: not valid java name and contains not printable characters */
    public static int m8087(Object obj) {
        if (C0029.m5282() > 0) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: ۟ۢۨۨ۟, reason: not valid java name and contains not printable characters */
    public static Object m8088(Object obj) {
        if (C0032.m5686() < 0) {
            return Collections.max((Collection) obj);
        }
        return null;
    }

    /* renamed from: ۣۣ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0364a m8089(Object obj) {
        if (C0055.m8740() > 0) {
            return ((AbstractC0368a) obj).getCompletion();
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m8090(int i, Object obj) {
        if (C0016.m3596() <= 0) {
            return c.a(i, (b) obj);
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static String m8091() {
        if (C0022.m4497() >= 0) {
            return "/proxy?${input.name}=${value}`;\n            window.location.href = url;\n        });\n\n        // 搜索建议功能\n        const searchInput = document.querySelector('input[type=\"text\"]');\n        const suggestions = document.getElementById('searchSuggestions');\n        const popularSearches = [\n            '凡人修仙传', '斗罗大陆', '完美世界', '斗破苍穹', '武动乾坤',\n            '星辰变', '盘龙', '吞噬星空', '遮天', '圣墟'\n        ];\n\n        searchInput.addEventListener('input', function() {\n            const value = this.value.trim();\n            if (value.length > 0) {\n                const filtered = popularSearches.filter(item => \n                    item.toLowerCase().includes(value.toLowerCase())\n                ).slice(0, 5);\n                \n                if (filtered.length > 0) {\n                    suggestions.innerHTML = filtered.map(item => \n                        `<div class=\"suggestion-item\" data-value=\"${item}\">${item}<\\/div>`\n                    ).join('');\n                    suggestions.style.display = 'block';\n                } else {\n                    suggestions.style.display = 'none';\n                }\n            } else {\n                suggestions.style.display = 'none';\n            }\n        });\n\n        // 点击建议项\n        suggestions.addEventListener('click', function(e) {\n            if (e.target.classList.contains('suggestion-item')) {\n                searchInput.value = e.target.dataset.value;\n                suggestions.style.display = 'none';\n                searchInput.focus();\n            }\n        });\n\n        // 点击外部隐藏建议\n        document.addEventListener('click', function(e) {\n            if (!searchInput.contains(e.target) && !suggestions.contains(e.target)) {\n                suggestions.style.display = 'none';\n            }\n        });\n\n\n        // 自动为平台标签添加对应class\n        document.addEventListener('DOMContentLoaded', function() {\n            const movieContainer = document.querySelector('.movie-container');\n            const resultsHeader = document.getElementById('resultsHeader');\n            const resultsCount = document.getElementById('resultsCount');\n            \n\n            const tags = document.querySelectorAll('.movie-tag');\n            tags.forEach(tag => {\n                const text = tag.textContent.trim().toLowerCase();\n                \n                // 根据文本内容添加对应class\n                if (text.includes('优酷') || text.includes('youku')) {\n                    tag.classList.add('youku');\n                } else if (text.includes('奇艺') || text.includes('iqiyi')) {\n                    tag.classList.add('iqiyi');\n                } else if (text.includes('QQ') || text.includes('腾讯')) {\n                    tag.classList.add('qq');\n                } else if (text.includes('芒果') || text.includes('mgtv')) {\n                    tag.classList.add('mgtv');\n                } else if (text.includes('哔哩') || text.includes('bilibili') || text.includes('b站')) {\n                    tag.classList.add('bilibili');\n                } else if (text.includes('360')) {\n                    tag.classList.add('platform360');\n                }\n            });\n\n            // 可选：为热门剧集添加HOT标签（示例）\n            const movies = document.querySelectorAll('.movie');\n            movies.forEach((movie, index) => {\n                // 示例：第一个结果显示hot标签\n                if (index === 0) {\n                    const link = movie.querySelector('a');\n                    if (link && !link.querySelector('.hot-badge')) {\n                        const hotBadge = document.createElement('div');\n                        hotBadge.className = 'hot-badge';\n                        hotBadge.textContent = 'HOT';\n                        link.appendChild(hotBadge);\n                    }\n                }\n            });\n        });\n  </script>\n</body>\n</html>\n";
        }
        return null;
    }

    /* renamed from: ۣ۟ۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static long m8092() {
        if (C0062.m9429() > 0) {
            return System.nanoTime();
        }
        return 0L;
    }

    /* renamed from: ۣ۟ۡۥۤ, reason: not valid java name and contains not printable characters */
    public static int m8093(Object obj) {
        if (C0055.m8740() > 0) {
            return ((O) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣۣ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static String m8094() {
        if (C0000.m1116() < 0) {
            return "</div>\n        <div class=\"episodes-grid\" id=\"episodesGrid\">\n";
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static int m8095(Object obj) {
        if (C0062.m9429() >= 0) {
            return ((T) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۤ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static long m8096(Object obj) {
        if (C0026.m4977() <= 0) {
            return ((com.github.catvod.spider.merge.d0.d) obj).d;
        }
        return 0L;
    }

    /* renamed from: ۟ۤ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static String m8097() {
        if (C0011.m2755() > 0) {
            return "电脑";
        }
        return null;
    }

    /* renamed from: ۟ۤۢۧ, reason: not valid java name and contains not printable characters */
    public static void m8098(Object obj, Object obj2) {
        if (C0057.m9017() > 0) {
            ((AccessibilityNodeInfo) obj).setPaneTitle((CharSequence) obj2);
        }
    }

    /* renamed from: ۣ۟ۤۧ۟, reason: not valid java name and contains not printable characters */
    public static void m8099(Object obj, Object obj2) {
        if (C0038.m6471() > 0) {
            ((Inflater) obj).setInput((byte[]) obj2);
        }
    }

    /* renamed from: ۟ۤۥۢۤ, reason: not valid java name and contains not printable characters */
    public static void m8100(Object obj, Object obj2) {
        if (C0029.m5282() >= 0) {
            ((HBDmSou) obj).init((Context) obj2);
        }
    }

    /* renamed from: ۟ۤۦۡۢ, reason: not valid java name and contains not printable characters */
    public static String m8101(String str) {
        String string = "";
        int i = 0;
        String str2 = "";
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * 10)) ^ i).toString();
            i++;
            str2 = string2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i2)) << 4) | string.indexOf(str.charAt(i2 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        String str3 = "a";
        while (str3.length() > 0) {
            str3 = "";
            if ("".length() == 0) {
                str3 = "a";
            }
        }
        int length = str3.length();
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* renamed from: ۟ۤۦۣۣ, reason: not valid java name and contains not printable characters */
    public static m m8102(Object obj) {
        if (C0048.m7971() > 0) {
            return FishHxq.m((JSONObject) obj);
        }
        return null;
    }

    /* renamed from: ۟ۤۦۦۢ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m8103(Object obj) {
        if (C0045.m7538() < 0) {
            return ((C0335o) obj).b();
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۨۤ, reason: not valid java name and contains not printable characters */
    public static String m8104(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0016.m3596() < 0) {
            return ((C0233B) obj).d((String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* renamed from: ۟ۥ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8105(Object obj) {
        if (C0005.m1599() <= 0) {
            return ((com.github.catvod.spider.merge.E0.p) obj).h();
        }
        return false;
    }

    /* renamed from: ۟ۦ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static void m8106(Object obj, boolean z) {
        if (m8121() <= 0) {
            ((CompoundButton) obj).setChecked(z);
        }
    }

    /* renamed from: ۟ۦۣۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8107(Object obj) {
        if (C0052.m8320() > 0) {
            return ((C0269d) obj).hasNext();
        }
        return false;
    }

    /* renamed from: ۟ۦۡۦ۠, reason: not valid java name and contains not printable characters */
    public static long m8108(Object obj) {
        if (C0044.m7508() <= 0) {
            return ((com.github.catvod.spider.merge.d0.d) obj).f;
        }
        return 0L;
    }

    /* renamed from: ۟ۦۤۧۧ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.G0.d m8109(Object obj, Object obj2) {
        if (C0047.m7837() > 0) {
            return ((C0166x) obj).c((K) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۧۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m8110() {
        if (C0056.m8886() <= 0) {
            return "正在播放--> ";
        }
        return null;
    }

    /* renamed from: ۟ۧۢۢۡ, reason: not valid java name and contains not printable characters */
    public static String m8111() {
        if (C0061.m9359() < 0) {
            return "\\(.*";
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۢۤ, reason: not valid java name and contains not printable characters */
    public static String m8112(Object obj) {
        if (C0057.m9017() > 0) {
            return ((HBmengya) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m8113(Object obj) {
        if (C0061.m9359() <= 0) {
            ((com.github.catvod.spider.merge.L.c) obj).a();
        }
    }

    /* renamed from: ۟ۧۥۥۧ, reason: not valid java name and contains not printable characters */
    public static void m8114(Object obj, boolean z) {
        if (C0059.m9257() <= 0) {
            ((WebSettings) obj).setAllowContentAccess(z);
        }
    }

    /* renamed from: ۟ۧۦۡۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m8115(Object obj) {
        if (C0061.m9359() <= 0) {
            return ((String) obj).getBytes();
        }
        return null;
    }

    /* renamed from: ۠۟۟, reason: not valid java name and contains not printable characters */
    public static Object m8116(Object obj) {
        if (C0026.m4977() <= 0) {
            return ((C0268c) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m8117(Object obj) {
        if (C0047.m7837() > 0) {
            return ((ByteBuffer) obj).arrayOffset();
        }
        return 0;
    }

    /* renamed from: ۠ۤۦۦ, reason: not valid java name and contains not printable characters */
    public static ArrayList m8118(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (C0004.m1557() < 0) {
            return ((M) obj).g((String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6);
        }
        return null;
    }

    /* renamed from: ۠ۧ۠۟, reason: not valid java name and contains not printable characters */
    public static List m8119(Object obj) {
        if (C0048.m7971() >= 0) {
            return com.github.catvod.spider.merge.J.b.a((String) obj);
        }
        return null;
    }

    /* renamed from: ۠ۨۢۧ, reason: not valid java name and contains not printable characters */
    public static f m8120(Object obj) {
        if (C0043.m7332() >= 0) {
            return ((o) obj).h();
        }
        return null;
    }

    /* renamed from: ۡۢ۟۟, reason: not valid java name and contains not printable characters */
    public static int m8121() {
        return 304 ^ C0020.f460;
    }

    /* renamed from: ۣۣۡ۟, reason: not valid java name and contains not printable characters */
    public static void m8122(Object obj, Object obj2) {
        if (C0059.m9257() <= 0) {
            ((Logger) obj).severe((String) obj2);
        }
    }

    /* renamed from: ۡۧۢۨ, reason: not valid java name and contains not printable characters */
    public static HashMap m8123() {
        if (C0008.m1975() >= 0) {
            return Star.b();
        }
        return null;
    }

    /* renamed from: ۢ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static int m8124(Object obj, Object obj2) {
        if (C0062.m9429() >= 0) {
            return ((String) obj).compareTo((String) obj2);
        }
        return 0;
    }

    /* renamed from: ۢ۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static String m8125(Object obj, Object obj2) {
        if (C0036.m6252() >= 0) {
            return ((String) obj).concat((String) obj2);
        }
        return null;
    }

    /* renamed from: ۢۦۧ۠, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.E0.d m8126(Object obj) {
        if (C0025.m4797() >= 0) {
            return ((com.github.catvod.spider.merge.I0.c) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۢۨ۠, reason: not valid java name and contains not printable characters */
    public static C0148e m8127(Object obj, Object obj2) {
        if (C0017.m3633() < 0) {
            return ((L) obj).e((C0148e) obj2);
        }
        return null;
    }

    /* renamed from: ۣۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static r m8128(Object obj) {
        if (C0036.m6252() > 0) {
            return ((r) obj).F();
        }
        return null;
    }

    /* renamed from: ۣۡۢۢ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.U0.L m8129(Object obj) {
        if (C0061.m9359() <= 0) {
            return ((C0176b) obj).j;
        }
        return null;
    }

    /* renamed from: ۣۡۧۧ, reason: not valid java name and contains not printable characters */
    public static float m8130(Object obj) {
        if (C0003.m1463() < 0) {
            return ((View) obj).getAlpha();
        }
        return 0.0f;
    }

    /* renamed from: ۣۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m8132(Object obj) {
        if (C0032.m5686() <= 0) {
            ((C0259u) obj).h();
        }
    }

    /* renamed from: ۣۤۧۥ, reason: not valid java name and contains not printable characters */
    public static String m8133() {
        if (C0048.m7971() > 0) {
            return "请求头参数";
        }
        return null;
    }

    /* renamed from: ۣۥۦ, reason: not valid java name and contains not printable characters */
    public static int m8134(Object obj) {
        if (C0023.m4566() <= 0) {
            return ((ColorDrawable) obj).getColor();
        }
        return 0;
    }

    /* renamed from: ۣۦۨۥ, reason: not valid java name and contains not printable characters */
    public static int m8135(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۤ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static void m8136(Object obj, long j) throws InterruptedException {
        if (m8121() <= 0) {
            obj.wait(j);
        }
    }

    /* renamed from: ۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Pattern m8137(Object obj) {
        if (C0028.m5152() <= 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).l;
        }
        return null;
    }

    /* renamed from: ۤ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static String m8138() {
        if (C0016.m3596() <= 0) {
            return "AES/CTR/PKCS5Padding";
        }
        return null;
    }

    /* renamed from: ۤۢۥۦ, reason: not valid java name and contains not printable characters */
    public static Annotation m8139(Object obj, Object obj2) {
        if (C0008.m1975() >= 0) {
            return ((Class) obj).getAnnotation((Class) obj2);
        }
        return null;
    }

    /* renamed from: ۣۤۦۦ, reason: not valid java name and contains not printable characters */
    public static char[] m8140(Object obj) {
        if (C0034.m6048() <= 0) {
            return ((CharBuffer) obj).array();
        }
        return null;
    }

    /* renamed from: ۤۥۨۨ, reason: not valid java name and contains not printable characters */
    public static void m8141(Object obj, Object obj2) {
        if (C0036.m6252() > 0) {
            ((Calendar) obj).setTimeZone((TimeZone) obj2);
        }
    }

    /* renamed from: ۤۧۡۥ, reason: not valid java name and contains not printable characters */
    public static S m8142(Object obj) {
        if (C0023.m4566() < 0) {
            return ((AbstractC0151h) obj).b;
        }
        return null;
    }

    /* renamed from: ۤۧۧۡ, reason: not valid java name and contains not printable characters */
    public static x m8143(Object obj) {
        if (C0035.m6140() <= 0) {
            return ((w) obj).a;
        }
        return null;
    }

    /* renamed from: ۥ۠ۨۥ, reason: contains not printable characters */
    public static h m8144(Object obj) {
        if (C0049.m8038() <= 0) {
            return ((ApplvDV2) obj).a;
        }
        return null;
    }

    /* renamed from: ۥۣۣ, reason: contains not printable characters */
    public static Pattern m8145() {
        if (C0037.m6350() <= 0) {
            return ApplvDV2.e;
        }
        return null;
    }

    /* renamed from: ۥۣۥۡ, reason: contains not printable characters */
    public static List m8146(Object obj, Object obj2) {
        if (C0063.m9589() < 0) {
            return ((HBlingDu) obj).getlist((List) obj2);
        }
        return null;
    }

    /* renamed from: ۥۨۥۡ, reason: contains not printable characters */
    public static int m8147(Object obj, int i) {
        if (C0040.m6582() > 0) {
            return ((t) obj).b(i);
        }
        return 0;
    }

    /* renamed from: ۦۡۡ۟, reason: contains not printable characters */
    public static WebSettings m8148(Object obj) {
        if (C0020.m4210() <= 0) {
            return ((WebView) obj).getSettings();
        }
        return null;
    }

    /* renamed from: ۦۡۡۧ, reason: contains not printable characters */
    public static void m8149(Object obj, Object obj2, Object obj3) {
        if (C0007.m1886() >= 0) {
            ((Quark) obj).init((Context) obj2, (String) obj3);
        }
    }

    /* renamed from: ۦۥۣ۠, reason: contains not printable characters */
    public static WebView m8150(Object obj) {
        if (C0031.m5628() >= 0) {
            return ((com.github.catvod.spider.merge.W.w) obj).c;
        }
        return null;
    }

    /* renamed from: ۧ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static TimeUnit m8151() {
        if (C0042.m7147() <= 0) {
            return TimeUnit.SECONDS;
        }
        return null;
    }

    /* renamed from: ۧ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static String m8152(Object obj, Object obj2) {
        if (C0039.m6529() < 0) {
            return ((com.github.catvod.spider.merge.T0.q) obj).c((String) obj2);
        }
        return null;
    }

    /* renamed from: ۧ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m8153(Object obj) {
        if (C0045.m7538() < 0) {
            return g.c((byte[]) obj);
        }
        return null;
    }

    /* renamed from: ۧۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m8154(Object obj) {
        if (C0022.m4497() >= 0) {
            return ((e) obj).c();
        }
        return null;
    }

    /* renamed from: ۣۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m8155(Object obj) {
        if (C0038.m6471() > 0) {
            ((C0233B) obj).l();
        }
    }

    /* renamed from: ۧۤۥ۠, reason: not valid java name and contains not printable characters */
    public static Class[] m8156(Object obj) {
        if (C0027.m5017() > 0) {
            return ((Class) obj).getInterfaces();
        }
        return null;
    }

    /* renamed from: ۧۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m8157(Object obj) {
        if (C0040.m6582() > 0) {
            return ((AccessibilityNodeInfo) obj).getDrawingOrder();
        }
        return 0;
    }

    /* renamed from: ۨ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static String m8158() {
        if (C0062.m9429() > 0) {
            return HBtiantianv3.b();
        }
        return null;
    }

    /* renamed from: ۨۦۣ, reason: not valid java name and contains not printable characters */
    public static HashMap m8159(Object obj) {
        if (C0023.m4566() < 0) {
            return ((C0232A) obj).b;
        }
        return null;
    }

    /* renamed from: ۨۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.T0.g m8160(Object obj) {
        if (C0049.m8038() < 0) {
            return ((com.github.catvod.spider.merge.T0.h) obj).j;
        }
        return null;
    }

    /* renamed from: ۨۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m8161(Object obj) {
        if (C0012.m3024() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.d.c) obj).a();
        }
        return null;
    }

    /* renamed from: ۣۣۥۧ, reason: not valid java name and contains not printable characters */
    public static String m8131(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}