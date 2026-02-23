package com.github.catvod.spider.merge.b0;

import android.app.Activity;
import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Insets;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowInsets;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.Duboku;
import com.github.catvod.spider.HBcms10;
import com.github.catvod.spider.HBdiDuan;
import com.github.catvod.spider.HBlingDu;
import com.github.catvod.spider.HBqwKan;
import com.github.catvod.spider.HBv1Class;
import com.github.catvod.spider.Notice;
import com.github.catvod.spider.Wcai;
import com.github.catvod.spider.merge-xbpq.Q.d0;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0148e;
import com.github.catvod.spider.merge.F0.C0164v;
import com.github.catvod.spider.merge.F0.C0168z;
import com.github.catvod.spider.merge.F0.L;
import com.github.catvod.spider.merge.F0.Q;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.z;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.q;
import com.github.catvod.spider.merge.U0.C0174a;
import com.github.catvod.spider.merge.U0.C0176b;
import com.github.catvod.spider.merge.U0.P;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C;
import com.github.catvod.spider.merge.W.s;
import com.github.catvod.spider.merge.W.t;
import com.github.catvod.spider.merge.X0.C0230a;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0232A;
import com.github.catvod.spider.merge.a0.C0246g;
import com.github.catvod.spider.merge.a0.C0253n;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.C0259u;
import com.github.catvod.spider.merge.a0.M;
import com.github.catvod.spider.merge.a0.RunnableC0234C;
import com.github.catvod.spider.merge.a0.RunnableC0249j;
import com.github.catvod.spider.merge.a0.W;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d.C0266a;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.C0273c;
import com.github.catvod.spider.merge.e.C0281k;
import com.github.catvod.spider.merge.f.AbstractC0296g;
import com.github.catvod.spider.merge.f.C0293d;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0314C;
import com.github.catvod.spider.merge.h0.C0315D;
import com.github.catvod.spider.merge.h0.C0335o;
import com.github.catvod.spider.merge.h0.C0340u;
import com.github.catvod.spider.merge.h0.DialogInterfaceOnClickListenerC0319H;
import com.github.catvod.spider.merge.h0.S;
import com.github.catvod.spider.merge.h0.ViewOnClickListenerC0330j;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.y0.InterfaceC0416b;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.Q.D;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.b0.۟ۧۢۡۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0045 {

    /* renamed from: ۤۥۦ, reason: not valid java name and contains not printable characters */
    public static int f758 = 168;

    /* renamed from: ۟۟۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static Object m7536(Object obj, int i) {
        if (C0061.m9359() < 0) {
            return ((ArrayList) obj).remove(i);
        }
        return null;
    }

    /* renamed from: ۟۟۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static int m7537(Object obj, int i) {
        if (C0060.m9355() > 0) {
            return ((Q) obj).d(i);
        }
        return 0;
    }

    /* renamed from: ۟۟۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static int m7538() {
        return 67 ^ C0019.f446;
    }

    /* renamed from: ۟۟ۦۧۧ, reason: not valid java name and contains not printable characters */
    public static Uri.Builder m7539(Object obj, Object obj2) {
        if (C0038.m6471() >= 0) {
            return ((Uri.Builder) obj).encodedPath((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟۟ۧۡۤ, reason: not valid java name and contains not printable characters */
    public static int m7540(Object obj, Object obj2) {
        if (m7538() < 0) {
            return ((C0281k) obj).f(obj2);
        }
        return 0;
    }

    /* renamed from: ۟۟ۧۧۥ, reason: not valid java name and contains not printable characters */
    public static int m7541(Object obj) {
        if (C0016.m3596() <= 0) {
            return ((S) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟۟ۧۨۥ, reason: not valid java name and contains not printable characters */
    public static C0254o m7542(Object obj) {
        if (C0050.m8121() <= 0) {
            return ((RunnableC0249j) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static Object m7543(Object obj) {
        if (C0041.m6823() < 0) {
            return ((q) obj).d;
        }
        return null;
    }

    /* renamed from: ۟۠ۥۡۢ, reason: not valid java name and contains not printable characters */
    public static ImageButton m7544(Object obj) {
        if (C0033.m5872() > 0) {
            return ((t) obj).d;
        }
        return null;
    }

    /* renamed from: ۟۠ۦۦ۟, reason: not valid java name and contains not printable characters */
    public static String m7545() {
        if (C0044.m7508() <= 0) {
            return "script";
        }
        return null;
    }

    /* renamed from: ۟۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static String m7546() {
        if (C0062.m9429() > 0) {
            return "分类详情";
        }
        return null;
    }

    /* renamed from: ۟ۡ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static String m7547() {
        if (C0010.m2320() <= 0) {
            return "}";
        }
        return null;
    }

    /* renamed from: ۟ۡ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static String m7548(Object obj) {
        if (C0056.m8886() <= 0) {
            return ((com.github.catvod.spider.merge.E.j) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۡۤ۟, reason: not valid java name and contains not printable characters */
    public static Locale m7549() {
        if (C0063.m9589() < 0) {
            return Locale.getDefault();
        }
        return null;
    }

    /* renamed from: ۟ۡۦۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m7550(Object obj) {
        if (C0013.m3167() > 0) {
            return ((com.github.catvod.spider.merge.E0.f) obj).d;
        }
        return false;
    }

    /* renamed from: ۣۣ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static C0314C m7551(Object obj) {
        if (m7538() <= 0) {
            return ((C0315D) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۢۤۥۢ, reason: not valid java name and contains not printable characters */
    public static ScheduledExecutorService m7552(Object obj) {
        if (C0013.m3167() >= 0) {
            return ((C0246g) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۢۦۣۣ, reason: not valid java name and contains not printable characters */
    public static Iterator m7553(Object obj) {
        if (C0059.m9257() <= 0) {
            return ((JSONObject) obj).keys();
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static Bitmap m7554(int i, int i2, Object obj) {
        if (C0001.m1164() <= 0) {
            return Bitmap.createBitmap(i, i2, (Bitmap.Config) obj);
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static int[] m7555() {
        if (C0022.m4497() >= 0) {
            return C0273c.e;
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static Map.Entry m7556(Object obj, Object obj2, Object obj3) {
        if (C0048.m7971() >= 0) {
            return ((HBlingDu) obj).getd((Map) obj2, (Map) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۥۧ, reason: not valid java name and contains not printable characters */
    public static String m7557() {
        if (C0062.m9429() > 0) {
            return "');\n            background-position: center; /* 背景图水平和垂直方向都居中 */\n            background-size: cover; /* 保持图片比例并覆盖整个容器 */\n            background-repeat: no-repeat; /* 防止图片重复平铺 */\n            background-attachment: fixed; /* 固定背景图，滚动时不跟随移动 */\n\n            font-family: 'Segoe UI', Arial, sans-serif;\n\n            color: #333;\n            line-height: 1.6;\n            display: flex;\n            flex-direction: column;\n            align-items: center;\n            min-height: 100vh;\n\n        }\n\n        .app-header i {\n            color: #e67e22; /* 橙色 */\n            animation: pulse 2s infinite ease-in-out;\n            filter: drop-shadow(0 2px 4px rgba(0,0,0,0.1));\n        }\n\n        @keyframes pulse {\n            0% { transform: scale(1); }\n            50% { transform: scale(1.08); }\n            100% { transform: scale(1); }\n        }\n\n        .title-group {\n            display: flex;\n            flex-direction: column;\n            text-align: left;\n        }\n\n        .app-header h1 {\n            font-size: 1.4em;\n            text-align: center;\n            color: #2c3e50;\n            margin: 0;\n            font-weight: 700;\n            letter-spacing: -0.5px;\n        }\n\n        .app-header .subtitle {\n            font-size: 0.8em;\n            color: #7f8c8d;\n            margin: 2px 0 0;\n            font-weight: 400;\n        }\n\n        /* 平台色定义（CSS 变量） */\n        :root {\n            --aiqiyi-color: #27ae60;\n            --youku-gradient: linear-gradient(135deg, #ff8c00, #0099ff);\n            --mango-yellow: #fdd000;\n            --sohu-color: #e74c3c;\n            --bilibili-pink: #fb7299;\n            --tencent-gradient: linear-gradient(to right, #FFC300 0%, #00D1B2 70%, #00A0E9 90%);\n            --focus-outline: 3px solid #006400;\n            --focus-shadow: 0 0 8px rgba(0, 100, 0, 0.5);\n        }\n\n        /* 渐变边框标题装饰  */\n        .header-decoration {\n            height: 3px;\n            width: 90%;\n            max-width: 520px;\n            background: linear-gradient(\n                    to right,\n                    var(--aiqiyi-color) 0% 16.666%,\n                    #f39c12 16.666% 33.333%,\n                    #ff8c00 33.333% 50%,\n                    var(--mango-yellow) 50% 66.666%,\n                    var(--sohu-color) 66.666% 83.333%,\n                    var(--bilibili-pink) 83.333% 100%\n            );\n            border-radius: 2px;\n            margin: 8px auto 8px;\n            opacity: 0.8;\n        }\n\n        /* 搜索容器 */\n        .search-container {\n            background: white;\n            padding: 16px;\n            border-radius: 12px;\n            box-shadow: 0 6px 20px rgba(0, 0, 0, 0.1);\n            width: 90%;\n            max-width: 520px;\n            margin-bottom: 5px;\n        }\n\n        /* 核心：父容器启用flex布局 */\n        .search-wrapper {\n            position: relative;\n            margin-bottom: 12px;\n            display: flex; /* 启用弹性布局 */\n            align-items: center; /* 垂直居中对齐 */\n            gap: 8px; /* 输入框与按钮的间距（自动适配） */\n        }\n        .search-wrapper input[type=\"text\"]:focus {\n            border-color: var(--tencent-gradient);\n            box-shadow: 0 0 0 2px rgba(0, 191, 255, 0.1);\n        }\n        .search-wrapper input[type=\"text\"] {\n            /* 移除width: auto和flex: 1的冲突，改用flex占满剩余空间 */\n            flex: 1; /* 自动填充剩余空间 */\n            padding: 10px 14px; /* 移除固定右侧padding，避免冗余间距 */\n            font-size: 14px;\n            border: 1px solid #ddd;\n            border-radius: 8px;\n            outline: none;\n            transition: border-color 0.3s;\n            box-sizing: border-box; /* 确保padding不影响总宽度 */\n        }\n\n        .search-wrapper button {\n            /* 移除绝对定位，改用flex布局自然排列 */\n            width: 28px;\n            height: 28px;\n            background: var(--tencent-gradient);\n            color: white;\n            border: none;\n            border-radius: 50%;\n            cursor: pointer;\n            display: flex;\n            align-items: center;\n            justify-content: center;\n            padding: 0;\n            transition: all 0.2s ease;\n            /* 固定按钮尺寸，不随容器拉伸 */\n            flex-shrink: 0;\n        }\n\n        .search-wrapper button:hover,\n        .search-wrapper button:focus {\n            transform: translateY(-0%) scale(1.05);\n            box-shadow: 0 0 0 2px rgba(0, 191, 255, 0.2);\n        }\n\n        .search-wrapper button i {\n            font-size: 13px;\n        }\n\n        /* 按钮布局 */\n        .button-row {\n            display: grid;\n            grid-template-columns: 1fr 1fr 1fr;\n            gap: 8px;\n            width: 100%;\n        }\n\n        .action-btn.full-btn {\n            padding: 8px 0;\n            font-size: 13px;\n            border-radius: 8px;\n            border: none;\n            color: white;\n            background: #555;\n            cursor: pointer;\n            display: flex;\n            align-items: center;\n            justify-content: center;\n            gap: 6px;\n            transition: all 0.3s ease;\n            outline: none;\n        }\n\n        .action-btn.full-btn i {\n            font-size: 14px;\n            width: 18px;\n            text-align: center;\n        }\n\n        .action-btn.full-btn[data-type=\"search\"] {\n            background: var(--tencent-gradient);\n        }\n\n        .action-btn.full-btn[data-type=\"qrcode\"] {\n            background: linear-gradient(135deg, #9b59b6, #8e44ad);\n        }\n\n        .action-btn.full-btn[data-type=\"danmu\"] {\n            background: #3498db;\n        }\n\n        /* 聚焦高亮：绿色外框 + 绿色标题文字 */\n        .action-btn.full-btn:focus,\n        .movie a:focus {\n            outline: var(--focus-outline);\n            outline-offset: 2px;\n            box-shadow: var(--focus-shadow);\n        }\n\n        /* 视频设计 */\n        .movie {\n            width: 100%;\n            height: 120px;\n            text-align: center;\n            background-color: #fff;\n            border-radius: 8px;\n            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n            overflow: hidden;\n            transition: transform 0.3s ease, box-shadow 0.3s ease;\n            position: relative;\n        }\n\n        .movie a {\n            position: relative;\n            display: block;\n            height: 100%;\n            outline: none;\n        }\n\n        .movie img {\n            width: 100%;\n            height: 78%;\n            object-fit: cover;\n            transition: transform 0.3s ease;\n        }\n\n        .movie a:focus img {\n            transform: scale(1.08);\n        }\n\n        .movie-tag {\n            position: absolute;\n            bottom: 32px;\n            right: 6px;\n            display: flex;\n            align-items: center;\n            gap: 4px;\n            color: #fff;\n            font-size: 9px;\n            padding: 2px 6px;\n            border-radius: 4px;\n            z-index: 2;\n            box-shadow: 0 1px 3px rgba(0, 0, 0, 0.3);\n            white-space: nowrap;\n        }\n\n        .movie-tag.aiqiyi { background-color: var(--aiqiyi-color); }\n        .movie-tag.tencent { background: var(--tencent-gradient); }\n        .movie-tag.youku { background: var(--youku-gradient); }\n        .movie-tag.mango { background-color: var(--mango-yellow); color: #000; }\n        .movie-tag.sohu { background-color: var(--sohu-color); }\n        .movie-tag.bilibili { background-color: var(--bilibili-pink); }\n\n        /*  暗色模式 */\n        .movie-title {\n            color: #333;\n            height: 22%;\n            padding: 4px 6px;\n            font-weight: bold;\n            font-size: 11px;\n            overflow: hidden;\n            white-space: nowrap;\n            text-overflow: ellipsis;\n            background-color: #ffffff;\n            text-shadow: 1px 1px 1px rgba(255, 255, 255, 0.3);\n            position: absolute;\n            bottom: 0;\n            left: 0;\n            width: 100%;\n            z-index: 1;\n            pointer-events: none;\n            transition: background-color 0.3s ease, color 0.3s ease;\n        }\n\n        @media (prefers-color-scheme: dark) {\n            .movie-title {\n                background-color: rgba(0, 0, 0, 0.85);\n                color: #ffffff;\n                text-shadow: 1px 1px 2px rgba(0, 0, 0, 0.9);\n            }\n        }\n\n        .movie a:focus .movie-title {\n            color: #00cc00;\n        }\n\n        /* 剧集列表容器 */\n        .movie-container {\n            display: grid;\n            grid-template-columns: repeat(3, 1fr);\n            gap: 12px;\n            width: 90%;\n            max-width: 520px;\n            margin: 16px auto 0;\n        }\n\n        /* 移动端排列 */\n        @media (max-width: 768px) {\n            .movie-container {\n                grid-template-columns: repeat(3, 1fr);\n                gap: 10px;\n                padding: 0 8px;\n            }\n            .movie {\n                height: 120px;\n            }\n            .movie img {\n                height: 76%;\n            }\n            .movie-title {\n                font-size: 10px;\n                height: 24%;\n                padding: 3px 6px;\n            }\n            .movie-tag {\n                font-size: 8px;\n                padding: 2px 5px;\n            }\n        }\n\n        @media (max-width: 480px) {\n            .movie-container {\n                grid-template-columns: repeat(3, 1fr);\n                gap: 10px;\n            }\n            .movie {\n                height: 110px;\n            }\n            .movie img {\n                height: 74%;\n            }\n            .movie-title {\n                font-size: 9px;\n                height: 24%;\n            }\n        }\n\n        /* 暗色模式适配 */\n        @media (prefers-color-scheme: dark) {\n            body {\n                background: linear-gradient(135deg, #1a1a1a 0%, #2c2c2c 100%);\n                color: #eee;\n            }\n            .search-container,\n            #danmuPanel {\n                background: #2a2a2a;\n                border: 1px solid #444;\n            }\n            .search-wrapper input[type=\"text\"] {\n                background: #333;\n                color: #fff;\n                border-color: #555;\n            }\n            .movie {\n                background-color: #2a2a2a;\n                box-shadow: 0 0 8px rgba(255, 255, 255, 0.05);\n            }\n            .movie img {\n                filter: brightness(0.9);\n            }\n            .status-message {\n                background-color: #006400 !important;\n            }\n        }\n\n        /* 弹幕输入面板样式 */\n        #danmuPanel {\n            width: 90%;\n            max-width: 520px;\n            margin-top: 16px;\n            padding: 16px;\n            background: #f8f9fa;\n            border-radius: 8px;\n            border: 1px solid #eee;\n        }\n\n        #danmuPanel textarea,\n        #danmuPanel input {\n            width: 100%;\n            padding: 8px;\n            border: 1px solid #ddd;\n            border-radius: 6px;\n            font-size: 13px;\n            margin-bottom: 10px;\n        }\n\n        #danmuPanel input {\n            padding: 6px 8px;\n        }\n\n        #sendDanmuBtn {\n            width: 100%;\n            padding: 10px;\n            background: var(--tencent-gradient);\n            color: white;\n            border: none;\n            border-radius: 6px;\n            font-size: 14px;\n            cursor: pointer;\n        }\n\n        /* 状态提示 */\n        .status-message {\n            opacity: 0;\n            visibility: hidden;\n            background-color: #006400;\n            color: white;\n            font-size: 14px;\n            padding: 10px 16px;\n            border-radius: 8px;\n            position: fixed;\n            top: 20px;\n            left: 50%;\n            transform: translateX(-50%);\n            box-shadow: 0 4px 12px rgba(0,0,0,0.2);\n            transition: opacity 0.3s ease, visibility 0.3s ease;\n            z-index: 1000;\n            max-width: 90%;\n            text-align: center;\n        }\n\n        .status-message.show {\n            opacity: 1;\n            visibility: visible;\n        }\n\n        /* 移动端字体微调 */\n        @media (max-width: 768px) {\n            .search-container {\n                padding: 12px 16px;\n            }\n            .button-row {\n                gap: 6px;\n            }\n            .action-btn.full-btn {\n                font-size: 13px;\n                padding: 8px 0;\n            }\n            .action-btn.full-btn i {\n                font-size: 12px;\n                width: 16px;\n            }\n            .app-header h1 { font-size: 1.3em; }\n            .app-header .subtitle { font-size: 0.75em; }\n        }\n    </style>\n</head>\n<body>\n    <button \n        style=\"position: absolute; right: 20px; top: 30px; transform: translateY(-50%); \n               background: none; border: none; cursor: pointer; font-size: 1.2em;\n               color: #667eea; transition: all 0.2s ease;\"\n        onclick=\"fetch('";
        }
        return null;
    }

    /* renamed from: ۣۣ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m7558(Object obj, Object obj2) {
        if (C0011.m2755() >= 0) {
            ((C0253n) obj).k((String) obj2);
        }
    }

    /* renamed from: ۣ۟ۤۤ۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m7559(Object obj) {
        if (C0016.m3596() < 0) {
            return ((com.github.catvod.spider.merge.U.n) obj).g();
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static String m7560(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0061.m9359() <= 0) {
            return ((HBdiDuan) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۟ۥ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m7561(Object obj) {
        if (C0064.m9659() <= 0) {
            return s.d((File) obj);
        }
        return false;
    }

    /* renamed from: ۣ۟ۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.E.m m7562(Object obj, Object obj2) {
        if (C0017.m3633() < 0) {
            return ((C0232A) obj).g((com.github.catvod.spider.merge.E.j) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۤۢۤۥ, reason: not valid java name and contains not printable characters */
    public static ArrayList m7563(Object obj, Object obj2, Object obj3, boolean z) {
        if (C0016.m3596() < 0) {
            return C0246g.i((com.github.catvod.spider.merge.F.j) obj, (String) obj2, (String) obj3, z);
        }
        return null;
    }

    /* renamed from: ۟ۤۢۨۦ, reason: not valid java name and contains not printable characters */
    public static void m7564(Object obj, int i) {
        if (C0025.m4797() >= 0) {
            ((WebView) obj).setScrollBarStyle(i);
        }
    }

    /* renamed from: ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static Appendable m7565(Object obj, char c) {
        if (C0003.m1463() < 0) {
            return ((Appendable) obj).append(c);
        }
        return null;
    }

    /* renamed from: ۟ۤۥۤ۟, reason: not valid java name and contains not printable characters */
    public static int[] m7566() {
        if (C0025.m4797() > 0) {
            return P.u;
        }
        return null;
    }

    /* renamed from: ۟ۤۦۢۥ, reason: not valid java name and contains not printable characters */
    public static int m7567(Object obj, int i) {
        if (C0024.m4693() < 0) {
            return ((C0174a) obj).o(i);
        }
        return 0;
    }

    /* renamed from: ۣ۟ۤۧۤ, reason: not valid java name and contains not printable characters */
    public static C0168z m7568(Object obj) {
        if (C0025.m4797() >= 0) {
            return ((C0164v) obj).f;
        }
        return null;
    }

    /* renamed from: ۟ۤۨ۟۠, reason: not valid java name and contains not printable characters */
    public static String m7569(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0035.m6140() < 0) {
            return ((C0232A) obj).c((String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* renamed from: ۟ۥ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static int m7570(Object obj) {
        if (m7538() <= 0) {
            return ((z) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۥ۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static String m7571() {
        if (C0032.m5686() <= 0) {
            return "内详";
        }
        return null;
    }

    /* renamed from: ۟ۥۡۡۥ, reason: not valid java name and contains not printable characters */
    public static String m7572(Object obj) {
        if (C0005.m1599() <= 0) {
            return ((M) obj).t;
        }
        return null;
    }

    /* renamed from: ۟ۥۢۨ۠, reason: not valid java name and contains not printable characters */
    public static Object m7573(Object obj) {
        if (C0057.m9017() >= 0) {
            return ((com.github.catvod.spider.merge.U.g) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۥۣ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m7574(Object obj) {
        if (C0020.m4210() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.P.s) obj).l;
        }
        return 0;
    }

    /* renamed from: ۟ۥۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m7575() {
        if (C0000.m1116() < 0) {
            return "/proxy?do=seachdanmu&go=dianshisaoma')\n        .then(() => showMessage('请扫码推送', 'success'))\n        .catch(() => showMessage('❌ 请求失败', 'failure'));\n      setTimeout(hideMessage, 3000);\n    }\n\n    // 新增：跳转主页（点击封面触发）\n    function goToHome() {\n      // 请修改为你实际的主页地址\n      window.history.back();    \n    }\n\n    // ========================\n    // 消息系统\n    // ========================\n    function showMessage(text, type) {\n      messageEl.textContent = text;\n      messageEl.className = `message ${type}`;\n      messageEl.style.display = 'block';\n    }\n\n    function hideMessage() {\n      messageEl.style.display = 'none';\n    }\n  </script>\n\n</body></html>";
        }
        return null;
    }

    /* renamed from: ۟ۥۦۢ۠, reason: not valid java name and contains not printable characters */
    public static void m7576(Object obj) {
        if (C0031.m5628() > 0) {
            ((C0246g) obj).z();
        }
    }

    /* renamed from: ۟ۦ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static String[] m7577() {
        if (C0064.m9659() < 0) {
            return C0230a.s;
        }
        return null;
    }

    /* renamed from: ۟ۦ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static D m7578(Object obj) {
        if (C0005.m1599() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.R.e) obj).f;
        }
        return null;
    }

    /* renamed from: ۟ۦۣ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m7579(String str) {
        String string = "";
        int i = 0;
        String str2 = "";
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * 10)) ^ i).toString();
            i++;
            str2 = string2;
        }
        while (string.length() > 0) {
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i2)) << 4) | string.indexOf(str.charAt(i2 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        return new String(byteArray);
    }

    /* renamed from: ۟ۦۡۦۧ, reason: not valid java name and contains not printable characters */
    public static void m7580(Object obj) {
        if (m7538() <= 0) {
            C0340u.d((Button) obj);
        }
    }

    /* renamed from: ۟ۦۥۥۧ, reason: not valid java name and contains not printable characters */
    public static void m7581(Object obj, Object obj2) {
        if (C0000.m1116() < 0) {
            ((AdapterView) obj).setOnItemSelectedListener((AdapterView.OnItemSelectedListener) obj2);
        }
    }

    /* renamed from: ۟ۦۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m7582(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0037.m6350() <= 0) {
            return ((HBqwKan) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۦۦۨ, reason: not valid java name and contains not printable characters */
    public static void m7583(Object obj) {
        if (C0000.m1116() <= 0) {
            ((com.github.catvod.spider.merge.E.g) obj).f();
        }
    }

    /* renamed from: ۟ۦۣۣۧ, reason: not valid java name and contains not printable characters */
    public static Locale m7584(Object obj) {
        if (C0017.m3633() < 0) {
            return ((com.github.catvod.spider.merge.P0.n) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۧ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static void m7585(Object obj) {
        if (C0027.m5017() > 0) {
            ((W) obj).j();
        }
    }

    /* renamed from: ۟ۧۢۨۡ, reason: not valid java name and contains not printable characters */
    public static Insets m7586(Object obj, int i) {
        if (C0047.m7837() > 0) {
            return ((WindowInsets) obj).getInsets(i);
        }
        return null;
    }

    /* renamed from: ۣۣۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Object m7587(Object obj, Object obj2) {
        if (C0041.m6823() < 0) {
            return ((InterfaceC0416b) obj).callBy((Map) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۧۤ۟۟, reason: not valid java name and contains not printable characters */
    public static void m7588(Object obj) {
        if (C0058.m9131() <= 0) {
            ((com.github.catvod.spider.merge.E0.h) obj).b();
        }
    }

    /* renamed from: ۟ۧۥۥۦ, reason: not valid java name and contains not printable characters */
    public static Object m7589(Object obj) {
        if (C0038.m6471() >= 0) {
            return ((View) obj).getTag();
        }
        return null;
    }

    /* renamed from: ۟ۧۦۣ۠, reason: not valid java name and contains not printable characters */
    public static String m7590(Object obj) {
        if (C0037.m6350() < 0) {
            return com.github.catvod.spider.merge.E0.h.c((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۧۧۥ۠, reason: not valid java name and contains not printable characters */
    public static String m7591(Object obj, Object obj2) {
        if (C0044.m7508() <= 0) {
            return ((HBcms10) obj).detailContent((List) obj2);
        }
        return null;
    }

    /* renamed from: ۠۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static String m7592() {
        if (C0035.m6140() <= 0) {
            return "getJsonArrayStringAction()错误！-->";
        }
        return null;
    }

    /* renamed from: ۠ۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m7593() {
        if (C0039.m6529() <= 0) {
            return HBv1Class.f;
        }
        return null;
    }

    /* renamed from: ۠ۦ۟۠, reason: not valid java name and contains not printable characters */
    public static String[] m7594() {
        if (C0044.m7508() < 0) {
            return C0176b.x;
        }
        return null;
    }

    /* renamed from: ۠ۧۢۢ, reason: not valid java name and contains not printable characters */
    public static String m7595() {
        if (C0002.m1242() >= 0) {
            return "area";
        }
        return null;
    }

    /* renamed from: ۣۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m7596(Object obj) {
        if (C0046.m7701() > 0) {
            return ((com.github.catvod.spider.merge.E0.b) obj).b();
        }
        return 0;
    }

    /* renamed from: ۡ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static d0[] m7597(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.Q.a) obj).c;
        }
        return null;
    }

    /* renamed from: ۡ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m7598(Object obj) {
        if (C0027.m5017() >= 0) {
            return ((Wcai) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۡ۟۟, reason: not valid java name and contains not printable characters */
    public static HashMap m7599(Object obj) {
        if (C0058.m9131() <= 0) {
            return ((com.github.catvod.spider.merge.F0.S) obj).a;
        }
        return null;
    }

    /* renamed from: ۡۤۨۥ, reason: not valid java name and contains not printable characters */
    public static String m7600(Object obj) {
        if (C0039.m6529() <= 0) {
            return ((com.github.catvod.spider.merge.N0.b) obj).o;
        }
        return null;
    }

    /* renamed from: ۡۦۢۨ, reason: not valid java name and contains not printable characters */
    public static String m7601(Object obj) {
        if (C0016.m3596() <= 0) {
            return ((C0335o) obj).k;
        }
        return null;
    }

    /* renamed from: ۣۡۧۤ, reason: not valid java name and contains not printable characters */
    public static int m7602(Object obj) {
        if (C0006.m1726() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.R.b) obj).c;
        }
        return 0;
    }

    /* renamed from: ۡۧۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m7603(Object obj, Object obj2) {
        if (C0044.m7508() <= 0) {
            return ((List) obj).addAll((Collection) obj2);
        }
        return false;
    }

    /* renamed from: ۡۨۦۢ, reason: not valid java name and contains not printable characters */
    public static void m7604(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0017.m3633() < 0) {
            ((C0246g) obj).o((String) obj2, (com.github.catvod.spider.merge.F.h) obj3, (ArrayList) obj4, (ArrayList) obj5);
        }
    }

    /* renamed from: ۣۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static ClassLoader m7605(Object obj) {
        if (C0003.m1463() < 0) {
            return ((Class) obj).getClassLoader();
        }
        return null;
    }

    /* renamed from: ۢۡۢۧ, reason: not valid java name and contains not printable characters */
    public static String m7606(Object obj) {
        if (C0043.m7332() > 0) {
            return ((Package) obj).getName();
        }
        return null;
    }

    /* renamed from: ۢۢۢۨ, reason: not valid java name and contains not printable characters */
    public static long m7607(Object obj) {
        if (C0029.m5282() > 0) {
            return ((com.github.catvod.spider.merge.l0.d) obj).a;
        }
        return 0L;
    }

    /* renamed from: ۢۥۧۥ, reason: not valid java name and contains not printable characters */
    public static void m7608(Object obj) {
        if (C0057.m9017() >= 0) {
            Notice.show((String) obj);
        }
    }

    /* renamed from: ۢۦۦ۠, reason: not valid java name and contains not printable characters */
    public static String m7609(Object obj) {
        if (C0062.m9429() > 0) {
            return com.github.catvod.spider.merge.D.f.u((String) obj);
        }
        return null;
    }

    /* renamed from: ۣۢۨ۟, reason: not valid java name and contains not printable characters */
    public static String m7610(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0028.m5152() < 0) {
            return ((Duboku) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣۣۣۦ, reason: not valid java name and contains not printable characters */
    public static int m7611(Object obj) {
        if (C0064.m9659() <= 0) {
            return ((com.github.catvod.spider.merge.d0.e) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣۤۥ۠, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.n0.b m7612(Object obj) {
        if (C0052.m8320() > 0) {
            return com.github.catvod.spider.p000mergexbpq.n0.c.e((String) obj);
        }
        return null;
    }

    /* renamed from: ۣۦۦۡ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.c0.g m7613(Object obj) {
        if (C0050.m8121() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.h) obj).s0();
        }
        return null;
    }

    /* renamed from: ۤۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Object m7614(Object obj) {
        if (C0012.m3024() > 0) {
            return ((AbstractC0296g) obj).get();
        }
        return null;
    }

    /* renamed from: ۤۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m7615(Object obj) {
        if (C0059.m9257() < 0) {
            return ((ViewOnClickListenerC0330j) obj).a;
        }
        return 0;
    }

    /* renamed from: ۤۥۣۨ, reason: not valid java name and contains not printable characters */
    public static boolean m7616(Object obj) {
        if (C0056.m8886() <= 0) {
            return ((File) obj).mkdirs();
        }
        return false;
    }

    /* renamed from: ۤۥۨۨ, reason: not valid java name and contains not printable characters */
    public static String m7617(Object obj) {
        if (C0059.m9257() < 0) {
            return ((com.github.catvod.spider.merge.I.c) obj).b();
        }
        return null;
    }

    /* renamed from: ۤۧۨۦ, reason: not valid java name and contains not printable characters */
    public static HashMap m7618() {
        if (C0056.m8886() <= 0) {
            return com.github.catvod.spider.merge.d1.a.b;
        }
        return null;
    }

    /* renamed from: ۤۨۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m7619(Object obj) {
        if (C0007.m1886() > 0) {
            return ((C0232A) obj).f();
        }
        return false;
    }

    /* renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public static Switch m7620(Object obj) {
        if (C0035.m6140() < 0) {
            return ((DialogInterfaceOnClickListenerC0319H) obj).e;
        }
        return null;
    }

    /* renamed from: ۥۢ۟ۤ, reason: contains not printable characters */
    public static String m7621(Object obj) {
        if (C0053.m8389() >= 0) {
            return C0259u.d((String) obj);
        }
        return null;
    }

    /* renamed from: ۥۢ۟ۦ, reason: contains not printable characters */
    public static WebView m7622(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((C) obj).c;
        }
        return null;
    }

    /* renamed from: ۥۢۢۦ, reason: contains not printable characters */
    public static int m7623(Object obj) {
        if (C0004.m1557() <= 0) {
            return ((DisplayMetrics) obj).widthPixels;
        }
        return 0;
    }

    /* renamed from: ۥۢۥۦ, reason: contains not printable characters */
    public static Object m7624(Object obj) {
        if (C0033.m5872() > 0) {
            return ((Map.Entry) obj).getKey();
        }
        return null;
    }

    /* renamed from: ۥۢۧ۠, reason: contains not printable characters */
    public static int m7625(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۥۣۣۣ, reason: contains not printable characters */
    public static String m7626() {
        if (C0042.m7147() <= 0) {
            return "') no-repeat center center;\n      background-size: cover;\n      color: white;\n      text-align: center;\n      padding: 70px 16px 30px;\n      border-radius: var(--radius) var(--radius) 0 0;\n      overflow: hidden;\n    }\n\n    .poster-header::before {\n      content: '';\n      position: absolute;\n      top: 0; left: 0; right: 0; bottom: 0;\n      background: linear-gradient(135deg, rgba(0, 0, 0, 0.7), rgba(30, 136, 229, 0.6));\n      z-index: 1;\n    }\n\n    .poster-content {\n      position: relative;\n      z-index: 2;\n    }\n\n    /* 圆形封面：缩小为 90px */\n    .cover-circle {\n      width: 90px;\n      height: 90px;\n      border-radius: 50%;\n      border: 3px solid white;\n      box-shadow: 0 4px 12px rgba(0, 0, 0, 0.3);\n      margin: 0 auto 10px;\n      background: inherit;\n      background-position: center;\n      background-size: cover;\n      position: relative;\n      cursor: pointer;\n      transition: var(--transition);\n    }\n\n    /* 中心主页图标：尺寸适中 */\n    .cover-circle::after {\n      content: \"\\f015\"; /* Font Awesome home 图标 */\n      font-family: \"Font Awesome 6 Free\";\n      font-weight: 900;\n      font-size: 22px;\n      color: white;\n      position: absolute;\n      top: 50%;\n      left: 50%;\n      transform: translate(-50%, -50%);\n      text-shadow: 0 1px 3px rgba(0, 0, 0, 0.6);\n      z-index: 2;\n    }\n\n    .cover-circle:hover, .cover-circle:focus {\n      transform: scale(1.04);\n      outline: none;\n      box-shadow: 0 0 0 4px rgba(255, 255, 255, 0.5);\n    }\n\n    .cover-circle:active {\n      transform: scale(0.98);\n    }\n\n    h1 {\n      font-size: 1.5em;\n      font-weight: 700;\n      margin-bottom: 6px;\n      text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.6);\n    }\n\n    .subtitle {\n      font-size: 0.9em;\n      opacity: 0.9;\n      margin-bottom: 16px;\n      text-shadow: 1px 1px 3px rgba(0, 0, 0, 0.5);\n    }\n\n    /* 三个按钮一排，紧凑布局 */\n    .actions {\n      display: flex;\n      justify-content: center;\n      gap: 10px;\n      margin-bottom: 14px;\n    }\n\n    .btn {\n      flex: 1;\n      min-width: 85px;\n      padding: 7px 6px;\n      border: none;\n      border-radius: 8px;\n      font-size: 12px;\n      font-weight: 600;\n      cursor: pointer;\n      transition: var(--transition);\n      display: inline-flex;\n      align-items: center;\n      justify-content: center;\n      gap: 6px;\n      position: relative;\n      outline: none;\n    }\n\n    .btn-primary {\n      background: white;\n      color: var(--primary-dark);\n      box-shadow: 0 2px 6px rgba(0, 0, 0, 0.18);\n    }\n\n    .btn-primary:hover, .btn-primary:focus {\n      background: #f8f8f8;\n      box-shadow: var(--btn-hover);\n      transform: translateY(-2px);\n      outline: none;\n      box-shadow: var(--focus-ring), var(--btn-hover);\n    }\n\n    .btn-primary:active {\n      transform: var(--btn-active);\n      background: #eee;\n    }\n\n    .btn-outline {\n      background: transparent;\n      color: white;\n      border: 1.8px solid rgba(255, 255, 255, 0.8);\n      backdrop-filter: blur(4px);\n      box-shadow: 0 2px 6px rgba(255, 255, 255, 0.1);\n    }\n\n    .btn-outline:hover, .btn-outline:focus {\n      background: rgba(255, 255, 255, 0.18);\n      box-shadow: 0 3px 10px rgba(255, 255, 255, 0.25);\n      transform: translateY(-2px);\n      outline: none;\n      box-shadow: 0 0 0 3px rgba(255, 255, 255, 0.3);\n    }\n\n    .btn-outline:active {\n      transform: var(--btn-active);\n      background: rgba(255, 255, 255, 0.1);\n    }\n\n    /* 弹幕输入面板 */\n    .input-panel {\n      margin: 12px auto 0;\n      max-width: 500px;\n      padding: 14px;\n      background: rgba(255, 255, 255, 0.2);\n      backdrop-filter: blur(6px);\n      border-radius: 10px;\n      border: 1px solid rgba(255, 255, 255, 0.3);\n      /* 初始不显示，通过JS动态控制 */\n    }\n\n    .input-panel h3 {\n      font-size: 1em;\n      margin-bottom: 10px;\n      color: white;\n      text-shadow: 1px 1px 2px rgba(0, 0, 0, 0.5);\n    }\n\n    textarea, input {\n      width: 100%;\n      padding: 7px 9px;\n      border: 1px solid rgba(255, 255, 255, 0.4);\n      border-radius: 6px;\n      font-size: 13px;\n      margin-bottom: 10px;\n      resize: vertical;\n      background: rgba(255, 255, 255, 0.1);\n      color: white;\n      transition: var(--transition);\n    }\n\n    textarea::placeholder, input::placeholder {\n      color: rgba(255, 255, 255, 0.6);\n    }\n\n    textarea:focus, input:focus {\n      border-color: white;\n      outline: none;\n      box-shadow: 0 0 0 3px rgba(255, 255, 255, 0.3);\n    }\n\n    .input-row {\n      display: flex;\n      gap: 10px;\n      align-items: center;\n      margin-bottom: 10px;\n    }\n\n    .input-row label {\n      white-space: nowrap;\n      font-weight: 500;\n      font-size: 13px;\n      color: white;\n      width: 55px;\n    }\n\n    .input-row input {\n      flex: 1;\n      margin: 0;\n    }\n\n    .send-btn {\n      background: white;\n      color: var(--primary-dark);\n      padding: 9px 14px;\n      border: none;\n      border-radius: 8px;\n      cursor: pointer;\n      font-size: 13px;\n      font-weight: 600;\n      width: 100%;\n      transition: var(--transition);\n      outline: none;\n    }\n\n    .send-btn:hover, .send-btn:focus {\n      background: #f5f5f5;\n      transform: translateY(-1px);\n      box-shadow: var(--focus-ring);\n    }\n\n    .send-btn:active {\n      transform: translateY(1px);\n    }\n\n    .message {\n      margin-top: 16px;\n      padding: 10px;\n      border-radius: 6px;\n      font-size: 14px;\n      text-align: center;\n      display: none;\n    }\n\n    .message.success {\n      background: #e8f5e9;\n      color: var(--success);\n      border: 1px solid #c8e6c9;\n    }\n\n    .message.failure {\n      background: #ffebee;\n      color: var(--danger);\n      border: 1px solid #ffcdd2;\n    }\n\n    /* 剧集列表 */\n    .episode-section {\n      padding: 4px 8px;\n      background: white;\n      border-radius: 0 0 var(--radius) var(--radius);\n      text-align: center; /* 让标题和网格都居中 */\n    }\n\n     .section-title {\n      margin-top: 10px;\n      margin-bottom: 10px; /* 增加与下方网格的间距 */\n      display: inline-block; /* 让标题背景只包裹文字 */\n    }\n    \n    .section-title span {\n      background: #ff0000;\n      color: white;\n      margin-top: 10px;\n      padding: 3px 8px;\n      border-radius: 4px;\n      font-weight: bold;\n      font-size: 0.9em;\n    }\n\n    /* 修改剧集网格布局为自适应流式布局 */\n    .episode-grid {\n      display: flex;\n      flex-wrap: wrap;\n      gap: 9px;\n      margin-top: 10px;\n      justify-content: center; /* 关键：让卡片在容器中居中对齐 */\n    }\n    /* 修改剧集卡片样式，使其宽度适应内容 */\n    .episode-card {\n      background: #f9f9f9;\n      border-radius: 8px;\n      padding: 9px 12px;\n      text-align: center;\n      cursor: pointer;\n      transition: var(--transition);\n      box-shadow: var(--shadow-card);\n      position: relative;\n      font-size: 0.9em;\n      font-weight: 500;\n      white-space: nowrap; /* 禁止文字换行 */\n      flex: none; /* 不拉伸，保持内容宽度 */\n      min-width: auto; /* 不设置最小宽度，让内容决定宽度 */\n    }\n\n    .episode-card:hover, .episode-card:focus {\n      transform: translateY(-3px);\n      box-shadow: 0 5px 12px rgba(0, 0, 0, 0.15);\n      background: var(--primary);\n      color: white;\n      outline: none;\n      box-shadow: var(--focus-ring), 0 5px 12px rgba(0, 0, 0, 0.15);\n    }\n\n    .episode-card:active {\n      transform: translateY(1px);\n    }\n\n    .episode-card.active {\n      background: var(--success);\n      color: white;\n    }\n\n    .episode-card.error {\n      background: var(--danger);\n      color: white;\n    }\n\n    .episode-number {\n      font-size: 0.95em;\n      font-weight: 600;\n    }\n\n    /* 响应式优化 */\n    @media (max-width: 480px) {\n      .poster-header {\n        padding: 60px 12px 26px;\n      }\n      h1 {\n        font-size: 1.35em;\n      }\n      .subtitle {\n        font-size: 0.85em;\n      }\n      .actions {\n        gap: 8px;\n      }\n      .btn {\n        min-width: 75px;\n        font-size: 11.5px;\n        padding: 6px 5px;\n        gap: 5px;\n      }\n      .input-panel {\n        padding: 12px;\n      }\n      .input-row {\n        flex-direction: column;\n        align-items: stretch;\n      }\n      .input-row label {\n        width: auto;\n        margin-bottom: 6px;\n      }\n      .container {\n        margin: 10px;\n      }\n    }\n  </style>\n</head>\n<body>\n\n  <div class=\"container\">\n\n    <!-- 海报式头部 -->\n    <div class=\"poster-header\">\n      <div class=\"poster-content\">\n\n        <!-- 缩小后的圆形封面 -->\n        <div class=\"cover-circle\" onclick=\"goToHome()\" title=\"点击返回主页\" tabindex=\"0\"></div>\n\n        <!-- 标题与副标题 -->\n        <h1>";
        }
        return null;
    }

    /* renamed from: ۥۤۡ۠, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.e1.a m7627(Object obj) {
        if (C0061.m9359() < 0) {
            return ((com.github.catvod.spider.merge.g1.c) obj).b;
        }
        return null;
    }

    /* renamed from: ۥۥۢ۠, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.Z.d m7628(Object obj, Object obj2, Object obj3) {
        if (m7538() < 0) {
            return com.github.catvod.spider.merge.Z.c.h((String) obj, (String) obj2, (HashMap) obj3);
        }
        return null;
    }

    /* renamed from: ۥۥۣۦ, reason: contains not printable characters */
    public static boolean m7629(Object obj) {
        if (C0014.m3353() < 0) {
            return ((com.github.catvod.spider.merge.D.f) obj).e;
        }
        return false;
    }

    /* renamed from: ۥۦ۟ۡ, reason: contains not printable characters */
    public static String m7630(Object obj) {
        if (C0010.m2320() < 0) {
            return com.github.catvod.spider.merge.D.f.t((String) obj);
        }
        return null;
    }

    /* renamed from: ۥۦ۠ۡ, reason: contains not printable characters */
    public static AtomicReferenceFieldUpdater m7631(Object obj) {
        if (C0039.m6529() <= 0) {
            return ((C0293d) obj).a;
        }
        return null;
    }

    /* renamed from: ۥۦ۠ۤ, reason: contains not printable characters */
    public static void m7632(Object obj, Object obj2) {
        if (C0060.m9355() > 0) {
            ((com.github.catvod.spider.merge.E.g) obj).y((ArrayList) obj2);
        }
    }

    /* renamed from: ۥۣۧۨ, reason: contains not printable characters */
    public static void m7633(Object obj) {
        if (C0010.m2320() < 0) {
            ((com.github.catvod.spider.merge.h0.Q) obj).a();
        }
    }

    /* renamed from: ۥۧۧ, reason: contains not printable characters */
    public static String m7634(Object obj, Object obj2) {
        if (C0024.m4693() <= 0) {
            return com.github.catvod.spider.merge.R.a.a((String) obj, (Pattern) obj2);
        }
        return null;
    }

    /* renamed from: ۦۣ۟ۡ, reason: contains not printable characters */
    public static Object[] m7635(Object obj) {
        if (C0028.m5152() <= 0) {
            return ((com.github.catvod.spider.merge.P0.D) obj).a;
        }
        return null;
    }

    /* renamed from: ۦ۠۟۠, reason: contains not printable characters */
    public static int m7636(Object obj) {
        if (C0031.m5628() >= 0) {
            return L.n((C0148e) obj);
        }
        return 0;
    }

    /* renamed from: ۦ۠ۤۢ, reason: contains not printable characters */
    public static Object m7637(Object obj) {
        if (C0026.m4977() < 0) {
            return ((com.github.catvod.spider.merge.W0.a) obj).a;
        }
        return null;
    }

    /* renamed from: ۦۣۢۢ, reason: contains not printable characters */
    public static int m7638(Object obj) {
        if (C0006.m1726() < 0) {
            return ((RunnableC0234C) obj).a;
        }
        return 0;
    }

    /* renamed from: ۦۣۤۦ, reason: contains not printable characters */
    public static void m7639(Object obj, Object obj2, char c) {
        if (C0008.m1975() > 0) {
            ((com.github.catvod.spider.merge.N0.b) obj).b((StringBuffer) obj2, c);
        }
    }

    /* renamed from: ۦۣۤۨ, reason: contains not printable characters */
    public static void m7640(Object obj, Object obj2) {
        if (C0040.m6582() > 0) {
            C0011.m2829((CookieManager) obj, (WebView) obj2, true);
        }
    }

    /* renamed from: ۦۥ۠ۥ, reason: contains not printable characters */
    public static String m7641(Object obj) {
        if (C0052.m8320() >= 0) {
            return com.github.catvod.spider.merge.E.l.l((InputStream) obj);
        }
        return null;
    }

    /* renamed from: ۦۥۨۦ, reason: contains not printable characters */
    public static C0266a m7642(Object obj) {
        if (C0055.m8740() >= 0) {
            return ((com.github.catvod.spider.merge.B.l) obj).a;
        }
        return null;
    }

    /* renamed from: ۦۧۤ۟, reason: contains not printable characters */
    public static String m7643(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0014.m3353() < 0) {
            return ((M) obj).d((String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* renamed from: ۦۣۨۤ, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.B.i m7644(Object obj) {
        if (C0044.m7508() < 0) {
            return ((com.github.catvod.spider.merge.B.k) obj).getLifecycle();
        }
        return null;
    }

    /* renamed from: ۧ۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static String m7645() {
        if (C0047.m7837() > 0) {
            return "调试->获取首页资源出错：";
        }
        return null;
    }

    /* renamed from: ۧۡۥۧ, reason: not valid java name and contains not printable characters */
    public static void m7646(Object obj, Object obj2) {
        if (C0031.m5628() >= 0) {
            ((com.github.catvod.spider.p000mergexbpq.Q.f) obj).b((com.github.catvod.spider.p000mergexbpq.Q.l) obj2);
        }
    }

    /* renamed from: ۧۢۡ۟, reason: not valid java name and contains not printable characters */
    public static void m7647(Object obj, Object obj2) {
        if (C0037.m6350() < 0) {
            ((com.github.catvod.spider.merge.E0.p) obj).b((com.github.catvod.spider.merge.I0.b) obj2);
        }
    }

    /* renamed from: ۧۢۥۡ, reason: not valid java name and contains not printable characters */
    public static String m7648() {
        if (C0060.m9355() >= 0) {
            return "正在post代理--> ";
        }
        return null;
    }

    /* renamed from: ۣۣۧ۟, reason: not valid java name and contains not printable characters */
    public static void m7649(Object obj, Object obj2) {
        if (C0041.m6823() < 0) {
            ((Activity) obj).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) obj2);
        }
    }

    /* renamed from: ۧۨۡۥ, reason: not valid java name and contains not printable characters */
    public static String m7650(Object obj) {
        if (C0039.m6529() < 0) {
            return ((C0259u) obj).f;
        }
        return null;
    }

    /* renamed from: ۨ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static String m7651(Object obj, Object obj2, Object obj3) {
        if (C0035.m6140() < 0) {
            return com.github.catvod.spider.merge.D.f.a((String) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۨۢۧۢ, reason: not valid java name and contains not printable characters */
    public static void m7652(Object obj) {
        if (C0025.m4797() >= 0) {
            ((com.github.catvod.spider.merge.a0.S) obj).b();
        }
    }

    /* renamed from: ۣۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m7653(Object obj, Object obj2) {
        if (C0041.m6823() < 0) {
            ((Config) obj).SetHBthread((String) obj2);
        }
    }

    /* renamed from: ۨۤۡۡ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.T0.g m7654(Object obj) {
        if (C0023.m4566() <= 0) {
            return ((com.github.catvod.spider.merge.T0.g) obj).a();
        }
        return null;
    }

    /* renamed from: ۨۤۤۨ, reason: not valid java name and contains not printable characters */
    public static String m7655(Object obj) {
        if (C0014.m3353() < 0) {
            return ((Throwable) obj).toString();
        }
        return null;
    }

    /* renamed from: ۨۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m7656(Object obj) {
        if (C0057.m9017() >= 0) {
            return ((com.github.catvod.spider.merge.H0.f) obj).toString();
        }
        return null;
    }

    /* renamed from: ۨۨۦۦ, reason: not valid java name and contains not printable characters */
    public static String m7657(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}