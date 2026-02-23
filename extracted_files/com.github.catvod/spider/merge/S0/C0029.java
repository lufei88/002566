package com.github.catvod.spider.merge.S0;

import android.content.Context;
import android.graphics.Path;
import android.graphics.drawable.GradientDrawable;
import android.text.PrecomputedText;
import android.text.TextUtils;
import android.util.AtomicFile;
import android.view.WindowInsetsAnimationController;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.CookieSyncManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.view.MenuProvider;
import com.github.catvod.spider.DianYingYunJi;
import com.github.catvod.spider.Duboku;
import com.github.catvod.spider.HBPQ;
import com.github.catvod.spider.HBlive;
import com.github.catvod.spider.HBsuipian;
import com.github.catvod.spider.HBxLei8;
import com.github.catvod.spider.HkTv;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.JavDb;
import com.github.catvod.spider.TvDy;
import com.github.catvod.spider.Youku;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E0.j;
import com.github.catvod.spider.merge.F0.AbstractC0160q;
import com.github.catvod.spider.merge.F0.C0148e;
import com.github.catvod.spider.merge.F0.C0159p;
import com.github.catvod.spider.merge.F0.C0165w;
import com.github.catvod.spider.merge.F0.T;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.H0.f;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.B;
import com.github.catvod.spider.merge.P0.C0172d;
import com.github.catvod.spider.merge.P0.E;
import com.github.catvod.spider.merge.P0.g;
import com.github.catvod.spider.merge.P0.m;
import com.github.catvod.spider.merge.P0.n;
import com.github.catvod.spider.merge.P0.z;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.h;
import com.github.catvod.spider.merge.U.e;
import com.github.catvod.spider.merge.U0.C0174a;
import com.github.catvod.spider.merge.U0.C0176b;
import com.github.catvod.spider.merge.U0.H;
import com.github.catvod.spider.merge.U0.P;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.s;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.x;
import com.github.catvod.spider.merge.X0.A;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.L;
import com.github.catvod.spider.merge.a0.M;
import com.github.catvod.spider.merge.a0.y;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.a1.c;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.b0.k;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d.C0268c;
import com.github.catvod.spider.merge.d.InterfaceC0270e;
import com.github.catvod.spider.merge.d0.d;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.AbstractC0296g;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f.C0292c;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.AbstractC0308c;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0315D;
import com.github.catvod.spider.merge.h0.C0340u;
import com.github.catvod.spider.merge.h0.ComponentCallbacksC0313B;
import com.github.catvod.spider.merge.h0.r;
import com.github.catvod.spider.merge.h0.v;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.w.C0401e;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.y0.InterfaceC0416b;
import com.github.catvod.spider.p000mergexbpq.P.C;
import com.github.catvod.spider.p000mergexbpq.P.w;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.d0.D;
import com.github.catvod.spider.p000mergexbpq.d0.F;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.l;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Type;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import javax.net.SocketFactory;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.S0.ۣ۟ۤۧ۟, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0029 {

    /* renamed from: ۟ۥۡۢۨ, reason: not valid java name and contains not printable characters */
    public static int f496 = 673;

    /* renamed from: ۟۟۟۟۠, reason: not valid java name and contains not printable characters */
    public static Iterator m5199(Object obj) {
        if (C0007.m1886() > 0) {
            return ((Set) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۟۟۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m5200(Object obj, Object obj2) {
        if (m5282() >= 0) {
            ((AccessibilityNodeInfo) obj).setError((CharSequence) obj2);
        }
    }

    /* renamed from: ۟۟۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static ArrayList m5201(Object obj) {
        if (C0039.m6529() < 0) {
            return DianYingYunJi.b((h) obj);
        }
        return null;
    }

    /* renamed from: ۟۟ۢۥۦ, reason: not valid java name and contains not printable characters */
    public static String m5202(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0005.m1599() < 0) {
            return ((HBxLei8) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣۣۣ۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m5203(Object obj) {
        if (C0062.m9429() > 0) {
            return ((Matcher) obj).lookingAt();
        }
        return false;
    }

    /* renamed from: ۟۟ۥۣۣ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.O.a m5204(Object obj) {
        if (C0031.m5628() > 0) {
            return ((L) obj).h;
        }
        return null;
    }

    /* renamed from: ۟۟ۦۤۢ, reason: not valid java name and contains not printable characters */
    public static HashMap m5205() {
        if (C0028.m5152() < 0) {
            return JavDb.a();
        }
        return null;
    }

    /* renamed from: ۟۟ۦۦۣ, reason: not valid java name and contains not printable characters */
    public static String m5206() {
        if (C0007.m1886() > 0) {
            return "            background-position: center; /* 背景图水平和垂直方向都居中 */\n            background-size: cover; /* 保持图片比例并覆盖整个容器 */\n            background-repeat: no-repeat; /* 防止图片重复平铺 */\n            background-attachment: fixed; /* 固定背景图，滚动时不跟随移动 */\n            min-height: 100vh;\n            padding: 20px;\n            color: #333;\n            overflow-x: hidden;\n\n        }\n\n        .app-header {\n            text-align: center;\n           margin-bottom: 10px;\n          // background: rgba(255, 255, 255, 0.6);\n            backdrop-filter: blur(1px);\n           border-radius: 20px;\n            padding: 10px;\n        }\n\n        .app-header i {\n            color: #e67e22; /* 橙色 */\n            animation: pulse 2s infinite ease-in-out;\n            filter: drop-shadow(0 2px 4px rgba(0, 0, 0, 0.1));\n        }\n\n        @keyframes pulse {\n            0% {\n                transform: scale(1);\n            }\n            50% {\n                transform: scale(1.08);\n            }\n            100% {\n                transform: scale(1);\n            }\n        }\n\n        .title-group {\n            display: flex;\n            flex-direction: column;\n            text-align: left;\n        }\n        .app-header h1 {\n            text-align: center;\n            font-size: 1.2em;\n            font-weight: 1000;\n            color: #000000; /* 文字设为黑色 */\n            margin-bottom: 8px;\n            /* 白色描边：通过4个方向的白色阴影模拟轮廓（兼容低版本浏览器） */\n            text-shadow:\n                    -1px -1px 0 #ffffff,\n                    1px -1px 0 #ffffff,\n                    -1px  1px 0 #ffffff,\n                    1px  1px 0 #ffffff;\n        }\n\n\n        .app-header .subtitle {\n            text-align: center;\n            font-size: 0.8em;\n           // color: #7f8c8d;\n            margin: 2px 0 0;\n            font-weight: 800;\n            /* 白色描边：通过4个方向的白色阴影模拟轮廓（兼容低版本浏览器） */\n            text-shadow:\n                    -1px -1px 0 #ffffff,\n                    1px -1px 0 #ffffff,\n                    -1px  1px 0 #ffffff,\n                    1px  1px 0 #ffffff;\n        }\n\n        /* 平台色定义（CSS 变量） */\n        :root {\n            --aiqiyi-color: #27ae60;\n            --youku-gradient: linear-gradient(135deg, #ff8c00, #0099ff);\n            --mango-yellow: #fdd000;\n            --sohu-color: #e74c3c;\n            --bilibili-pink: #fb7299;\n            --tencent-gradient: linear-gradient(to right, #FFC300 0%, #00D1B2 70%, #00A0E9 90%);\n            --focus-outline: 3px solid #006400;\n            --focus-shadow: 0 0 8px rgba(0, 100, 0, 0.5);\n        }\n\n        /* 渐变边框标题装饰  */\n        .header-decoration {\n            height: 3px;\n            width: 90%;\n            max-width: 520px;\n            background: linear-gradient(\n                    to right,\n                    var(--aiqiyi-color) 0% 16.666%,\n                    #f39c12 16.666% 33.333%,\n                    #ff8c00 33.333% 50%,\n                    var(--mango-yellow) 50% 66.666%,\n                    var(--sohu-color) 66.666% 83.333%,\n                    var(--bilibili-pink) 83.333% 100%\n            );\n            border-radius: 2px;\n            margin: 8px auto 8px;\n            opacity: 0.8;\n        }\n\n        /* 搜索容器 */\n        .search-container {\n            padding: 8px 0;\n            border-radius: 12px;\n            margin-bottom: 5px;\n        }\n\n        .search-wrapper {\n            position: relative;\n            margin-bottom: 12px;\n            display: flex;\n            gap: 12px;\n            align-items: center;\n            width: 100%;\n        }\n\n        .search-wrapper input[type=\"text\"] {\n            flex: 1;\n            padding: 10px 20px;\n            border: 2px solid #e1e5e9;\n            border-radius: 30px;\n            transition: all 0.3s ease;\n            background: #fff;\n            outline: none;\n            min-width: 0;\n        }\n\n        .search-wrapper input[type=\"text\"]:focus {\n            border-color: #667eea;\n            box-shadow: 0 0 0 3px rgba(102, 126, 234, 0.3);\n            transform: scale(1.02);\n        }\n\n        .search-wrapper button {\n            padding: 10px 20px;\n            background: linear-gradient(45deg, #667eea, #764ba2);\n            color: white;\n            border: none;\n            border-radius: 30px;\n            font-size: 14px;\n            font-weight: 600;\n            cursor: pointer;\n            transition: all 0.3s ease;\n            white-space: nowrap;\n            flex-shrink: 0; /* 防止按钮被压缩 */\n        }\n\n        .search-wrapper button:hover,\n        .search-wrapper button:focus {\n            transform: translateY(-00%) scale(1.05);\n            box-shadow: 0 0 0 2px rgba(0, 191, 255, 0.2);\n        }\n\n        .search-wrapper button i {\n            font-size: 13px;\n        }\n\n        /* 按钮布局 */\n        .button-row {\n            display: grid;\n            grid-template-columns: 1fr 1fr 1fr;\n            gap: 8px;\n            width: 100%;\n        }\n\n        .action-btn.full-btn {\n            flex: 1;\n            min-width: 0;\n            padding: 10px 10px;\n            background: rgba(255, 255, 255, 0.95);\n            color: #667eea;\n            text-decoration: none;\n            border-radius: 20px;\n            font-size: 14px;\n            font-weight: 600;\n            transition: all 0.3s ease;\n            border: 2px solid rgba(102, 126, 234, 0.2);\n            box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);\n            text-align: center;\n            white-space: nowrap;\n            overflow: hidden;\n            text-overflow: ellipsis;\n        }\n\n        .action-btn.full-btn i {\n            font-size: 14px;\n            width: 18px;\n            text-align: center;\n        }\n\n        .action-btn.full-btn[data-type=\"search\"] {\n            padding: 10px 8px;\n            font-size: 12px;\n            flex: 1;\n            text-align: center;\n        }\n\n        .action-btn.full-btn[data-type=\"qrcode\"] {\n            padding: 10px 8px;\n            font-size: 12px;\n            flex: 1;\n            text-align: center;\n        }\n\n        .action-btn.full-btn[data-type=\"danmu\"] {\n            padding: 10px 8px;\n            font-size: 12px;\n            flex: 1;\n            text-align: center;\n        }\n\n        .action-btn.full-btn:hover, .action-btn.full-btn:focus {\n            background: #667eea;\n            color: white;\n            transform: translateY(-2px) scale(1.05);\n            box-shadow: 0 6px 12px rgba(102, 126, 234, 0.2);\n            outline: 3px solid rgba(102, 126, 234, 0.5);\n        }\n\n        .movie a:focus {\n            outline: var(--focus-outline);\n            outline-offset: 2px;\n            box-shadow: var(--focus-shadow);\n        }\n\n        /* 视频设计 */\n        .movie {\n            width: 100%;\n            height: 120px;\n            text-align: center;\n            background-color: #fff;\n            border-radius: 8px;\n            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n            overflow: hidden;\n            transition: transform 0.3s ease, box-shadow 0.3s ease;\n            position: relative;\n        }\n\n        .movie a {\n            position: relative;\n            display: block;\n            height: 100%;\n            outline: none;\n        }\n\n        .movie img {\n            width: 100%;\n            height: 78%;\n            object-fit: cover;\n            transition: transform 0.3s ease;\n        }\n\n        .movie a:focus img {\n            transform: scale(1.08);\n        }\n\n        .movie-tag {\n            position: absolute;\n            bottom: 32px;\n            right: 6px;\n            display: flex;\n            align-items: center;\n            gap: 4px;\n            color: #fff;\n            font-size: 9px;\n            padding: 2px 6px;\n            border-radius: 4px;\n            z-index: 2;\n            box-shadow: 0 1px 3px rgba(0, 0, 0, 0.3);\n            white-space: nowrap;\n        }\n\n        .movie-tag.aiqiyi {\n            background-color: var(--aiqiyi-color);\n        }\n\n        .movie-tag.tencent {\n            background: var(--youku-gradient);\n        }\n\n        .movie-tag.sohu {\n            background-color: var(--sohu-color);\n        }\n\n        .movie-tag.bilibili {\n            background-color: var(--bilibili-pink);\n        }\n\n        /*  暗色模式 */\n        .movie-title {\n            color: #333;\n            height: 22%;\n            padding: 4px 6px;\n            font-weight: bold;\n            font-size: 11px;\n            overflow: hidden;\n            white-space: nowrap;\n            text-overflow: ellipsis;\n            background-color: #ffffff;\n            text-shadow: 1px 1px 1px rgba(255, 255, 255, 0.3);\n            position: absolute;\n            bottom: 0;\n            left: 0;\n            width: 100%;\n            z-index: 1;\n            pointer-events: none;\n            transition: background-color 0.3s ease, color 0.3s ease;\n        }\n\n        @media (prefers-color-scheme: dark) {\n            .movie-title {\n                background-color: rgba(0, 0, 0, 0.85);\n                color: #ffffff;\n                text-shadow: 1px 1px 2px rgba(0, 0, 0, 0.9);\n            }\n        }\n\n        .movie a:focus .movie-title {\n            color: #00cc00;\n        }\n\n        /* 剧集列表容器 */\n        .movie-container {\n            display: grid;\n            grid-template-columns: repeat(3, 1fr);\n            gap: 12px;\n            margin: 8px auto 0;\n        }\n\n        /* 移动端排列 */\n        @media (max-width: 768px) {\n            .movie-container {\n                grid-template-columns: repeat(3, 1fr);\n                gap: 10px;\n            }\n\n            .movie {\n                height: 120px;\n            }\n\n            .movie img {\n                height: 90%;\n            }\n\n            .movie-title {\n                font-size: 10px;\n                height: 24%;\n                padding: 3px 6px;\n            }\n\n            .movie-tag {\n                font-size: 8px;\n                padding: 2px 5px;\n            }\n        }\n\n        @media (max-width: 480px) {\n            .movie-container {\n                grid-template-columns: repeat(3, 1fr);\n                gap: 10px;\n            }\n\n            .movie {\n                height: 120px;\n            }\n\n            .movie img {\n                height: 90%;\n            }\n\n            .movie-title {\n                font-size: 9px;\n                height: 24%;\n            }\n        }\n\n        /* 暗色模式适配 */\n        @media (prefers-color-scheme: dark) {\n            body {\n                background: linear-gradient(135deg, #1a1a1a 0%, #2c2c2c 100%);\n                color: #eee;\n            }\n\n            .search-container,\n            #danmuPanel {\n                background: #2a2a2a;\n                border: 1px solid #444;\n            }\n\n            .search-wrapper input[type=\"text\"] {\n                background: #333;\n                color: #fff;\n                border-color: #555;\n            }\n\n            .movie {\n                background-color: #2a2a2a;\n                box-shadow: 0 0 8px rgba(255, 255, 255, 0.05);\n            }\n\n            .movie img {\n                filter: brightness(0.9);\n            }\n\n            .status-message {\n                background-color: #006400 !important;\n            }\n        }\n\n        /* 弹幕输入面板样式 */\n        #danmuPanel {\n            margin-top: 16px;\n            padding: 16px;\n            background: #f8f9fa;\n            border-radius: 8px;\n            border: 1px solid #eee;\n        }\n\n        #danmuPanel textarea,\n        #danmuPanel input {\n            width: 100%;\n            padding: 8px;\n            border: 1px solid #ddd;\n            border-radius: 6px;\n            font-size: 13px;\n            margin-bottom: 10px;\n        }\n\n        #danmuPanel input {\n            padding: 6px 8px;\n        }\n\n        /* 按钮容器：仅用于居中按钮 */\n        .danmu-btn-container {\n            text-align: center; /* 水平居中按钮 */\n            margin-top: 8px; /* 与上方输入框保持间距 */\n        }\n\n        #sendDanmuBtn {\n            padding: 12px 24px;\n            border: none;\n            text-align: center;\n            border-radius: 25px;\n            font-size: 14px;\n            font-weight: 600;\n            cursor: pointer;\n            transition: all 0.3s ease;\n            text-decoration: none;\n            display: inline-block;\n            background: linear-gradient(45deg, #667eea, #764ba2);\n            color: white;\n        }\n        #sendDanmuBtn:hover, #sendDanmuBtn:focus {\n            color: white;\n            transform: translateY(-2px) scale(1.05);\n            outline: 3px solid rgba(102, 126, 234, 0.5);\n        }\n        /* 状态提示 */\n        .status-message {\n            opacity: 0;\n            visibility: hidden;\n            background-color: #006400;\n            color: white;\n            font-size: 14px;\n            padding: 10px 16px;\n            border-radius: 8px;\n            position: fixed;\n            top: 20px;\n            left: 50%;\n            transform: translateX(-50%);\n            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.2);\n            transition: opacity 0.3s ease, visibility 0.3s ease;\n            z-index: 1000;\n            max-width: 90%;\n            text-align: center;\n        }\n\n        .status-message.show {\n            opacity: 1;\n            visibility: visible;\n        }\n\n        /* 移动端字体微调 */\n        @media (max-width: 768px) {\n            .search-container {\n                padding: 8px 0px;\n            }\n\n            .button-row {\n                gap: 6px;\n            }\n\n            .action-btn.full-btn {\n                font-size: 13px;\n                padding: 8px 0;\n            }\n\n            .action-btn.full-btn i {\n                font-size: 12px;\n                width: 16px;\n            }\n\n            .app-header h1 {\n                font-size: 1.1em;\n            }\n\n            .app-header .subtitle {\n                font-size: 0.75em;\n            }\n        }\n    </style></head>\n<body>\n<!-- 主页界面-->\n<div class=\"app-header\">\n    <button onclick=\"fetch('";
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m5207(Object obj, Object obj2) {
        if (C0023.m4566() <= 0) {
            l.g((File) obj, (String) obj2);
        }
    }

    /* renamed from: ۟۟ۨۨۨ, reason: not valid java name and contains not printable characters */
    public static long m5208(Object obj) {
        if (C0007.m1886() > 0) {
            return ((e) obj).b;
        }
        return 0L;
    }

    /* renamed from: ۣ۟۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static List m5209(Object obj) {
        if (C0063.m9589() <= 0) {
            return Collections.unmodifiableList((List) obj);
        }
        return null;
    }

    /* renamed from: ۟۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m5210(Object obj) {
        if (C0030.m5375() > 0) {
            return ((r) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟۠ۤۥ۠, reason: not valid java name and contains not printable characters */
    public static CookieSyncManager m5211(Object obj) {
        if (C0057.m9017() >= 0) {
            return CookieSyncManager.createInstance((Context) obj);
        }
        return null;
    }

    /* renamed from: ۟۠ۦۦۨ, reason: not valid java name and contains not printable characters */
    public static String m5212() {
        if (C0056.m8886() < 0) {
            return "url=";
        }
        return null;
    }

    /* renamed from: ۟۠ۧۧۧ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m5213(Object obj, Object obj2) {
        if (C0017.m3633() < 0) {
            return ((ByteBuffer) obj).put((ByteBuffer) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static g m5214() {
        if (C0021.m4379() > 0) {
            return g.c;
        }
        return null;
    }

    /* renamed from: ۟ۡۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m5215(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0064.m9659() <= 0) {
            return com.github.catvod.spider.merge.B0.a.p((JSONObject) obj, (String) obj2, (JSONObject) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* renamed from: ۟ۡۧۤۦ, reason: not valid java name and contains not printable characters */
    public static void m5216(Object obj, float f) {
        if (C0008.m1975() >= 0) {
            ((GradientDrawable) obj).setCornerRadius(f);
        }
    }

    /* renamed from: ۟ۢۡۡۤ, reason: not valid java name and contains not printable characters */
    public static int m5217(Object obj) {
        if (C0045.m7538() < 0) {
            return ((com.github.catvod.spider.merge.P0.h) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۢۡۢ۟, reason: not valid java name and contains not printable characters */
    public static void m5218(Object obj) {
        if (C0034.m6048() < 0) {
            ((com.github.catvod.spider.merge.K.b) obj).a();
        }
    }

    /* renamed from: ۟ۢۡۧۧ, reason: not valid java name and contains not printable characters */
    public static String m5219(Object obj, Object obj2) {
        if (C0033.m5872() >= 0) {
            return c.a((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۢۤۡۥ, reason: not valid java name and contains not printable characters */
    public static void m5220(Object obj, Object obj2, Object obj3) {
        if (C0008.m1975() > 0) {
            ((com.github.catvod.spider.merge.e1.b) obj).f((String) obj2, (Exception) obj3);
        }
    }

    /* renamed from: ۟ۢۦۦۨ, reason: not valid java name and contains not printable characters */
    public static Socket m5221(Object obj) {
        if (C0020.m4210() < 0) {
            return ((SocketFactory) obj).createSocket();
        }
        return null;
    }

    /* renamed from: ۟ۢۨۢۥ, reason: not valid java name and contains not printable characters */
    public static void m5222(Object obj) {
        if (C0056.m8886() <= 0) {
            ((w) obj).o();
        }
    }

    /* renamed from: ۟ۢۨۧۧ, reason: not valid java name and contains not printable characters */
    public static int m5223(Object obj) {
        if (C0051.m8216() <= 0) {
            return ((WindowInsetsAnimationController) obj).getTypes();
        }
        return 0;
    }

    /* renamed from: ۣ۟۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static int m5224(Object obj, int i) {
        if (C0000.m1116() <= 0) {
            return ((j) obj).a(i);
        }
        return 0;
    }

    /* renamed from: ۣ۟ۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m5225(Object obj) {
        if (C0046.m7701() > 0) {
            return ((k) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣ۟ۦۦ۠, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.B.h m5226() {
        if (C0059.m9257() <= 0) {
            return com.github.catvod.spider.merge.B.h.b;
        }
        return null;
    }

    /* renamed from: ۣ۟ۨۡۢ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.C.b m5227(Object obj) {
        if (C0047.m7837() >= 0) {
            return ((com.github.catvod.spider.merge.C.a) obj).a();
        }
        return null;
    }

    /* renamed from: ۟ۤ۠۠, reason: not valid java name and contains not printable characters */
    public static int m5228(Object obj, int i) {
        if (C0055.m8740() >= 0) {
            return ((x) obj).b(i);
        }
        return 0;
    }

    /* renamed from: ۟ۤ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static void m5229() {
        if (C0004.m1557() < 0) {
            Init.CreatedHBTV();
        }
    }

    /* renamed from: ۟ۤۦ۟۟, reason: not valid java name and contains not printable characters */
    public static C0172d m5230() {
        if (C0035.m6140() < 0) {
            return n.t;
        }
        return null;
    }

    /* renamed from: ۟ۤۨۧۤ, reason: not valid java name and contains not printable characters */
    public static MenuProvider m5231(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((C0401e) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۤۨۨۡ, reason: not valid java name and contains not printable characters */
    public static AbstractC0160q m5232(Object obj) {
        if (C0019.m4065() < 0) {
            return ((C0159p) obj).g;
        }
        return null;
    }

    /* renamed from: ۟ۥ۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m5233(Object obj) {
        if (C0038.m6471() > 0) {
            return ((com.github.catvod.spider.merge.T0.c) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۥۡۨ, reason: not valid java name and contains not printable characters */
    public static int m5234(Object obj) {
        if (C0028.m5152() < 0) {
            return ((s) obj).b;
        }
        return 0;
    }

    /* renamed from: ۟ۥۣۢۧ, reason: not valid java name and contains not printable characters */
    public static String m5235() {
        if (C0030.m5375() >= 0) {
            return "/proxy\"] {\n            color: #007BFF;\n            padding: 6px 16px;\n            border-radius: 4px;\n            background-color: #e9f5ff;\n            transition: all 0.3s ease;\n            transform: translateY(0);\n        }\n        \n        a[href^=\"";
        }
        return null;
    }

    /* renamed from: ۟ۥۣۧۡ, reason: not valid java name and contains not printable characters */
    public static String m5236(Object obj, Object obj2) {
        if (C0010.m2320() <= 0) {
            return ((D) obj).c((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۥۧۤۢ, reason: not valid java name and contains not printable characters */
    public static void m5237(Object obj, Object obj2) {
        if (C0050.m8121() <= 0) {
            ((AtomicFile) obj).failWrite((FileOutputStream) obj2);
        }
    }

    /* renamed from: ۟ۥۣۨۧ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.G0.b[] m5238(Object obj) {
        if (C0061.m9359() < 0) {
            return ((com.github.catvod.spider.merge.F0.L) obj).e;
        }
        return null;
    }

    /* renamed from: ۟ۦ۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static Locale m5239(Object obj) {
        if (C0014.m3353() < 0) {
            return ((m) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۦ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static String m5240(Object obj, Object obj2, Object obj3) {
        if (C0038.m6471() >= 0) {
            return String.format((Locale) obj, (String) obj2, (Object[]) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۦۡۡۦ, reason: not valid java name and contains not printable characters */
    public static HashMap m5241(Object obj) {
        if (C0050.m8121() < 0) {
            return ((Duboku) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۦۢۦ, reason: not valid java name and contains not printable characters */
    public static String m5242(Object obj) {
        if (C0043.m7332() >= 0) {
            return TvDy.decodeBase64((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۦۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m5243() {
        if (C0049.m8038() < 0) {
            return "线路标题";
        }
        return null;
    }

    /* renamed from: ۟ۦۣۧ۟, reason: not valid java name and contains not printable characters */
    public static int m5244(Object obj) {
        if (C0014.m3353() <= 0) {
            return ((E) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۦۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m5245(Object obj) {
        if (C0037.m6350() <= 0) {
            return ((C0165w) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۦۤۦ, reason: not valid java name and contains not printable characters */
    public static void m5246(Object obj, int i, Object obj2) {
        if (C0039.m6529() < 0) {
            com.github.catvod.spider.merge.K0.c.b((byte[]) obj, i, (com.github.catvod.spider.merge.K0.b) obj2);
        }
    }

    /* renamed from: ۟ۦۥۢ۠, reason: not valid java name and contains not printable characters */
    public static String m5247(Object obj, boolean z, int i, Object obj2) {
        if (C0021.m4379() >= 0) {
            return B.c((TimeZone) obj, z, i, (Locale) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۥۦۡ, reason: not valid java name and contains not printable characters */
    public static D m5248() {
        if (C0062.m9429() > 0) {
            return D.c;
        }
        return null;
    }

    /* renamed from: ۟ۦۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Toast m5249(Object obj, Object obj2, int i) {
        if (C0011.m2755() > 0) {
            return Toast.makeText((Context) obj, (CharSequence) obj2, i);
        }
        return null;
    }

    /* renamed from: ۟ۧۨۡ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.U0.L m5250(Object obj) {
        if (C0055.m8740() > 0) {
            return ((P) obj).i;
        }
        return null;
    }

    /* renamed from: ۠ۡۡۥ, reason: not valid java name and contains not printable characters */
    public static String m5251(Object obj, Object obj2) {
        if (C0026.m4977() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.d0.P) obj).g((String[]) obj2);
        }
        return null;
    }

    /* renamed from: ۠ۥ۠۟, reason: not valid java name and contains not printable characters */
    public static void m5252(Object obj, Object obj2, int i) {
        if (C0061.m9359() < 0) {
            ((z) obj).b((StringBuilder) obj2, i);
        }
    }

    /* renamed from: ۠ۥۨۡ, reason: not valid java name and contains not printable characters */
    public static JSONObject m5253(Object obj, Object obj2, long j) {
        if (C0021.m4379() >= 0) {
            return ((JSONObject) obj).put((String) obj2, j);
        }
        return null;
    }

    /* renamed from: ۠ۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m5254(Object obj) {
        if (C0038.m6471() > 0) {
            return ((HBlive) obj).b;
        }
        return null;
    }

    /* renamed from: ۠ۦۣۦ, reason: not valid java name and contains not printable characters */
    public static File m5255(Object obj) {
        if (C0055.m8740() > 0) {
            return ((File) obj).getParentFile();
        }
        return null;
    }

    /* renamed from: ۡ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m5257(Object obj) {
        if (C0020.m4210() < 0) {
            return ((C0174a) obj).u();
        }
        return false;
    }

    /* renamed from: ۡۢۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m5258(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0017.m3633() <= 0) {
            return ((com.github.catvod.spider.merge.a1.k) obj).a((AbstractC0296g) obj2, (C0292c) obj3, (C0292c) obj4);
        }
        return false;
    }

    /* renamed from: ۡۧۡ۠, reason: not valid java name and contains not printable characters */
    public static HashMap m5259() {
        if (C0001.m1164() <= 0) {
            return HkTv.a();
        }
        return null;
    }

    /* renamed from: ۢۢۥۣ, reason: not valid java name and contains not printable characters */
    public static int m5260(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۢۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m5261(Object obj) {
        if (C0047.m7837() > 0) {
            return ((v) obj).a;
        }
        return 0;
    }

    /* renamed from: ۢۤۢ۠, reason: not valid java name and contains not printable characters */
    public static String m5262() {
        if (C0000.m1116() <= 0) {
            return "播放.*";
        }
        return null;
    }

    /* renamed from: ۢۥۦ۠, reason: not valid java name and contains not printable characters */
    public static TextUtils.TruncateAt m5263(Object obj) {
        if (C0020.m4210() <= 0) {
            return ((TextView) obj).getEllipsize();
        }
        return null;
    }

    /* renamed from: ۢۦۦۤ, reason: not valid java name and contains not printable characters */
    public static String[] m5264() {
        if (C0038.m6471() > 0) {
            return A.n;
        }
        return null;
    }

    /* renamed from: ۣۢۡۤ, reason: not valid java name and contains not printable characters */
    public static C0315D m5265(Object obj) {
        if (C0034.m6048() <= 0) {
            return ((ComponentCallbacksC0313B) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۢۤۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.L.c m5266(Object obj) {
        if (C0036.m6252() > 0) {
            return ((com.github.catvod.spider.merge.L.a) obj).a();
        }
        return null;
    }

    /* renamed from: ۣۢۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5267(Object obj) {
        if (C0039.m6529() < 0) {
            return ((AbstractMap) obj).isEmpty();
        }
        return false;
    }

    /* renamed from: ۣۤۦۦ, reason: not valid java name and contains not printable characters */
    public static int m5268(Object obj, int i) {
        if (C0038.m6471() >= 0) {
            return ((Matcher) obj).end(i);
        }
        return 0;
    }

    /* renamed from: ۣۥۨۦ, reason: not valid java name and contains not printable characters */
    public static String m5269(Object obj) {
        if (C0027.m5017() > 0) {
            return ((HBsuipian) obj).b;
        }
        return null;
    }

    /* renamed from: ۤ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m5270(Object obj, int i) {
        if (C0033.m5872() >= 0) {
            return ((BitSet) obj).get(i);
        }
        return false;
    }

    /* renamed from: ۤ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m5271(String str) {
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

    /* renamed from: ۤ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.U0.D m5272(Object obj) {
        if (C0021.m4379() > 0) {
            return ((C0176b) obj).h;
        }
        return null;
    }

    /* renamed from: ۤۥۧۨ, reason: not valid java name and contains not printable characters */
    public static void m5273(Object obj) {
        if (C0064.m9659() < 0) {
            ((C0340u) obj).a();
        }
    }

    /* renamed from: ۤۦۥۨ, reason: not valid java name and contains not printable characters */
    public static void m5274(Object obj, Object obj2) {
        if (C0022.m4497() >= 0) {
            ((InterfaceC0270e) obj).a((C0268c) obj2);
        }
    }

    /* renamed from: ۤۧۤ۠, reason: not valid java name and contains not printable characters */
    public static Object m5275(Object obj, Object obj2) {
        if (C0009.m2047() > 0) {
            return AbstractC0308c.h((String) obj, (Type) obj2);
        }
        return null;
    }

    /* renamed from: ۤۧۥۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.T0.m m5276(Object obj) {
        if (C0000.m1116() <= 0) {
            return ((C0176b) obj).o;
        }
        return null;
    }

    /* renamed from: ۥ۟۠ۧ, reason: contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.R.b[] m5277(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.Q.B) obj).h;
        }
        return null;
    }

    /* renamed from: ۥۣۡۧ, reason: contains not printable characters */
    public static String m5278() {
        if (C0022.m4497() > 0) {
            return "空";
        }
        return null;
    }

    /* renamed from: ۥۣۨۤ, reason: contains not printable characters */
    public static boolean m5279(Object obj, Object obj2) {
        if (C0061.m9359() < 0) {
            return ((AbstractCollection) obj).remove(obj2);
        }
        return false;
    }

    /* renamed from: ۥۤۨۥ, reason: contains not printable characters */
    public static HashMap m5280(Object obj, Object obj2) {
        if (C0041.m6823() <= 0) {
            return ((Youku) obj).c((HashMap) obj2);
        }
        return null;
    }

    /* renamed from: ۥۥۣۡ, reason: contains not printable characters */
    public static boolean m5281(Object obj, int i) {
        if (C0031.m5628() >= 0) {
            return ((f) obj).d(i);
        }
        return false;
    }

    /* renamed from: ۦۡۨۨ, reason: contains not printable characters */
    public static int m5282() {
        return 567 ^ C0016.f368;
    }

    /* renamed from: ۦۢ۟ۦ, reason: contains not printable characters */
    public static boolean m5283(Object obj, Object obj2) {
        if (C0032.m5686() <= 0) {
            return ((AccessibilityNodeInfo) obj).removeAction((AccessibilityNodeInfo.AccessibilityAction) obj2);
        }
        return false;
    }

    /* renamed from: ۦۣۣ, reason: contains not printable characters */
    public static int m5284(Object obj) {
        if (C0053.m8389() >= 0) {
            return ((PrecomputedText) obj).getParagraphCount();
        }
        return 0;
    }

    /* renamed from: ۦۤ۟ۥ, reason: contains not printable characters */
    public static String m5285() {
        if (C0002.m1242() >= 0) {
            return "播放链接二次截取";
        }
        return null;
    }

    /* renamed from: ۦۣۤۦ, reason: contains not printable characters */
    public static Path.Op m5286() {
        if (C0005.m1599() < 0) {
            return Path.Op.INTERSECT;
        }
        return null;
    }

    /* renamed from: ۦۥ۠, reason: contains not printable characters */
    public static int m5287(Object obj) {
        if (C0001.m1164() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.g) obj).d();
        }
        return 0;
    }

    /* renamed from: ۦۥۨۤ, reason: contains not printable characters */
    public static Object m5288(Object obj, Object obj2) {
        if (C0036.m6252() > 0) {
            return ((InterfaceC0416b) obj).call((Object[]) obj2);
        }
        return null;
    }

    /* renamed from: ۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static C0233B m5289(Object obj) {
        if (C0037.m6350() < 0) {
            return ((y) obj).b;
        }
        return null;
    }

    /* renamed from: ۧ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static String m5290(Object obj) {
        if (C0033.m5872() >= 0) {
            return ((H) obj).c;
        }
        return null;
    }

    /* renamed from: ۧ۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static Object m5291(Object obj) {
        if (C0040.m6582() > 0) {
            return ((HBPQ) obj).a;
        }
        return null;
    }

    /* renamed from: ۧۡۧۤ, reason: not valid java name and contains not printable characters */
    public static int m5292(Object obj) {
        if (C0043.m7332() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.P.s) obj).o;
        }
        return 0;
    }

    /* renamed from: ۨ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static long m5293(Object obj) {
        if (C0012.m3024() > 0) {
            return ((d) obj).k;
        }
        return 0L;
    }

    /* renamed from: ۨۡۢۤ, reason: not valid java name and contains not printable characters */
    public static String m5294(Object obj) {
        if (C0061.m9359() <= 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).W;
        }
        return null;
    }

    /* renamed from: ۣۨۡ۟, reason: not valid java name and contains not printable characters */
    public static String m5295(Object obj) {
        if (C0026.m4977() < 0) {
            return ((M) obj).v;
        }
        return null;
    }

    /* renamed from: ۣۨۤۢ, reason: not valid java name and contains not printable characters */
    public static BitSet m5296(Object obj) {
        if (C0027.m5017() > 0) {
            return ((C0148e) obj).e;
        }
        return null;
    }

    /* renamed from: ۨۨ۟۠, reason: not valid java name and contains not printable characters */
    public static boolean m5297(Object obj) {
        if (C0064.m9659() <= 0) {
            return ((F) obj).f();
        }
        return false;
    }

    /* renamed from: ۨۨۡ۠, reason: not valid java name and contains not printable characters */
    public static int m5298(Object obj) {
        if (C0020.m4210() < 0) {
            return ((C) obj).b;
        }
        return 0;
    }

    /* renamed from: ۨۨۨ, reason: not valid java name and contains not printable characters */
    public static Object m5299(Object obj, Object obj2, Object obj3) {
        if (C0027.m5017() >= 0) {
            return ((T) obj).put(obj2, obj3);
        }
        return null;
    }

    /* renamed from: ۠ۨۢۥ, reason: not valid java name and contains not printable characters */
    public static String m5256(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}