package com.github.catvod.spider.p000mergexbpq.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.os.Looper;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.SizeF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.CookieManager;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.widget.TextView;
import com.github.catvod.spider.AList;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.FishHxq;
import com.github.catvod.spider.HB360;
import com.github.catvod.spider.HBDmSou;
import com.github.catvod.spider.HBPQ;
import com.github.catvod.spider.HBleiJing;
import com.github.catvod.spider.HBlingDu;
import com.github.catvod.spider.HBmoou;
import com.github.catvod.spider.HBqiJi;
import com.github.catvod.spider.HBv1Class;
import com.github.catvod.spider.HBxingC;
import com.github.catvod.spider.Youku;
import com.github.catvod.spider.merge.B.a;
import com.github.catvod.spider.merge.B.c;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.k;
import com.github.catvod.spider.merge.E0.f;
import com.github.catvod.spider.merge.E0.h;
import com.github.catvod.spider.merge.E0.o;
import com.github.catvod.spider.merge.E0.q;
import com.github.catvod.spider.merge.F.e;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0145b;
import com.github.catvod.spider.merge.F0.C0147d;
import com.github.catvod.spider.merge.F0.C0155l;
import com.github.catvod.spider.merge.F0.Q;
import com.github.catvod.spider.merge.F0.Y;
import com.github.catvod.spider.merge.F0.d0;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.M.g;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.t;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.T0.n;
import com.github.catvod.spider.merge.T0.r;
import com.github.catvod.spider.merge.U0.C0174a;
import com.github.catvod.spider.merge.U0.G;
import com.github.catvod.spider.merge.U0.P;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.B;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.s;
import com.github.catvod.spider.merge.W.v;
import com.github.catvod.spider.merge.X0.A;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.d;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.DialogInterfaceOnCancelListenerC0242c;
import com.github.catvod.spider.merge.a0.DialogInterfaceOnDismissListenerC0250k;
import com.github.catvod.spider.merge.a0.M;
import com.github.catvod.spider.merge.a0.RunnableC0235D;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.p;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d.C0266a;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.C0271a;
import com.github.catvod.spider.merge.e.C0278h;
import com.github.catvod.spider.merge.f.AbstractC0296g;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.l0.b;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.t0.AbstractC0371d;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.AbstractC0412b;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.y0.InterfaceC0416b;
import com.github.catvod.spider.p000mergexbpq.P.y;
import com.github.catvod.spider.p000mergexbpq.P.z;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.S.i;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import com.github.catvod.spider.p000mergexbpq.d0.E;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.e0.C0124g;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge-xbpq.R.۟ۢ۟ۡۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0003 {

    /* renamed from: ۟ۥۦ۠, reason: not valid java name and contains not printable characters */
    public static int f159 = 643;

    /* renamed from: ۟۟۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static Youku m1354(Object obj) {
        if (C0032.m5686() < 0) {
            return ((p) obj).b;
        }
        return null;
    }

    /* renamed from: ۟۟۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static int m1355(Object obj) {
        if (C0001.m1164() < 0) {
            return ((l) obj).h();
        }
        return 0;
    }

    /* renamed from: ۟۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static Object m1356(Object obj, int i, Object obj2) {
        if (C0006.m1726() < 0) {
            return ((C0271a) obj).i(i, obj2);
        }
        return null;
    }

    /* renamed from: ۟۟ۥۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1357(Object obj) {
        if (C0060.m9355() > 0) {
            return m.K((r) obj);
        }
        return false;
    }

    /* renamed from: ۟۟ۧۤۢ, reason: not valid java name and contains not printable characters */
    public static int m1358(Object obj) {
        if (C0028.m5152() <= 0) {
            return ((i) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟۟ۨۤ۟, reason: not valid java name and contains not printable characters */
    public static WebView m1359(Object obj) {
        if (C0031.m5628() > 0) {
            return s.b((Activity) obj);
        }
        return null;
    }

    /* renamed from: ۟۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static WebBackForwardList m1360() {
        if (C0026.m4977() <= 0) {
            return B.d;
        }
        return null;
    }

    /* renamed from: ۟۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static String m1361(Object obj) {
        if (C0062.m9429() >= 0) {
            return ((b) obj).c;
        }
        return null;
    }

    /* renamed from: ۟۠ۦۨۢ, reason: not valid java name and contains not printable characters */
    public static String m1362(Object obj, Object obj2) {
        if (C0001.m1164() < 0) {
            return ((HBlingDu) obj).e64((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟۠ۨۦۧ, reason: not valid java name and contains not printable characters */
    public static void m1363(Object obj, Object obj2) {
        if (C0064.m9659() < 0) {
            ((g) obj).a((String) obj2);
        }
    }

    /* renamed from: ۟۠ۨۧۥ, reason: not valid java name and contains not printable characters */
    public static void m1364(Object obj) {
        if (C0061.m9359() < 0) {
            ((f) obj).c();
        }
    }

    /* renamed from: ۟ۡ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static Iterator m1365(Object obj) {
        if (C0047.m7837() >= 0) {
            return ((TreeSet) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۣ۟ۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m1366(Object obj) {
        if (C0000.m1116() < 0) {
            return ((HBleiJing) obj).g;
        }
        return null;
    }

    /* renamed from: ۟ۡۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m1367(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۟ۢۡۡۤ, reason: not valid java name and contains not printable characters */
    public static void m1368(Object obj, Object obj2) {
        if (C0046.m7701() >= 0) {
            ((g) obj).b((String) obj2);
        }
    }

    /* renamed from: ۟ۢۡۦۨ, reason: not valid java name and contains not printable characters */
    public static List m1369(Object obj) {
        if (C0030.m5375() >= 0) {
            return com.github.catvod.spider.merge.D.f.x((List) obj);
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static JSONObject m1370(Object obj, Object obj2) {
        if (C0046.m7701() >= 0) {
            return ((JSONObject) obj).getJSONObject((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۢۦۦ, reason: not valid java name and contains not printable characters */
    public static String m1371(Object obj, Object obj2) {
        if (C0021.m4379() >= 0) {
            return HBDmSou.a((Callable) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static void m1372(Object obj, int i, float f) {
        if (C0018.m3956() > 0) {
            ((TextView) obj).setTextSize(i, f);
        }
    }

    /* renamed from: ۣ۟۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static String m1373(Object obj) {
        if (C0010.m2320() <= 0) {
            return com.github.catvod.spider.merge.D.f.o((String) obj);
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static String m1374(Object obj) {
        if (C0019.m4065() <= 0) {
            return v.g((String) obj);
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۤۨ, reason: not valid java name and contains not printable characters */
    public static File m1375(Object obj) {
        if (C0056.m8886() < 0) {
            return ((Context) obj).getFilesDir();
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۥۨ, reason: not valid java name and contains not printable characters */
    public static int m1376(Object obj) {
        if (C0030.m5375() >= 0) {
            return ((AccessibilityNodeInfo.CollectionInfo) obj).getRowCount();
        }
        return 0;
    }

    /* renamed from: ۣ۟ۡۨۥ, reason: not valid java name and contains not printable characters */
    public static String m1377(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((com.github.catvod.spider.merge.O.b) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۣ۠, reason: not valid java name and contains not printable characters */
    public static Object m1378(Object obj) {
        if (C0008.m1975() >= 0) {
            return ((DialogInterfaceOnDismissListenerC0250k) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟ۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m1379(Object obj, Object obj2, int i) {
        if (C0054.m8557() <= 0) {
            ((AccessibilityNodeInfo) obj).setLabeledBy((View) obj2, i);
        }
    }

    /* renamed from: ۣ۟ۦۡۡ, reason: not valid java name and contains not printable characters */
    public static Bitmap m1380(Object obj, Object obj2) {
        if (C0046.m7701() > 0) {
            return ImageDecoder.decodeBitmap((ImageDecoder.Source) obj, (ImageDecoder.OnHeaderDecodedListener) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۤ۟۟, reason: not valid java name and contains not printable characters */
    public static String m1381(Object obj, Object obj2, boolean z) {
        if (C0050.m8121() < 0) {
            return ((HB360) obj).searchContent((String) obj2, z);
        }
        return null;
    }

    /* renamed from: ۟ۤۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m1382(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0019.m4065() < 0) {
            return ((HBxingC) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۤۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m1383() {
        if (C0026.m4977() <= 0) {
            return "');\n            background-position: center; /* 背景图水平和垂直方向都居中 */\n            background-size: cover; /* 保持图片比例并覆盖整个容器 */\n            background-repeat: no-repeat; /* 防止图片重复平铺 */\n            background-attachment: fixed; /* 固定背景图，滚动时不跟随移动 */\n\n            font-family: 'Segoe UI', Arial, sans-serif;\n\n            color: #333;\n            line-height: 1.6;\n            display: flex;\n            flex-direction: column;\n            align-items: center;\n            min-height: 100vh;\n\n        }\n\n        .app-header i {\n            color: #e67e22; /* 橙色 */\n            animation: pulse 2s infinite ease-in-out;\n            filter: drop-shadow(0 2px 4px rgba(0,0,0,0.1));\n        }\n\n        @keyframes pulse {\n            0% { transform: scale(1); }\n            50% { transform: scale(1.08); }\n            100% { transform: scale(1); }\n        }\n\n        .title-group {\n            display: flex;\n            flex-direction: column;\n            text-align: left;\n        }\n\n        .app-header h1 {\n            font-size: 1.4em;\n            text-align: center;\n            color: #2c3e50;\n            margin: 0;\n            font-weight: 700;\n            letter-spacing: -0.5px;\n        }\n\n        .app-header .subtitle {\n            font-size: 0.8em;\n            color: #7f8c8d;\n            margin: 2px 0 0;\n            font-weight: 400;\n        }\n\n        /* 平台色定义（CSS 变量） */\n        :root {\n            --aiqiyi-color: #27ae60;\n            --youku-gradient: linear-gradient(135deg, #ff8c00, #0099ff);\n            --mango-yellow: #fdd000;\n            --sohu-color: #e74c3c;\n            --bilibili-pink: #fb7299;\n            --tencent-gradient: linear-gradient(to right, #FFC300 0%, #00D1B2 70%, #00A0E9 90%);\n            --focus-outline: 3px solid #006400;\n            --focus-shadow: 0 0 8px rgba(0, 100, 0, 0.5);\n        }\n\n        /* 渐变边框标题装饰  */\n        .header-decoration {\n            height: 3px;\n            width: 90%;\n            max-width: 520px;\n            background: linear-gradient(\n                    to right,\n                    var(--aiqiyi-color) 0% 16.666%,\n                    #f39c12 16.666% 33.333%,\n                    #ff8c00 33.333% 50%,\n                    var(--mango-yellow) 50% 66.666%,\n                    var(--sohu-color) 66.666% 83.333%,\n                    var(--bilibili-pink) 83.333% 100%\n            );\n            border-radius: 2px;\n            margin: 8px auto 8px;\n            opacity: 0.8;\n        }\n\n        /* 搜索容器 */\n        .search-container {\n            background: white;\n            padding: 16px;\n            border-radius: 12px;\n            box-shadow: 0 6px 20px rgba(0, 0, 0, 0.1);\n            width: 90%;\n            max-width: 520px;\n            margin-bottom: 5px;\n        }\n\n        /* 核心：父容器启用flex布局 */\n        .search-wrapper {\n            position: relative;\n            margin-bottom: 12px;\n            display: flex; /* 启用弹性布局 */\n            align-items: center; /* 垂直居中对齐 */\n            gap: 8px; /* 输入框与按钮的间距（自动适配） */\n        }\n        .search-wrapper input[type=\"text\"]:focus {\n            border-color: var(--tencent-gradient);\n            box-shadow: 0 0 0 2px rgba(0, 191, 255, 0.1);\n        }\n        .search-wrapper input[type=\"text\"] {\n            /* 移除width: auto和flex: 1的冲突，改用flex占满剩余空间 */\n            flex: 1; /* 自动填充剩余空间 */\n            padding: 10px 14px; /* 移除固定右侧padding，避免冗余间距 */\n            font-size: 14px;\n            border: 1px solid #ddd;\n            border-radius: 8px;\n            outline: none;\n            transition: border-color 0.3s;\n            box-sizing: border-box; /* 确保padding不影响总宽度 */\n        }\n\n        .search-wrapper button {\n            /* 移除绝对定位，改用flex布局自然排列 */\n            width: 28px;\n            height: 28px;\n            background: var(--tencent-gradient);\n            color: white;\n            border: none;\n            border-radius: 50%;\n            cursor: pointer;\n            display: flex;\n            align-items: center;\n            justify-content: center;\n            padding: 0;\n            transition: all 0.2s ease;\n            /* 固定按钮尺寸，不随容器拉伸 */\n            flex-shrink: 0;\n        }\n\n        .search-wrapper button:hover,\n        .search-wrapper button:focus {\n            transform: translateY(-0%) scale(1.05);\n            box-shadow: 0 0 0 2px rgba(0, 191, 255, 0.2);\n        }\n\n        .search-wrapper button i {\n            font-size: 13px;\n        }\n\n        /* 按钮布局 */\n        .button-row {\n            display: grid;\n            grid-template-columns: 1fr 1fr 1fr;\n            gap: 8px;\n            width: 100%;\n        }\n\n        .action-btn.full-btn {\n            padding: 8px 0;\n            font-size: 13px;\n            border-radius: 8px;\n            border: none;\n            color: white;\n            background: #555;\n            cursor: pointer;\n            display: flex;\n            align-items: center;\n            justify-content: center;\n            gap: 6px;\n            transition: all 0.3s ease;\n            outline: none;\n        }\n\n        .action-btn.full-btn i {\n            font-size: 14px;\n            width: 18px;\n            text-align: center;\n        }\n\n        .action-btn.full-btn[data-type=\"search\"] {\n            background: var(--tencent-gradient);\n        }\n\n        .action-btn.full-btn[data-type=\"qrcode\"] {\n            background: linear-gradient(135deg, #9b59b6, #8e44ad);\n        }\n\n        .action-btn.full-btn[data-type=\"danmu\"] {\n            background: #3498db;\n        }\n\n        /* 聚焦高亮：绿色外框 + 绿色标题文字 */\n        .action-btn.full-btn:focus,\n        .movie a:focus {\n            outline: var(--focus-outline);\n            outline-offset: 2px;\n            box-shadow: var(--focus-shadow);\n        }\n\n        /* 视频设计 */\n        .movie {\n            width: 100%;\n            height: 120px;\n            text-align: center;\n            background-color: #fff;\n            border-radius: 8px;\n            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n            overflow: hidden;\n            transition: transform 0.3s ease, box-shadow 0.3s ease;\n            position: relative;\n        }\n\n        .movie a {\n            position: relative;\n            display: block;\n            height: 100%;\n            outline: none;\n        }\n\n        .movie img {\n            width: 100%;\n            height: 78%;\n            object-fit: cover;\n            transition: transform 0.3s ease;\n        }\n\n        .movie a:focus img {\n            transform: scale(1.08);\n        }\n\n        .movie-tag {\n            position: absolute;\n            bottom: 32px;\n            right: 6px;\n            display: flex;\n            align-items: center;\n            gap: 4px;\n            color: #fff;\n            font-size: 9px;\n            padding: 2px 6px;\n            border-radius: 4px;\n            z-index: 2;\n            box-shadow: 0 1px 3px rgba(0, 0, 0, 0.3);\n            white-space: nowrap;\n        }\n\n        .movie-tag.aiqiyi { background-color: var(--aiqiyi-color); }\n        .movie-tag.tencent { background: var(--tencent-gradient); }\n        .movie-tag.youku { background: var(--youku-gradient); }\n        .movie-tag.mango { background-color: var(--mango-yellow); color: #000; }\n        .movie-tag.sohu { background-color: var(--sohu-color); }\n        .movie-tag.bilibili { background-color: var(--bilibili-pink); }\n\n        /*  暗色模式 */\n        .movie-title {\n            color: #333;\n            height: 22%;\n            padding: 4px 6px;\n            font-weight: bold;\n            font-size: 11px;\n            overflow: hidden;\n            white-space: nowrap;\n            text-overflow: ellipsis;\n            background-color: #ffffff;\n            text-shadow: 1px 1px 1px rgba(255, 255, 255, 0.3);\n            position: absolute;\n            bottom: 0;\n            left: 0;\n            width: 100%;\n            z-index: 1;\n            pointer-events: none;\n            transition: background-color 0.3s ease, color 0.3s ease;\n        }\n\n        @media (prefers-color-scheme: dark) {\n            .movie-title {\n                background-color: rgba(0, 0, 0, 0.85);\n                color: #ffffff;\n                text-shadow: 1px 1px 2px rgba(0, 0, 0, 0.9);\n            }\n        }\n\n        .movie a:focus .movie-title {\n            color: #00cc00;\n        }\n\n        /* 剧集列表容器 */\n        .movie-container {\n            display: grid;\n            grid-template-columns: repeat(3, 1fr);\n            gap: 12px;\n            width: 90%;\n            max-width: 520px;\n            margin: 16px auto 0;\n        }\n\n        /* 移动端排列 */\n        @media (max-width: 768px) {\n            .movie-container {\n                grid-template-columns: repeat(3, 1fr);\n                gap: 10px;\n                padding: 0 8px;\n            }\n            .movie {\n                height: 120px;\n            }\n            .movie img {\n                height: 76%;\n            }\n            .movie-title {\n                font-size: 10px;\n                height: 24%;\n                padding: 3px 6px;\n            }\n            .movie-tag {\n                font-size: 8px;\n                padding: 2px 5px;\n            }\n        }\n\n        @media (max-width: 480px) {\n            .movie-container {\n                grid-template-columns: repeat(3, 1fr);\n                gap: 10px;\n            }\n            .movie {\n                height: 110px;\n            }\n            .movie img {\n                height: 74%;\n            }\n            .movie-title {\n                font-size: 9px;\n                height: 24%;\n            }\n        }\n\n        /* 暗色模式适配 */\n        @media (prefers-color-scheme: dark) {\n            body {\n                background: linear-gradient(135deg, #1a1a1a 0%, #2c2c2c 100%);\n                color: #eee;\n            }\n            .search-container,\n            #danmuPanel {\n                background: #2a2a2a;\n                border: 1px solid #444;\n            }\n            .search-wrapper input[type=\"text\"] {\n                background: #333;\n                color: #fff;\n                border-color: #555;\n            }\n            .movie {\n                background-color: #2a2a2a;\n                box-shadow: 0 0 8px rgba(255, 255, 255, 0.05);\n            }\n            .movie img {\n                filter: brightness(0.9);\n            }\n            .status-message {\n                background-color: #006400 !important;\n            }\n        }\n\n        /* 弹幕输入面板样式 */\n        #danmuPanel {\n            width: 90%;\n            max-width: 520px;\n            margin-top: 16px;\n            padding: 16px;\n            background: #f8f9fa;\n            border-radius: 8px;\n            border: 1px solid #eee;\n        }\n\n        #danmuPanel textarea,\n        #danmuPanel input {\n            width: 100%;\n            padding: 8px;\n            border: 1px solid #ddd;\n            border-radius: 6px;\n            font-size: 13px;\n            margin-bottom: 10px;\n        }\n\n        #danmuPanel input {\n            padding: 6px 8px;\n        }\n\n        #sendDanmuBtn {\n            width: 100%;\n            padding: 10px;\n            background: var(--tencent-gradient);\n            color: white;\n            border: none;\n            border-radius: 6px;\n            font-size: 14px;\n            cursor: pointer;\n        }\n\n        /* 状态提示 */\n        .status-message {\n            opacity: 0;\n            visibility: hidden;\n            background-color: #006400;\n            color: white;\n            font-size: 14px;\n            padding: 10px 16px;\n            border-radius: 8px;\n            position: fixed;\n            top: 20px;\n            left: 50%;\n            transform: translateX(-50%);\n            box-shadow: 0 4px 12px rgba(0,0,0,0.2);\n            transition: opacity 0.3s ease, visibility 0.3s ease;\n            z-index: 1000;\n            max-width: 90%;\n            text-align: center;\n        }\n\n        .status-message.show {\n            opacity: 1;\n            visibility: visible;\n        }\n\n        /* 移动端字体微调 */\n        @media (max-width: 768px) {\n            .search-container {\n                padding: 12px 16px;\n            }\n            .button-row {\n                gap: 6px;\n            }\n            .action-btn.full-btn {\n                font-size: 13px;\n                padding: 8px 0;\n            }\n            .action-btn.full-btn i {\n                font-size: 12px;\n                width: 16px;\n            }\n            .app-header h1 { font-size: 1.3em; }\n            .app-header .subtitle { font-size: 0.75em; }\n        }\n    </style></head>\n<body>\n    <button \n        style=\"position: absolute; right: 20px; top: 30px; transform: translateY(-50%); \n               background: none; border: none; cursor: pointer; font-size: 1.2em;\n               color: #667eea; transition: all 0.2s ease;\"\n        onclick=\"fetch('";
        }
        return null;
    }

    /* renamed from: ۟ۤۥۨۦ, reason: not valid java name and contains not printable characters */
    public static void m1384(Object obj, int i) {
        if (C0041.m6823() <= 0) {
            ((StringBuffer) obj).setLength(i);
        }
    }

    /* renamed from: ۟ۤۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.b.p m1385(Object obj) {
        if (C0039.m6529() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.b.m) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۤۦۤۦ, reason: not valid java name and contains not printable characters */
    public static a m1386(Object obj, Object obj2) {
        if (C0055.m8740() >= 0) {
            return ((c) obj).b((Class) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۤۦۦۣ, reason: not valid java name and contains not printable characters */
    public static String m1387() {
        if (C0046.m7701() > 0) {
            return "搜索请求头";
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۧۧ, reason: not valid java name and contains not printable characters */
    public static String[] m1388() {
        if (C0024.m4693() <= 0) {
            return com.github.catvod.spider.merge.S0.b.a;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static ArrayList m1389(Object obj) {
        if (C0019.m4065() <= 0) {
            return ((HBv1Class) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۥۣ۠۠, reason: not valid java name and contains not printable characters */
    public static float m1390(Object obj) {
        if (C0033.m5872() >= 0) {
            return ((SizeF) obj).getHeight();
        }
        return 0.0f;
    }

    /* renamed from: ۟ۥ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static long m1391(Object obj) {
        if (C0043.m7332() >= 0) {
            return ((com.github.catvod.spider.merge.D.f) obj).f;
        }
        return 0L;
    }

    /* renamed from: ۟ۥۤۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m1392(Object obj) {
        if (C0052.m8320() >= 0) {
            return com.github.catvod.spider.merge.g0.g.m((String) obj);
        }
        return false;
    }

    /* renamed from: ۟ۥۥۡۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m1393() {
        if (m1463() < 0) {
            return com.github.catvod.spider.merge.K0.c.e;
        }
        return null;
    }

    /* renamed from: ۟ۥۦۡۤ, reason: not valid java name and contains not printable characters */
    public static String m1394() {
        if (C0061.m9359() < 0) {
            return "剧情";
        }
        return null;
    }

    /* renamed from: ۟ۥۦۤ۟, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.y0.f m1395(Object obj) {
        if (C0037.m6350() <= 0) {
            return ((InterfaceC0416b) obj).getReturnType();
        }
        return null;
    }

    /* renamed from: ۟ۥۨۦۥ, reason: not valid java name and contains not printable characters */
    public static d m1396(Object obj, Object obj2, Object obj3) {
        if (C0022.m4497() > 0) {
            return com.github.catvod.spider.merge.Z.c.i((String) obj, (Map) obj2, (Map) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۦ۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.d.g m1397(Object obj) {
        if (C0052.m8320() >= 0) {
            return com.github.catvod.spider.p000mergexbpq.d.g.f((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۦۣۣۡ, reason: not valid java name and contains not printable characters */
    public static ListIterator m1399(Object obj) {
        if (C0050.m8121() < 0) {
            return ((ArrayList) obj).listIterator();
        }
        return null;
    }

    /* renamed from: ۟ۦۤۨۦ, reason: not valid java name and contains not printable characters */
    public static HashMap m1400() {
        if (C0036.m6252() > 0) {
            return Bili.b();
        }
        return null;
    }

    /* renamed from: ۟ۦۥۡۢ, reason: not valid java name and contains not printable characters */
    public static C0124g m1401(Object obj) {
        if (C0011.m2755() >= 0) {
            return ((l) obj).R();
        }
        return null;
    }

    /* renamed from: ۟ۦۥۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m1402(Object obj) {
        if (C0046.m7701() >= 0) {
            return com.github.catvod.spider.merge.g0.g.o((String) obj);
        }
        return false;
    }

    /* renamed from: ۟ۦۦۥۣ, reason: not valid java name and contains not printable characters */
    public static AlertDialog.Builder m1403(Object obj, Object obj2, Object obj3) {
        if (C0044.m7508() <= 0) {
            return ((AlertDialog.Builder) obj).setNegativeButton((CharSequence) obj2, (DialogInterface.OnClickListener) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۦۧۨۡ, reason: not valid java name and contains not printable characters */
    public static Intent[] m1404(Object obj) {
        if (C0057.m9017() >= 0) {
            return ((ShortcutInfo) obj).getIntents();
        }
        return null;
    }

    /* renamed from: ۟ۦۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1405(Object obj) {
        if (C0005.m1599() <= 0) {
            return ((Matcher) obj).find();
        }
        return false;
    }

    /* renamed from: ۣ۟ۧ۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m1406(Object obj) {
        if (C0039.m6529() < 0) {
            return ((com.github.catvod.spider.merge.H0.f) obj).e();
        }
        return false;
    }

    /* renamed from: ۣ۟ۧ۠۠, reason: not valid java name and contains not printable characters */
    public static n m1407() {
        if (C0060.m9355() > 0) {
            return n.g;
        }
        return null;
    }

    /* renamed from: ۟ۧۡۦۤ, reason: not valid java name and contains not printable characters */
    public static String m1408() {
        if (C0049.m8038() <= 0) {
            return "year";
        }
        return null;
    }

    /* renamed from: ۟ۧۡۨ۟, reason: not valid java name and contains not printable characters */
    public static String m1409(Object obj) {
        if (C0063.m9589() <= 0) {
            return ((e) obj).b();
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۡۧ, reason: not valid java name and contains not printable characters */
    public static String m1410(Object obj) {
        if (C0047.m7837() >= 0) {
            return ((M) obj).g;
        }
        return null;
    }

    /* renamed from: ۟ۧۧۢ۟, reason: not valid java name and contains not printable characters */
    public static String m1411() {
        if (C0032.m5686() < 0) {
            return "Y";
        }
        return null;
    }

    /* renamed from: ۟ۧۧۧۤ, reason: not valid java name and contains not printable characters */
    public static void m1412(Object obj) {
        if (C0009.m2047() > 0) {
            ((CookieManager) obj).removeAllCookie();
        }
    }

    /* renamed from: ۟ۨۨۨ, reason: not valid java name and contains not printable characters */
    public static StringBuffer m1413(Object obj, double d) {
        if (C0016.m3596() <= 0) {
            return ((StringBuffer) obj).append(d);
        }
        return null;
    }

    /* renamed from: ۠ۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static HashMap m1414() {
        if (C0047.m7837() > 0) {
            return com.github.catvod.spider.merge.B.m.a;
        }
        return null;
    }

    /* renamed from: ۠ۢۢۤ, reason: not valid java name and contains not printable characters */
    public static void m1415(Object obj, Object obj2, Object obj3) {
        if (C0062.m9429() >= 0) {
            ((h) obj).h((o) obj2, (q) obj3);
        }
    }

    /* renamed from: ۠ۧ۟۠, reason: not valid java name and contains not printable characters */
    public static int[] m1416() {
        if (C0001.m1164() <= 0) {
            return com.github.catvod.spider.merge.B.d.a;
        }
        return null;
    }

    /* renamed from: ۠ۨۥۡ, reason: not valid java name and contains not printable characters */
    public static C0174a m1417(Object obj) {
        if (C0012.m3024() > 0) {
            return ((P) obj).a;
        }
        return null;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1418(Object obj, Object obj2, Object obj3) {
        if (C0034.m6048() < 0) {
            return ((com.github.catvod.spider.merge.Z0.a) obj).a(obj2, obj3);
        }
        return false;
    }

    /* renamed from: ۡۡۥ, reason: not valid java name and contains not printable characters */
    public static void m1419(Object obj, Object obj2) {
        if (C0064.m9659() < 0) {
            ((m) obj).D((String) obj2);
        }
    }

    /* renamed from: ۡۢ۟۟, reason: not valid java name and contains not printable characters */
    public static String m1420(Object obj) {
        if (m1463() <= 0) {
            return ((G) obj).b;
        }
        return null;
    }

    /* renamed from: ۡۢۨۨ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.P0.g m1421() {
        if (C0047.m7837() >= 0) {
            return com.github.catvod.spider.merge.P0.g.d;
        }
        return null;
    }

    /* renamed from: ۡۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static HashMap m1422(Object obj) {
        if (C0011.m2755() >= 0) {
            return ((com.github.catvod.spider.merge.G.a) obj).d();
        }
        return null;
    }

    /* renamed from: ۣۡۨۤ, reason: not valid java name and contains not printable characters */
    public static void m1423(Object obj) {
        if (C0001.m1164() < 0) {
            ((A) obj).w();
        }
    }

    /* renamed from: ۣۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.d.c m1424(Object obj) {
        if (C0043.m7332() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.b.e) obj).b;
        }
        return null;
    }

    /* renamed from: ۣۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Logger m1425() {
        if (C0015.m3433() > 0) {
            return AbstractC0296g.e;
        }
        return null;
    }

    /* renamed from: ۣۢۤۧ, reason: not valid java name and contains not printable characters */
    public static String m1426() {
        if (C0030.m5375() >= 0) {
            return "/file/";
        }
        return null;
    }

    /* renamed from: ۣۢۦۡ, reason: not valid java name and contains not printable characters */
    public static String m1427() {
        if (C0051.m8216() <= 0) {
            return "A";
        }
        return null;
    }

    /* renamed from: ۢۥ, reason: not valid java name and contains not printable characters */
    public static String m1428() {
        if (C0010.m2320() < 0) {
            return "时间$time#人气$hits#评分$score";
        }
        return null;
    }

    /* renamed from: ۢۥۡۦ, reason: not valid java name and contains not printable characters */
    public static void m1429(Object obj, Object obj2, int i) {
        if (C0035.m6140() <= 0) {
            ((com.github.catvod.spider.merge.N0.b) obj).h((StringBuffer) obj2, i);
        }
    }

    /* renamed from: ۢۨۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1430(Object obj) {
        if (C0057.m9017() >= 0) {
            return com.github.catvod.spider.merge.M0.d.b((CharSequence) obj);
        }
        return false;
    }

    /* renamed from: ۣ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static void m1431(Object obj, Object obj2, Object obj3, int i, int i2, Object obj4, Object obj5) {
        if (C0011.m2755() >= 0) {
            ((y) obj).a((com.github.catvod.spider.p000mergexbpq.P.B) obj2, obj3, i, i2, (String) obj4, (z) obj5);
        }
    }

    /* renamed from: ۣۤۡۨ, reason: not valid java name and contains not printable characters */
    public static t[] m1432() {
        if (C0062.m9429() > 0) {
            return com.github.catvod.spider.merge.P0.B.f;
        }
        return null;
    }

    /* renamed from: ۣۥۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1433(Object obj) {
        if (C0030.m5375() >= 0) {
            return com.github.catvod.spider.merge.M0.d.c((CharSequence) obj);
        }
        return false;
    }

    /* renamed from: ۣۨۧۧ, reason: not valid java name and contains not printable characters */
    public static Object m1434(Object obj) {
        if (C0014.m3353() <= 0) {
            return ((DialogInterfaceOnCancelListenerC0242c) obj).b;
        }
        return null;
    }

    /* renamed from: ۤ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static void m1435(Object obj, Object obj2, int i, int i2) {
        if (C0025.m4797() >= 0) {
            ((com.github.catvod.spider.merge.l0.h) obj).write((byte[]) obj2, i, i2);
        }
    }

    /* renamed from: ۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m1436(Object obj) {
        if (C0046.m7701() > 0) {
            ((View) obj).destroyDrawingCache();
        }
    }

    /* renamed from: ۤۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m1437(Object obj) {
        if (C0046.m7701() > 0) {
            return ((RunnableC0235D) obj).c;
        }
        return null;
    }

    /* renamed from: ۣۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Looper m1438(Object obj) {
        if (C0031.m5628() >= 0) {
            return ((Context) obj).getMainLooper();
        }
        return null;
    }

    /* renamed from: ۣۣۤ۠, reason: not valid java name and contains not printable characters */
    public static Object[] m1439(Object obj, int i) {
        if (C0032.m5686() <= 0) {
            return Arrays.copyOf((Object[]) obj, i);
        }
        return null;
    }

    /* renamed from: ۣۤۦۢ, reason: not valid java name and contains not printable characters */
    public static Object m1440(Object obj) {
        if (C0004.m1557() < 0) {
            return ((C0271a) obj).e;
        }
        return null;
    }

    /* renamed from: ۤۤۦۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1441(Object obj, Object obj2) {
        if (C0017.m3633() <= 0) {
            return ((C0278h) obj).contains(obj2);
        }
        return false;
    }

    /* renamed from: ۤۥۦۥ, reason: not valid java name and contains not printable characters */
    public static String m1442(Object obj) {
        if (C0035.m6140() <= 0) {
            return ((k) obj).b;
        }
        return null;
    }

    /* renamed from: ۣۤۧۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.U.p m1443() {
        if (C0048.m7971() >= 0) {
            return AbstractC0371d.a;
        }
        return null;
    }

    /* renamed from: ۥ۟ۡۥ, reason: contains not printable characters */
    public static String m1444(Object obj, Object obj2, Object obj3) {
        if (C0020.m4210() < 0) {
            return com.github.catvod.spider.merge.Z.c.k((String) obj, (HashMap) obj2, (Map) obj3);
        }
        return null;
    }

    /* renamed from: ۥۢۡ۠, reason: contains not printable characters */
    public static void m1445(Object obj, Object obj2, Object obj3) {
        if (C0047.m7837() >= 0) {
            ((HBPQ) obj).init((Context) obj2, (String) obj3);
        }
    }

    /* renamed from: ۥۣۥ۠, reason: contains not printable characters */
    public static JSONObject m1446(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0033.m5872() >= 0) {
            return ((FishHxq) obj).q((JSONObject) obj2, (String) obj3, (String) obj4);
        }
        return null;
    }

    /* renamed from: ۥۣۥۥ, reason: contains not printable characters */
    public static m m1447(Object obj, Object obj2, Object obj3) {
        if (C0023.m4566() < 0) {
            return ((com.github.catvod.spider.merge.U.p) obj).d((m) obj2, (m) obj3);
        }
        return null;
    }

    /* renamed from: ۥۤۤۥ, reason: contains not printable characters */
    public static String m1448(Object obj, Object obj2, Object obj3) {
        if (C0043.m7332() > 0) {
            return com.github.catvod.spider.merge.B0.a.m((String) obj, (Map) obj2, (ArrayList) obj3);
        }
        return null;
    }

    /* renamed from: ۥۤۤۨ, reason: contains not printable characters */
    public static boolean m1449(Object obj) {
        if (C0062.m9429() > 0) {
            return com.github.catvod.spider.p000mergexbpq.U.h.b((CharSequence) obj);
        }
        return false;
    }

    /* renamed from: ۥۥۣۨ, reason: contains not printable characters */
    public static void m1450(Object obj, Object obj2, Object obj3) {
        if (C0038.m6471() > 0) {
            ((P) obj).a((String) obj2, (Object[]) obj3);
        }
    }

    /* renamed from: ۥۧ۟, reason: contains not printable characters */
    public static String m1451(Object obj) {
        if (C0006.m1726() <= 0) {
            return com.github.catvod.spider.merge.D.f.k((String) obj);
        }
        return null;
    }

    /* renamed from: ۦۡۤۧ, reason: contains not printable characters */
    public static Q[] m1452(Object obj) {
        if (C0041.m6823() <= 0) {
            return ((C0155l) obj).c;
        }
        return null;
    }

    /* renamed from: ۦۢ۟ۢ, reason: contains not printable characters */
    public static String m1453(Object obj, Object obj2, Object obj3, boolean z) {
        if (C0010.m2320() <= 0) {
            return AList.e((com.github.catvod.spider.merge.G.a) obj, (String) obj2, (String) obj3, z);
        }
        return null;
    }

    /* renamed from: ۦۣۥۢ, reason: contains not printable characters */
    public static int m1454(Object obj) {
        if (C0061.m9359() < 0) {
            return ((com.github.catvod.spider.merge.U.g) obj).a;
        }
        return 0;
    }

    /* renamed from: ۦۣۤۢ, reason: contains not printable characters */
    public static String m1455() {
        if (C0054.m8557() < 0) {
            return "x";
        }
        return null;
    }

    /* renamed from: ۦۧۥۤ, reason: contains not printable characters */
    public static byte[] m1456(Object obj) {
        if (C0001.m1164() <= 0) {
            return ((com.github.catvod.spider.merge.K0.b) obj).b;
        }
        return null;
    }

    /* renamed from: ۦۣۨۢ, reason: contains not printable characters */
    public static boolean m1457(Object obj, Object obj2, long j) {
        if (C0002.m1242() > 0) {
            return ((View) obj).postDelayed((Runnable) obj2, j);
        }
        return false;
    }

    /* renamed from: ۦۨۦۢ, reason: contains not printable characters */
    public static int m1458(Object obj) {
        if (C0013.m3167() > 0) {
            return ((C0266a) obj).d;
        }
        return 0;
    }

    /* renamed from: ۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Runnable m1459(Object obj) {
        if (C0054.m8557() < 0) {
            return Config.sshowQRCode((String) obj);
        }
        return null;
    }

    /* renamed from: ۧۡۡۢ, reason: not valid java name and contains not printable characters */
    public static HashMap m1460(Object obj) {
        if (C0039.m6529() < 0) {
            return ((HBqiJi) obj).a();
        }
        return null;
    }

    /* renamed from: ۣۧۡ۠, reason: not valid java name and contains not printable characters */
    public static String m1461(Object obj) {
        if (C0054.m8557() <= 0) {
            return com.github.catvod.spider.merge.U.c.b((String) obj);
        }
        return null;
    }

    /* renamed from: ۧۤۨۧ, reason: not valid java name and contains not printable characters */
    public static String m1462(Object obj) {
        if (C0022.m4497() >= 0) {
            return ((HBmoou) obj).g;
        }
        return null;
    }

    /* renamed from: ۧۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m1463() {
        return 580 ^ C0043.f745;
    }

    /* renamed from: ۧۨۥ۠, reason: not valid java name and contains not printable characters */
    public static String m1464(String str) {
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

    /* renamed from: ۨ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static TextDirectionHeuristic m1465() {
        if (C0030.m5375() >= 0) {
            return TextDirectionHeuristics.RTL;
        }
        return null;
    }

    /* renamed from: ۣۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m1466() {
        if (C0013.m3167() > 0) {
            return ", quick=";
        }
        return null;
    }

    /* renamed from: ۣۨۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1467(Object obj, Object obj2) {
        if (C0056.m8886() < 0) {
            return ((C0147d) obj).d((C0145b) obj2);
        }
        return false;
    }

    /* renamed from: ۨۢ, reason: not valid java name and contains not printable characters */
    public static d0[] m1468(Object obj) {
        if (C0013.m3167() > 0) {
            return ((Y) obj).b;
        }
        return null;
    }

    /* renamed from: ۨۥ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m1469(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((InputStream) obj).available();
        }
        return 0;
    }

    /* renamed from: ۨۥۨ۟, reason: not valid java name and contains not printable characters */
    public static int m1470(Object obj) {
        if (C0019.m4065() <= 0) {
            return ((AbstractC0412b) obj).a;
        }
        return 0;
    }

    /* renamed from: ۨۦۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m1471(Object obj, Object obj2) {
        if (C0005.m1599() < 0) {
            return ((E) obj).b((String) obj2);
        }
        return false;
    }

    /* renamed from: ۣۨۨ۟, reason: not valid java name and contains not printable characters */
    public static int m1472(Object obj) {
        if (C0048.m7971() >= 0) {
            return ((com.github.catvod.spider.merge.E0.b) obj).a();
        }
        return 0;
    }

    /* renamed from: ۟ۦۢۨ, reason: not valid java name and contains not printable characters */
    public static String m1398(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}