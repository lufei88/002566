package com.github.catvod.spider.merge.C;

import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.text.PrecomputedText;
import android.text.StaticLayout;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebSettings;
import android.widget.Button;
import android.widget.Scroller;
import android.widget.TextView;
import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.ApplvDV2;
import com.github.catvod.spider.ChangZhang;
import com.github.catvod.spider.HBAppfox;
import com.github.catvod.spider.HBqiJi;
import com.github.catvod.spider.HBxingC;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.PPX;
import com.github.catvod.spider.Zhaozy;
import com.github.catvod.spider.Zxzj;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.E0.v;
import com.github.catvod.spider.merge.F.e;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.G.f;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.x;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.h;
import com.github.catvod.spider.merge.T0.r;
import com.github.catvod.spider.merge.U.i;
import com.github.catvod.spider.merge.U.n;
import com.github.catvod.spider.merge.U0.C0176b;
import com.github.catvod.spider.merge.U0.E;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.X0.A;
import com.github.catvod.spider.merge.X0.p;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.Z0.j;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0232A;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.C0246g;
import com.github.catvod.spider.merge.a0.C0259u;
import com.github.catvod.spider.merge.a0.O;
import com.github.catvod.spider.merge.a0.RunnableC0256q;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e1.d;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0314C;
import com.github.catvod.spider.merge.h0.N;
import com.github.catvod.spider.merge.h0.Q;
import com.github.catvod.spider.merge.h0.RunnableC0321a;
import com.github.catvod.spider.merge.h0.RunnableC0322b;
import com.github.catvod.spider.merge.h0.T;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.l0.l;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.y0.InterfaceC0416b;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.d0.F;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.e0.P;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.net.ssl.SSLSocket;

/* renamed from: com.github.catvod.spider.merge.C.ۦۥۥ۠, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0017 {

    /* renamed from: ۧ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static int f382 = -264;

    /* renamed from: ۣ۟۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m3633() {
        return (-830) ^ C0044.f746;
    }

    /* renamed from: ۟۟ۡۥۥ, reason: not valid java name and contains not printable characters */
    public static void m3634(Object obj, Object obj2) {
        if (C0003.m1463() < 0) {
            ((com.github.catvod.spider.merge.G.c) obj).l((String) obj2);
        }
    }

    /* renamed from: ۟۟ۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static IOException m3635(Object obj) {
        if (C0052.m8320() >= 0) {
            return ((l) obj).b;
        }
        return null;
    }

    /* renamed from: ۟۟ۢۤۨ, reason: not valid java name and contains not printable characters */
    public static String m3636(Object obj) {
        if (C0042.m7147() < 0) {
            return ((f) obj).b;
        }
        return null;
    }

    /* renamed from: ۟۟ۥۣۤ, reason: not valid java name and contains not printable characters */
    public static HashMap m3637(Object obj) {
        if (C0004.m1557() <= 0) {
            return ((ApplvDV2) obj).b;
        }
        return null;
    }

    /* renamed from: ۟۟ۦۣ۠, reason: not valid java name and contains not printable characters */
    public static void m3638(Object obj, Object obj2) {
        if (C0056.m8886() < 0) {
            ChangZhang.b((ArrayList) obj, (h) obj2);
        }
    }

    /* renamed from: ۟۠۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static String m3639() {
        if (C0042.m7147() < 0) {
            return "cookie";
        }
        return null;
    }

    /* renamed from: ۣ۟۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3640(Object obj, Object obj2) {
        if (C0054.m8557() < 0) {
            return C0058.m9103(obj, obj2);
        }
        return false;
    }

    /* renamed from: ۟۠ۥۢۤ, reason: not valid java name and contains not printable characters */
    public static void m3641(Object obj, Object obj2, Object obj3) {
        if (C0054.m8557() < 0) {
            ((URLConnection) obj).setRequestProperty((String) obj2, (String) obj3);
        }
    }

    /* renamed from: ۟۠ۧ۠۟, reason: not valid java name and contains not printable characters */
    public static Charset m3642() {
        if (C0000.m1116() <= 0) {
            return StandardCharsets.ISO_8859_1;
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static AlertDialog m3643(Object obj) {
        if (C0009.m2047() > 0) {
            return ((C0233B) obj).k;
        }
        return null;
    }

    /* renamed from: ۟۠ۨۡۨ, reason: not valid java name and contains not printable characters */
    public static String m3644() {
        if (C0013.m3167() >= 0) {
            return "vod_director";
        }
        return null;
    }

    /* renamed from: ۟ۡ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static void m3645(Object obj) {
        if (C0043.m7332() > 0) {
            ((A) obj).r();
        }
    }

    /* renamed from: ۟ۡۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m3647(Object obj) {
        if (C0028.m5152() < 0) {
            return ((com.github.catvod.spider.merge.T0.a) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۡۢۥۤ, reason: not valid java name and contains not printable characters */
    public static int m3648() {
        if (C0006.m1726() <= 0) {
            return com.github.catvod.spider.p000mergexbpq.b0.b.d;
        }
        return 0;
    }

    /* renamed from: ۟ۡۢۦ۟, reason: not valid java name and contains not printable characters */
    public static Object m3649(Object obj, Object obj2) {
        if (C0007.m1886() >= 0) {
            return ((p) obj).a((com.github.catvod.spider.merge.Y0.c) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۥ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3650(Object obj) {
        if (C0063.m9589() <= 0) {
            return com.github.catvod.spider.merge.D.f.p((String) obj);
        }
        return false;
    }

    /* renamed from: ۟ۢ۠۠, reason: not valid java name and contains not printable characters */
    public static String m3651() {
        if (C0025.m4797() > 0) {
            return "sousuohouzhui";
        }
        return null;
    }

    /* renamed from: ۣ۟ۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m3652(Object obj) {
        if (C0059.m9257() < 0) {
            return ((RunnableC0321a) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۢۡۧۡ, reason: not valid java name and contains not printable characters */
    public static Object m3653(Object obj) {
        if (C0021.m4379() > 0) {
            return ((O) obj).e;
        }
        return null;
    }

    /* renamed from: ۟ۢۧۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3654(Object obj, Object obj2) {
        if (C0053.m8389() >= 0) {
            return ((C0176b) obj).y((String) obj2);
        }
        return false;
    }

    /* renamed from: ۣ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static HashMap m3655(Object obj) {
        if (C0061.m9359() <= 0) {
            return ((C0232A) obj).e;
        }
        return null;
    }

    /* renamed from: ۣ۟ۢ۟۠, reason: not valid java name and contains not printable characters */
    public static String m3656() {
        if (C0036.m6252() > 0) {
            return "') no-repeat center center fixed;\n        background-attachment: fixed;\n        display: flex;\n        flex-direction: column;\n        align-items: center;\n        min-height: 100vh;\n        padding: 20px 15px;\n        position: relative;\n        color: #2c3e50;\n    }\n    \n    @media (max-width: 768px) {\n        body {\n            padding: 15px 10px;\n        }\n    }\n\n    /* 网格背景效果 */\n    body::before {\n        content: '';\n        position: fixed;\n        top: 0;\n        left: 0;\n        right: 0;\n        bottom: 0;\n        background-image: \n            linear-gradient(rgba(52, 152, 219, 0.08) 1px, transparent 1px),\n            linear-gradient(90deg, rgba(52, 152, 219, 0.08) 1px, transparent 1px);\n        background-size: 40px 40px;\n        pointer-events: none;\n        z-index: 0;\n    }\n\n    h1, h4 {\n        color: #2c3e50;\n        margin: 20px 0;\n        text-shadow: 0 2px 4px rgba(52, 152, 219, 0.3);\n        font-size: 1.2em;\n        letter-spacing: 1px;\n        position: relative;\n        z-index: 1;\n    }\n    \n    @media (max-width: 768px) {\n        h1, h4 {\n            font-size: 1.2em;\n            margin: 15px 0;\n        }\n    }\n    \n    @media (max-width: 480px) {\n        h1, h4 {\n            font-size: 1.2em;\n            margin: 10px 0;\n        }\n    }\n\n    form {\n        background: rgba(255, 255, 255, 0.98);\n        backdrop-filter: blur(25px);\n        padding: 20px 26px;\n        border-radius: 20px;\n        box-shadow: 0 12px 45px rgba(52, 152, 219, 0.18), 0 6px 25px rgba(0, 0, 0, 0.08);\n        border: 2px solid rgba(52, 152, 219, 0.12);\n        display: flex;\n        width: 90%;\n        max-width: 650px;\n        margin-bottom: 25px;\n        transition: all 0.4s cubic-bezier(0.25, 0.46, 0.45, 0.94);\n        position: relative;\n        z-index: 1;\n    }\n    \n    @media (max-width: 768px) {\n        form {\n            flex-direction: column;\n            padding: 18px 20px;\n            width: 95%;\n        }\n    }\n    \n    @media (max-width: 480px) {\n        form {\n            padding: 15px 16px;\n            border-radius: 16px;\n        }\n    }\n\n    /* 搜索建议下拉框 */\n    .search-suggestions {\n        position: absolute;\n        top: 100%;\n        left: 0;\n        right: 0;\n        background: rgba(255, 255, 255, 0.98);\n        backdrop-filter: blur(20px);\n        border: 2px solid rgba(52, 152, 219, 0.2);\n        border-top: none;\n        border-radius: 0 0 16px 16px;\n        max-height: 200px;\n        overflow-y: auto;\n        z-index: 100;\n        display: none;\n    }\n\n    .suggestion-item {\n        padding: 12px 16px;\n        color: #2c3e50;\n        cursor: pointer;\n        transition: all 0.2s ease;\n        border-bottom: 1px solid rgba(52, 152, 219, 0.1);\n    }\n\n    .suggestion-item:hover {\n        background: rgba(52, 152, 219, 0.1);\n        color: #1f618d;\n    }\n\n    .suggestion-item:last-child {\n        border-bottom: none;\n    }\n\n    form:hover {\n        transform: translateY(-3px);\n        box-shadow: 0 15px 50px rgba(52, 152, 219, 0.2), 0 8px 25px rgba(0, 0, 0, 0.08);\n        border-color: rgba(52, 152, 219, 0.3);\n    }\n\n    input[type=\"text\"] {\n        padding: 15px 20px;\n        border: 2px solid rgba(52, 152, 219, 0.2);\n        border-radius: 14px;\n        flex: 1;\n        margin-right: 15px;\n        font-size: 15px;\n        transition: all 0.3s ease;\n        background: rgba(248, 250, 252, 0.95);\n        color: #2c3e50;\n        box-shadow: inset 0 2px 4px rgba(52, 152, 219, 0.05);\n    }\n    \n    @media (max-width: 768px) {\n        input[type=\"text\"] {\n            margin-right: 0;\n            margin-bottom: 12px;\n            font-size: 14px;\n        }\n    }\n    \n    @media (max-width: 480px) {\n        input[type=\"text\"] {\n            padding: 12px 16px;\n            font-size: 13px;\n        }\n    }\n\n    input[type=\"text\"]::placeholder {\n        color: #95a5a6;\n    }\n\n    input[type=\"text\"]:focus {\n        border-color: rgba(52, 152, 219, 0.6);\n        background: rgba(255, 255, 255, 1);\n        box-shadow: 0 0 0 4px rgba(52, 152, 219, 0.1), 0 0 25px rgba(52, 152, 219, 0.15);\n        outline: none;\n    }\n\n    /* iOS风格搜索按钮 */\n    input[type=\"submit\"] {\n        padding: 15px 35px;\n        background: linear-gradient(180deg, #007AFF 0%, #0051D5 100%);\n        color: #fff;\n        border: none;\n        border-radius: 14px;\n        cursor: pointer;\n        font-size: 15px;\n        font-weight: 600;\n        letter-spacing: -0.3px;\n        transition: all 0.25s cubic-bezier(0.4, 0, 0.2, 1);\n        box-shadow: \n            0 1px 3px rgba(0, 0, 0, 0.12),\n            0 4px 12px rgba(0, 122, 255, 0.3),\n            0 12px 32px rgba(0, 122, 255, 0.2),\n            inset 0 1px 0 rgba(255, 255, 255, 0.2);\n        position: relative;\n        overflow: hidden;\n    }\n    \n    /* iOS按钮光泽 */\n    input[type=\"submit\"]::before {\n        content: '';\n        position: absolute;\n        top: 0;\n        left: 0;\n        right: 0;\n        height: 50%;\n        background: linear-gradient(180deg, rgba(255, 255, 255, 0.25) 0%, transparent 100%);\n        border-radius: 14px 14px 0 0;\n        pointer-events: none;\n    }\n    \n    /* iOS按钮高光动画 */\n    input[type=\"submit\"]::after {\n        content: '';\n        position: absolute;\n        top: 0;\n        left: -100%;\n        width: 100%;\n        height: 100%;\n        background: linear-gradient(90deg, transparent, rgba(255, 255, 255, 0.3), transparent);\n        transition: left 0.6s cubic-bezier(0.4, 0, 0.2, 1);\n    }\n    \n    @media (max-width: 768px) {\n        input[type=\"submit\"] {\n            width: 100%;\n            padding: 14px 28px;\n            font-size: 14px;\n            border-radius: 13px;\n        }\n        \n        input[type=\"submit\"]::before {\n            border-radius: 13px 13px 0 0;\n        }\n    }\n    \n    @media (max-width: 480px) {\n        input[type=\"submit\"] {\n            padding: 13px 24px;\n            font-size: 13.5px;\n            border-radius: 12px;\n        }\n        \n        input[type=\"submit\"]::before {\n            border-radius: 12px 12px 0 0;\n        }\n    }\n\n    input[type=\"submit\"]:hover::after {\n        left: 100%;\n    }\n\n    input[type=\"submit\"]:hover {\n        transform: translateY(-2px) scale(1.01);\n        box-shadow: \n            0 2px 4px rgba(0, 0, 0, 0.14),\n            0 6px 16px rgba(0, 122, 255, 0.35),\n            0 16px 40px rgba(0, 122, 255, 0.25),\n            inset 0 1px 0 rgba(255, 255, 255, 0.25);\n        background: linear-gradient(180deg, #0080FF 0%, #0056E0 100%);\n    }\n\n    input[type=\"submit\"]:active {\n        transform: translateY(0) scale(0.98);\n        box-shadow: \n            0 1px 2px rgba(0, 0, 0, 0.1),\n            0 2px 8px rgba(0, 122, 255, 0.2),\n            inset 0 1px 0 rgba(255, 255, 255, 0.15);\n        transition: all 0.1s cubic-bezier(0.4, 0, 0.2, 1);\n    }\n\n    .movie-container {\n        display: grid;\n        grid-template-columns: repeat(auto-fill, minmax(145px, 1fr));\n        gap: 22px;\n        width: 94%;\n        max-width: 1400px;\n        margin: 0 auto;\n        padding: 30px 0;\n    }\n\n    @media (min-width: 1201px) {\n        .movie-container {\n            grid-template-columns: repeat(auto-fill, minmax(155px, 1fr));\n            gap: 24px;\n        }\n    }\n\n    @media (min-width: 768px) and (max-width: 1200px) {\n        .movie-container {\n            grid-template-columns: repeat(auto-fill, minmax(135px, 1fr));\n            gap: 20px;\n        }\n    }\n\n    @media (min-width: 481px) and (max-width: 767px) {\n        .movie-container {\n            grid-template-columns: repeat(auto-fill, minmax(120px, 1fr));\n            gap: 16px;\n            width: 96%;\n        }\n    }\n\n    @media (max-width: 480px) {\n        .movie-container {\n            grid-template-columns: repeat(auto-fill, minmax(105px, 1fr));\n            gap: 14px;\n            width: 96%;\n            padding: 20px 0;\n        }\n    }\n\n    .movie {\n        text-align: center;\n        background: rgba(255, 255, 255, 0.98);\n        backdrop-filter: blur(30px);\n        border-radius: 18px;\n        box-shadow: 0 10px 35px rgba(52, 152, 219, 0.14), 0 5px 18px rgba(0, 0, 0, 0.08);\n        border: 1.5px solid rgba(52, 152, 219, 0.1);\n        overflow: hidden;\n        transition: all 0.4s cubic-bezier(0.25, 0.46, 0.45, 0.94);\n        cursor: pointer;\n        position: relative;\n        transform: translateY(0);\n        display: flex;\n        flex-direction: column;\n        height: auto;\n    }\n    \n    @media (max-width: 768px) {\n        .movie {\n            border-radius: 14px;\n        }\n    }\n    \n    @media (max-width: 480px) {\n        .movie {\n            border-radius: 12px;\n            box-shadow: 0 6px 20px rgba(52, 152, 219, 0.12), 0 3px 10px rgba(0, 0, 0, 0.06);\n        }\n    }\n\n    .movie::before {\n        content: '';\n        position: absolute;\n        top: 0;\n        left: 0;\n        right: 0;\n        bottom: 0;\n        background: linear-gradient(135deg, rgba(52, 152, 219, 0.08) 0%, rgba(41, 128, 185, 0.08) 100%);\n        opacity: 0;\n        transition: opacity 0.3s ease;\n        z-index: 1;\n    }\n\n    .movie:hover {\n        transform: translateY(-8px) scale(1.03);\n        box-shadow: 0 18px 55px rgba(52, 152, 219, 0.22), 0 10px 28px rgba(0, 0, 0, 0.12);\n        border-color: rgba(52, 152, 219, 0.25);\n    }\n    \n    @media (max-width: 768px) {\n        .movie:hover {\n            transform: translateY(-5px) scale(1.02);\n        }\n    }\n    \n    @media (max-width: 480px) {\n        .movie:hover {\n            transform: translateY(-4px) scale(1.015);\n            box-shadow: 0 12px 35px rgba(52, 152, 219, 0.18), 0 6px 18px rgba(0, 0, 0, 0.1);\n        }\n    }\n\n    .movie:hover::before {\n        opacity: 1;\n    }\n\n    .movie img {\n        width: 100%;\n        height: 160px;\n        object-fit: cover;\n        transition: transform 0.6s cubic-bezier(0.25, 0.46, 0.45, 0.94);\n    }\n\n    .movie:hover img {\n        transform: scale(1.05);\n    }\n\n    /* 图片底部渐变遮罩 */\n    .movie a::after {\n        content: '';\n        position: absolute;\n        bottom: 38px;\n        left: 0;\n        right: 0;\n        height: 45px;\n        background: linear-gradient(to top, rgba(255, 255, 255, 0.9), transparent);\n        pointer-events: none;\n        z-index: 2;\n        opacity: 0;\n        transition: opacity 0.3s ease;\n    }\n\n    .movie:hover a::after {\n        opacity: 1;\n    }\n\n    @media (min-width: 1201px) {\n        .movie img {\n            height: 180px;\n        }\n    }\n    \n    @media (min-width: 768px) and (max-width: 1200px) {\n        .movie img {\n            height: 165px;\n        }\n    }\n    \n    @media (min-width: 481px) and (max-width: 767px) {\n        .movie img {\n            height: 145px;\n        }\n        \n        .movie-title {\n            font-size: 11.5px;\n            padding: 8px 7px;\n        }\n    }\n    \n    @media (max-width: 480px) {\n        .movie img {\n            height: 130px;\n        }\n        \n        .movie-title {\n            font-size: 11px;\n            padding: 7px 6px;\n        }\n    }\n\n  /* 1. 为图片的父容器（a标签）添加定位，作为标记的参考容器 */\n  .movie a {\n  position: relative;\n  display: flex;\n  flex-direction: column;\n  height: 100%;\n  flex: 1;\n  }\n\n  /* 2. 平台标记样式：固定在图片右上角 */\n  .movie-tag {\n  position: absolute;\n  top: 8px;\n  right: 8px;\n  color: #fff;\n  font-size: 10px;\n  font-weight: 600;\n  padding: 4px 10px;\n  border-radius: 6px;\n  z-index: 3;\n  box-shadow: 0 2px 10px rgba(0, 0, 0, 0.4);\n  border: 1px solid rgba(255, 255, 255, 0.3);\n  backdrop-filter: blur(8px);\n  transition: all 0.3s ease;\n  }\n\n  /* 不同平台的配色方案 */\n  .movie-tag.youku {\n  background: linear-gradient(135deg, #00a0e9 0%, #0078d7 100%);\n  }\n\n  .movie-tag.youku::before {\n  content: '🎬 ';\n  }\n\n  .movie-tag.iqiyi {\n  background: linear-gradient(135deg, #00be00 0%, #00a000 100%);\n  }\n\n  .movie-tag.iqiyi::before {\n  content: '🌟 ';\n  }\n\n  .movie-tag.qq {\n  background: linear-gradient(135deg, #ff6b00 0%, #ff5000 100%);\n  }\n\n  .movie-tag.qq::before {\n  content: '🎪 ';\n  }\n\n  .movie-tag.mgtv {\n  background: linear-gradient(135deg, #ffb800 0%, #ff9500 100%);\n  }\n\n  .movie-tag.mgtv::before {\n  content: '\u1f96d ';\n  }\n\n  .movie-tag.bilibili {\n  background: linear-gradient(135deg, #fb7299 0%, #f25d8e 100%);\n  }\n\n  .movie-tag.bilibili::before {\n  content: '📺 ';\n  }\n\n  .movie-tag.platform360 {\n  background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);\n  }\n\n  .movie-tag.platform360::before {\n  content: '🎯 ';\n  }\n\n  .movie-tag:hover {\n  transform: scale(1.05);\n  box-shadow: 0 4px 15px rgba(0, 0, 0, 0.5);\n  }\n\n  /* 3. 优化图片样式（确保标记不超出图片） */\n  .movie img {\n  width: 100%; \n  height: 160px;\n  object-fit: cover;\n  transition: transform 0.5s ease;\n  position: relative; /* 辅助定位，避免标记穿透 */\n  z-index: 1; /* 图片层级低于标记 */\n  flex-shrink: 0;\n  }    \n  .movie:hover img {\n      transform: scale(1.03);\n  }\n\n  .movie-title {\n      padding: 8px 8px 10px 8px;\n      font-weight: 600;\n      font-size: 12px;\n      line-height: 1.3;\n      overflow: hidden;\n      text-overflow: ellipsis;\n      display: -webkit-box;\n      -webkit-line-clamp: 2;\n      line-clamp: 2;\n      -webkit-box-orient: vertical;\n      color: #2c3e50;\n      position: relative;\n      z-index: 2;\n      background: linear-gradient(to bottom, rgba(255, 255, 255, 0.95), rgba(248, 250, 252, 0.9));\n      min-height: auto;\n      height: auto;\n      transition: all 0.4s ease;\n      border-top: 1px solid rgba(52, 152, 219, 0.05);\n  }\n\n  .movie:hover .movie-title {\n      background: rgba(255, 255, 255, 0.98);\n      color: #1f618d;\n  }\n\n  .movie-title:hover {\n      overflow: visible;\n      display: block;\n      background: rgba(255, 255, 255, 0.98);\n  }\n\n  /* 热度标签 */\n  .hot-badge {\n      position: absolute;\n      top: 8px;\n      left: 8px;\n      background: linear-gradient(135deg, #ff4757 0%, #ff3838 100%);\n      color: #fff;\n      font-size: 9px;\n      font-weight: 700;\n      padding: 3px 8px;\n      border-radius: 4px;\n      z-index: 3;\n      box-shadow: 0 2px 8px rgba(255, 71, 87, 0.4);\n      animation: pulse 2s ease-in-out infinite;\n  }\n\n  @keyframes pulse {\n      0%, 100% { transform: scale(1); }\n      50% { transform: scale(1.05); }\n  }\n\n  .hot-badge::before {\n      content: '🔥';\n      margin-right: 2px;\n  }\n\n  /* 加载状态 */\n  .loading-container {\n      display: none;\n      text-align: center;\n      padding: 50px;\n      color: #7f8c8d;\n  }\n\n  .loading-spinner {\n      width: 45px;\n      height: 45px;\n      border: 3px solid rgba(52, 152, 219, 0.2);\n      border-top: 3px solid rgba(52, 152, 219, 0.8);\n      border-radius: 50%;\n      animation: spin 1s linear infinite;\n      margin: 0 auto 20px;\n  }\n\n  @keyframes spin {\n      0% { transform: rotate(0deg); }\n      100% { transform: rotate(360deg); }\n  }\n\n  /* 空状态 */\n  .empty-state {\n      display: none;\n      text-align: center;\n      padding: 70px 25px;\n      color: #7f8c8d;\n  }\n\n  .empty-icon {\n      font-size: 48px;\n      margin-bottom: 16px;\n      opacity: 0.6;\n  }\n\n  .empty-title {\n      font-size: 18px;\n      font-weight: 600;\n      margin-bottom: 10px;\n      color: #2c3e50;\n  }\n\n  .empty-desc {\n      font-size: 14px;\n      line-height: 1.5;\n  }\n\n\n  .hidden {\n      display: none;\n  }\n  \n  /* 按钮组容器 */\n  .button-group {\n      display: flex;\n      flex-direction: column;\n      gap: 14px;\n      margin-bottom: 25px;\n      align-items: center;\n      width: 90%;\n      max-width: 650px;\n  }\n  \n  @media (max-width: 768px) {\n      .button-group {\n          width: 95%;\n          gap: 12px;\n      }\n  }\n  \n  @media (max-width: 480px) {\n      .button-group {\n          width: 96%;\n          gap: 10px;\n          margin-bottom: 20px;\n      }\n  }\n  \n  /* iOS风格按钮样式 */\n  .action-button {\n      background: linear-gradient(180deg, rgba(255, 255, 255, 0.95) 0%, rgba(248, 250, 252, 0.92) 100%) !important;\n      backdrop-filter: blur(40px) saturate(180%);\n      -webkit-backdrop-filter: blur(40px) saturate(180%);\n      border: 0.5px solid rgba(255, 255, 255, 0.6) !important;\n      box-shadow: \n          0 1px 3px rgba(0, 0, 0, 0.04),\n          0 4px 12px rgba(52, 152, 219, 0.08),\n          0 12px 32px rgba(52, 152, 219, 0.06),\n          inset 0 1px 0 rgba(255, 255, 255, 0.8) !important;\n      position: relative;\n      z-index: 1;\n      color: #007AFF !important;\n      width: 100%;\n      padding: 16px 24px;\n      border-radius: 16px;\n      font-size: 15px;\n      font-weight: 600;\n      letter-spacing: -0.3px;\n      transition: all 0.25s cubic-bezier(0.4, 0, 0.2, 1);\n      text-decoration: none;\n      display: inline-flex;\n      align-items: center;\n      justify-content: center;\n      cursor: pointer;\n      overflow: hidden;\n  }\n  \n  /* iOS按钮光泽效果 */\n  .action-button::before {\n      content: '';\n      position: absolute;\n      top: 0;\n      left: 0;\n      right: 0;\n      height: 50%;\n      background: linear-gradient(180deg, rgba(255, 255, 255, 0.4) 0%, transparent 100%);\n      border-radius: 16px 16px 0 0;\n      pointer-events: none;\n  }\n  \n  /* iOS按钮图标样式 */\n  .action-button::after {\n      content: '';\n      position: absolute;\n      inset: 0;\n      border-radius: 16px;\n      padding: 0.5px;\n      background: linear-gradient(180deg, rgba(255, 255, 255, 0.8), rgba(255, 255, 255, 0.2));\n      -webkit-mask: linear-gradient(#fff 0 0) content-box, linear-gradient(#fff 0 0);\n      -webkit-mask-composite: xor;\n      mask-composite: exclude;\n      pointer-events: none;\n      opacity: 0.6;\n  }\n  \n  @media (max-width: 768px) {\n      .action-button {\n          padding: 14px 22px;\n          font-size: 14px;\n          border-radius: 14px;\n      }\n      \n      .action-button::before {\n          border-radius: 14px 14px 0 0;\n      }\n      \n      .action-button::after {\n          border-radius: 14px;\n      }\n  }\n  \n  @media (max-width: 480px) {\n      .action-button {\n          padding: 13px 20px;\n          font-size: 13.5px;\n          border-radius: 13px;\n      }\n      \n      .action-button::before {\n          border-radius: 13px 13px 0 0;\n      }\n      \n      .action-button::after {\n          border-radius: 13px;\n      }\n  }\n\n  .action-button:hover {\n      background: linear-gradient(180deg, rgba(255, 255, 255, 0.98) 0%, rgba(250, 252, 255, 0.95) 100%) !important;\n      transform: translateY(-2px) scale(1.01);\n      box-shadow: \n          0 2px 4px rgba(0, 0, 0, 0.05),\n          0 6px 16px rgba(52, 152, 219, 0.12),\n          0 16px 40px rgba(52, 152, 219, 0.1),\n          inset 0 1px 0 rgba(255, 255, 255, 0.9) !important;\n      border-color: rgba(255, 255, 255, 0.7) !important;\n      color: #0051D5 !important;\n  }\n\n  .action-button:active {\n      transform: translateY(0) scale(0.98);\n      box-shadow: \n          0 1px 2px rgba(0, 0, 0, 0.04),\n          0 2px 8px rgba(52, 152, 219, 0.06),\n          inset 0 1px 0 rgba(255, 255, 255, 0.7) !important;\n      transition: all 0.1s cubic-bezier(0.4, 0, 0.2, 1);\n  }\n\n  .movie a {\n      text-decoration: none;\n      color: inherit;\n      position: relative;\n      z-index: 2;\n  }\n  \n  /* 添加焦点状态样式，与悬停效果保持一致 */\n  .movie:focus-within {\n      transform: translateY(-8px) scale(1.03);\n      box-shadow: 0 18px 55px rgba(52, 152, 219, 0.22), 0 10px 28px rgba(0, 0, 0, 0.12);\n      border-color: rgba(52, 152, 219, 0.25);\n  }\n\n  .movie:focus-within::before {\n      opacity: 1;\n  }\n\n  .movie:focus-within img {\n      transform: scale(1.05);\n  }\n\n  .movie:focus-within a::after {\n      opacity: 1;\n  }\n\n  .movie:focus-within .movie-title {\n      background: rgba(255, 255, 255, 0.98);\n      color: #1f618d;\n  }\n\n  /* 为小屏幕设备调整焦点效果 */\n  @media (max-width: 768px) {\n      .movie:focus-within {\n          transform: translateY(-5px) scale(1.02);\n      }\n  }\n\n  @media (max-width: 480px) {\n      .movie:focus-within {\n          transform: translateY(-4px) scale(1.015);\n          box-shadow: 0 12px 35px rgba(52, 152, 219, 0.18), 0 6px 18px rgba(0, 0, 0, 0.1);\n      }\n  }\n\n  /* 移除默认焦点轮廓 */\n  .movie a:focus {\n      outline: none;\n  }\n  </style>\n  <meta name=\"referrer\" content=\"no-referrer\">\n</head>\n\n<body>\n  <button \n        style=\"position: absolute; right: 10px; top: 20px; transform: translateY(-50%); \n               background: none; border: none; cursor: pointer; font-size: 1.2em;\n               color: #667eea; transition: all 0.2s ease;\"\n        onclick=\"fetch('";
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۤۤ, reason: not valid java name and contains not printable characters */
    public static ExecutorService m3657(Object obj) {
        if (C0058.m9131() <= 0) {
            return ((i) obj).c;
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۥۢ, reason: not valid java name and contains not printable characters */
    public static int m3658(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۣ۟ۧۨ۟, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.e1.b m3659(Object obj) {
        if (C0059.m9257() < 0) {
            return d.c((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۤۢۥۨ, reason: not valid java name and contains not printable characters */
    public static AlertDialog m3660(Object obj) {
        if (C0051.m8216() <= 0) {
            return ((Q) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۤۥۤۨ, reason: not valid java name and contains not printable characters */
    public static List m3661(Object obj) {
        if (C0005.m1599() <= 0) {
            return ((C0232A) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۤۥۥۡ, reason: not valid java name and contains not printable characters */
    public static String m3662(Object obj) {
        if (C0036.m6252() >= 0) {
            return com.github.catvod.spider.merge.W.p.b((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۤۦ۠, reason: not valid java name and contains not printable characters */
    public static String m3663(Object obj) {
        if (C0001.m1164() <= 0) {
            return n.b((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۤۦۣۣ, reason: not valid java name and contains not printable characters */
    public static void m3664(Object obj) {
        if (C0010.m2320() <= 0) {
            ((HBAppfox) obj).a();
        }
    }

    /* renamed from: ۟ۤۨۥۤ, reason: not valid java name and contains not printable characters */
    public static void m3665(Object obj, int i) {
        if (C0019.m4065() <= 0) {
            Init.run((Runnable) obj, i);
        }
    }

    /* renamed from: ۟ۥ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static String m3666() {
        if (C0008.m1975() > 0) {
            return "vod_remarks";
        }
        return null;
    }

    /* renamed from: ۟ۥۣۢۤ, reason: not valid java name and contains not printable characters */
    public static void m3667(Object obj, Object obj2) {
        if (C0051.m8216() < 0) {
            ((g) obj).w((String) obj2);
        }
    }

    /* renamed from: ۟ۥۥۤۤ, reason: not valid java name and contains not printable characters */
    public static String m3668() {
        if (C0024.m4693() <= 0) {
            return "str";
        }
        return null;
    }

    /* renamed from: ۟ۥۦۢ۠, reason: not valid java name and contains not printable characters */
    public static InputStream m3669(Object obj, Object obj2) {
        if (C0011.m2755() >= 0) {
            return ((ZipFile) obj).getInputStream((ZipEntry) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۥۧۢ, reason: not valid java name and contains not printable characters */
    public static String m3670(Object obj) {
        if (C0015.m3433() >= 0) {
            return ((F) obj).b();
        }
        return null;
    }

    /* renamed from: ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static void m3671(Object obj, Object obj2) {
        if (C0035.m6140() <= 0) {
            ((m) obj).f((String) obj2);
        }
    }

    /* renamed from: ۟ۦ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3672(Object obj) {
        if (C0033.m5872() > 0) {
            return ((C0314C) obj).i;
        }
        return false;
    }

    /* renamed from: ۟ۦ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static String m3673(String str) {
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
        while (str.length() > 0) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(-2)) << 4) | string.indexOf(str.charAt(-1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i2 = 0; i2 < length; i2++) {
            byteArray[i2] = (byte) (byteArray[i2] ^ str2.charAt(i2 % length2));
        }
        return new String(byteArray);
    }

    /* renamed from: ۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static Object m3674(Object obj) {
        if (C0016.m3596() <= 0) {
            return ((N) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۦۣۧۢ, reason: not valid java name and contains not printable characters */
    public static String m3675() {
        if (C0000.m1116() < 0) {
            return "xpDetailContent获取列表错误！-->";
        }
        return null;
    }

    /* renamed from: ۟ۦۨۡ۟, reason: not valid java name and contains not printable characters */
    public static int m3676(Object obj) {
        if (C0041.m6823() <= 0) {
            return ((RunnableC0256q) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۧ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.T0.c m3677(Object obj) {
        if (C0021.m4379() > 0) {
            return ((r) obj).d();
        }
        return null;
    }

    /* renamed from: ۣ۟ۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.B.h m3678() {
        if (C0010.m2320() < 0) {
            return com.github.catvod.spider.merge.B.h.a;
        }
        return null;
    }

    /* renamed from: ۟ۧۥۣۤ, reason: not valid java name and contains not printable characters */
    public static String m3679(Object obj) {
        if (C0055.m8740() > 0) {
            return ((Zhaozy) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۧۥۦۧ, reason: not valid java name and contains not printable characters */
    public static void m3680(Object obj) {
        if (C0026.m4977() <= 0) {
            ((com.github.catvod.spider.p000mergexbpq.P.r) obj).j();
        }
    }

    /* renamed from: ۟ۧۥۨۨ, reason: not valid java name and contains not printable characters */
    public static String m3681(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((com.github.catvod.spider.merge.I.c) obj).k();
        }
        return null;
    }

    /* renamed from: ۠ۤۢۨ, reason: not valid java name and contains not printable characters */
    public static void m3682(Object obj, Object obj2) {
        if (C0030.m5375() > 0) {
            ((SSLSocket) obj).setEnabledCipherSuites((String[]) obj2);
        }
    }

    /* renamed from: ۣ۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3683(Object obj) {
        if (C0003.m1463() <= 0) {
            return ((E) obj).g;
        }
        return false;
    }

    /* renamed from: ۡۢۤۡ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.b.p m3684(Object obj) {
        if (C0034.m6048() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.b.d) obj).c;
        }
        return null;
    }

    /* renamed from: ۡۢۤۢ, reason: not valid java name and contains not printable characters */
    public static String m3685(Object obj) {
        if (C0000.m1116() < 0) {
            return ((HBqiJi) obj).a;
        }
        return null;
    }

    /* renamed from: ۡۢۨۧ, reason: not valid java name and contains not printable characters */
    public static Charset m3686() {
        if (C0046.m7701() > 0) {
            return m3642();
        }
        return null;
    }

    /* renamed from: ۡۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m3687(Object obj) {
        if (C0023.m4566() <= 0) {
            ((ArrayList) obj).clear();
        }
    }

    /* renamed from: ۡۥۣ۠, reason: not valid java name and contains not printable characters */
    public static HashMap m3688() {
        if (C0061.m9359() < 0) {
            return Zxzj.b();
        }
        return null;
    }

    /* renamed from: ۢ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static String m3689(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0038.m6471() > 0) {
            return ((com.github.catvod.spider.merge.V.a) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۢۡ, reason: not valid java name and contains not printable characters */
    public static List m3690(Object obj) {
        if (C0016.m3596() <= 0) {
            return ((AccessibilityNodeInfo) obj).getAvailableExtraData();
        }
        return null;
    }

    /* renamed from: ۢۦۣ, reason: not valid java name and contains not printable characters */
    public static String m3691() {
        if (C0015.m3433() >= 0) {
            return "二次";
        }
        return null;
    }

    /* renamed from: ۢۧۡۤ, reason: not valid java name and contains not printable characters */
    public static List m3692() {
        if (C0064.m9659() <= 0) {
            return com.github.catvod.spider.merge.g0.g.c;
        }
        return null;
    }

    /* renamed from: ۣۣۣۢ, reason: not valid java name and contains not printable characters */
    public static ArrayList m3693(Object obj) {
        if (C0029.m5282() > 0) {
            return ((C0233B) obj).s;
        }
        return null;
    }

    /* renamed from: ۣۥۢۥ, reason: not valid java name and contains not printable characters */
    public static String m3694() {
        if (C0023.m4566() <= 0) {
            return "过滤词";
        }
        return null;
    }

    /* renamed from: ۣۥۣۤ, reason: not valid java name and contains not printable characters */
    public static TimeZone m3695(Object obj) {
        if (C0006.m1726() <= 0) {
            return ((com.github.catvod.spider.merge.P0.l) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۨۥۣ, reason: not valid java name and contains not printable characters */
    public static int m3696(Object obj) {
        if (C0035.m6140() <= 0) {
            return ((Matcher) obj).groupCount();
        }
        return 0;
    }

    /* renamed from: ۤ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static void m3697(Object obj) {
        if (C0061.m9359() < 0) {
            ((Scroller) obj).abortAnimation();
        }
    }

    /* renamed from: ۣۤۦۤ, reason: not valid java name and contains not printable characters */
    public static String m3698(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (C0045.m7538() < 0) {
            return ((C0259u) obj).e((String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6);
        }
        return null;
    }

    /* renamed from: ۤۤۦ, reason: not valid java name and contains not printable characters */
    public static String m3699(Object obj) {
        if (C0044.m7508() <= 0) {
            return ((com.github.catvod.spider.merge.T0.c) obj).toString();
        }
        return null;
    }

    /* renamed from: ۤۥۡ۟, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.e0.N m3700(Object obj) {
        if (C0011.m2755() >= 0) {
            return P.h((String) obj);
        }
        return null;
    }

    /* renamed from: ۤۥۡۡ, reason: not valid java name and contains not printable characters */
    public static String m3701(Object obj) {
        if (C0013.m3167() > 0) {
            return ((T) obj).a;
        }
        return null;
    }

    /* renamed from: ۤۥۢ, reason: not valid java name and contains not printable characters */
    public static String m3702() {
        if (C0050.m8121() < 0) {
            return "调试->验证出错：";
        }
        return null;
    }

    /* renamed from: ۥ۟ۤۨ, reason: contains not printable characters */
    public static Button m3703(Object obj, int i) {
        if (C0007.m1886() >= 0) {
            return ((AlertDialog) obj).getButton(i);
        }
        return null;
    }

    /* renamed from: ۥ۠ۢۦ, reason: contains not printable characters */
    public static MainActivity m3704(Object obj) {
        if (C0020.m4210() <= 0) {
            return ((com.github.catvod.spider.merge.T.b) obj).b;
        }
        return null;
    }

    /* renamed from: ۥۡۥۡ, reason: contains not printable characters */
    public static int m3705(Object obj, int i) {
        if (C0060.m9355() >= 0) {
            return ((PrecomputedText) obj).getParagraphStart(i);
        }
        return 0;
    }

    /* renamed from: ۥۣۢۥ, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.y0.g m3706(Object obj) {
        if (C0048.m7971() > 0) {
            return ((InterfaceC0416b) obj).getVisibility();
        }
        return null;
    }

    /* renamed from: ۥۣۦۨ, reason: contains not printable characters */
    public static StaticLayout m3707(Object obj) {
        if (C0007.m1886() > 0) {
            return ((StaticLayout.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۥۧۦۧ, reason: contains not printable characters */
    public static String m3708() {
        if (C0056.m8886() <= 0) {
            return j.c();
        }
        return null;
    }

    /* renamed from: ۥۨ۠ۨ, reason: contains not printable characters */
    public static void m3709(Object obj, int i, int i2, int i3, int i4) {
        if (C0037.m6350() <= 0) {
            ((TextView) obj).setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: ۥۨۧۧ, reason: contains not printable characters */
    public static Object m3710(Object obj) {
        if (C0009.m2047() > 0) {
            return ((ThreadLocal) obj).get();
        }
        return null;
    }

    /* renamed from: ۦ۟ۢۨ, reason: contains not printable characters */
    public static String m3711(Object obj) {
        if (C0022.m4497() >= 0) {
            return ((RunnableC0322b) obj).b;
        }
        return null;
    }

    /* renamed from: ۦۡۢ۟, reason: contains not printable characters */
    public static HashMap m3712() {
        if (C0058.m9131() < 0) {
            return HBxingC.a();
        }
        return null;
    }

    /* renamed from: ۦۢۡۡ, reason: contains not printable characters */
    public static e m3713(Object obj) {
        if (C0011.m2755() >= 0) {
            return ((e) obj).d();
        }
        return null;
    }

    /* renamed from: ۦۤۢۥ, reason: contains not printable characters */
    public static String m3714(Object obj, int i) {
        if (C0053.m8389() > 0) {
            return ((v) obj).a(i);
        }
        return null;
    }

    /* renamed from: ۦۧۤ۟, reason: contains not printable characters */
    public static C0259u m3715(Object obj) {
        if (C0059.m9257() <= 0) {
            return ((com.github.catvod.spider.merge.a0.r) obj).b;
        }
        return null;
    }

    /* renamed from: ۦۨۨۧ, reason: contains not printable characters */
    public static void m3716(boolean z) {
        if (C0043.m7332() >= 0) {
            com.github.catvod.spider.p000mergexbpq.N.a.f(z);
        }
    }

    /* renamed from: ۧ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static void m3717(Object obj) {
        if (C0029.m5282() > 0) {
            ((A) obj).x();
        }
    }

    /* renamed from: ۣۧۥ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3718(Object obj, Object obj2) {
        if (C0036.m6252() >= 0) {
            return ((F) obj).equals(obj2);
        }
        return false;
    }

    /* renamed from: ۧۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m3719(Object obj) {
        if (C0020.m4210() <= 0) {
            return ((x) obj).b;
        }
        return 0;
    }

    /* renamed from: ۧۤۥۣ, reason: not valid java name and contains not printable characters */
    public static void m3720(Object obj) throws IOException {
        if (C0048.m7971() >= 0) {
            ((Closeable) obj).close();
        }
    }

    /* renamed from: ۧۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences.Editor m3721(Object obj, Object obj2, float f) {
        if (C0028.m5152() < 0) {
            return ((SharedPreferences.Editor) obj).putFloat((String) obj2, f);
        }
        return null;
    }

    /* renamed from: ۧۦۤ, reason: not valid java name and contains not printable characters */
    public static String m3722() {
        if (C0005.m1599() <= 0) {
            return "国语&英语&粤语&闽南语&韩语&日语&法语&德语&其它";
        }
        return null;
    }

    /* renamed from: ۧۦۧۦ, reason: not valid java name and contains not printable characters */
    public static CharBuffer m3723(Object obj, char c) {
        if (m3633() < 0) {
            return ((CharBuffer) obj).put(c);
        }
        return null;
    }

    /* renamed from: ۨ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static Object m3724(Object obj) {
        if (C0007.m1886() > 0) {
            return ((C0246g) obj).e;
        }
        return null;
    }

    /* renamed from: ۨ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static String m3725(Object obj) {
        if (C0059.m9257() < 0) {
            return ((PPX) obj).a;
        }
        return null;
    }

    /* renamed from: ۨۥۢ, reason: not valid java name and contains not printable characters */
    public static Random m3726() {
        if (C0042.m7147() < 0) {
            return com.github.catvod.spider.merge.M0.c.a;
        }
        return null;
    }

    /* renamed from: ۨۥۦ۠, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.F0.F m3727() {
        if (C0044.m7508() <= 0) {
            return com.github.catvod.spider.merge.F0.F.d;
        }
        return null;
    }

    /* renamed from: ۨۦۥۢ, reason: not valid java name and contains not printable characters */
    public static void m3728(Object obj, int i) {
        if (C0037.m6350() < 0) {
            ((WebSettings) obj).setTextZoom(i);
        }
    }

    /* renamed from: ۨۦۨۧ, reason: not valid java name and contains not printable characters */
    public static Pattern m3729(Object obj) {
        if (C0000.m1116() < 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).e;
        }
        return null;
    }

    /* renamed from: ۟ۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m3646(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}