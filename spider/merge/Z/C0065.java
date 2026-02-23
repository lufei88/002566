package com.github.catvod.spider.merge.z;

import android.app.Activity;
import android.app.Notification;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.drawable.GradientDrawable;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.github.catvod.spider.AppYsV2;
import com.github.catvod.spider.AppZzun;
import com.github.catvod.spider.Cloud;
import com.github.catvod.spider.HBNT4;
import com.github.catvod.spider.P123;
import com.github.catvod.spider.W55Movie;
import com.github.catvod.spider.XBPQ;
import com.github.catvod.spider.XBPQc;
import com.github.catvod.spider.Youku;
import com.github.catvod.spider.merge.D.f;
import com.github.catvod.spider.merge.E0.k;
import com.github.catvod.spider.merge.E0.v;
import com.github.catvod.spider.merge.F.i;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0144a;
import com.github.catvod.spider.merge.F0.C0147d;
import com.github.catvod.spider.merge.F0.C0148e;
import com.github.catvod.spider.merge.F0.Q;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.K0.b;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.h;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.c;
import com.github.catvod.spider.merge.T0.o;
import com.github.catvod.spider.merge.T0.r;
import com.github.catvod.spider.merge.U.n;
import com.github.catvod.spider.merge.U0.C0174a;
import com.github.catvod.spider.merge.U0.P;
import com.github.catvod.spider.merge.U0.g1;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.d;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.q;
import com.github.catvod.spider.merge.W.t;
import com.github.catvod.spider.merge.W.x;
import com.github.catvod.spider.merge.X0.z;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a.C0231a;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.C0253n;
import com.github.catvod.spider.merge.a0.C0259u;
import com.github.catvod.spider.merge.a0.L;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.e.C0273c;
import com.github.catvod.spider.merge.e.C0281k;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h0.AnimationAnimationListenerC0331k;
import com.github.catvod.spider.merge.h0.C0314C;
import com.github.catvod.spider.merge.h0.C0315D;
import com.github.catvod.spider.merge.h0.RunnableC0317F;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.P.C;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.R.e;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.b.g;
import com.github.catvod.spider.p000mergexbpq.b.p;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.j.m;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.z.ۦۣ۟ۢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0065 {

    /* renamed from: ۟۟ۧۢ۠, reason: not valid java name and contains not printable characters */
    public static int f875 = -496;

    /* renamed from: ۟۟ۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static p m9704(Object obj) {
        if (C0016.m3596() < 0) {
            return ((g) obj).a;
        }
        return null;
    }

    /* renamed from: ۟۟ۡۥۦ, reason: not valid java name and contains not printable characters */
    public static int m9705(Object obj) {
        if (C0027.m5017() >= 0) {
            return ((C0147d) obj).c;
        }
        return 0;
    }

    /* renamed from: ۣۣ۟۟, reason: not valid java name and contains not printable characters */
    public static Future m9706(Object obj, Object obj2) {
        if (C0040.m6582() > 0) {
            return ((ExecutorService) obj).submit((Runnable) obj2);
        }
        return null;
    }

    /* renamed from: ۟۟ۦۢۡ, reason: not valid java name and contains not printable characters */
    public static String m9707(Object obj) {
        if (C0011.m2755() >= 0) {
            return f.e((String) obj);
        }
        return null;
    }

    /* renamed from: ۟۟ۦۥۨ, reason: not valid java name and contains not printable characters */
    public static String[] m9708(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((AppZzun) obj).b;
        }
        return null;
    }

    /* renamed from: ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9709(Object obj) {
        if (C0062.m9429() > 0) {
            return ((Q) obj).f();
        }
        return false;
    }

    /* renamed from: ۟۠۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static void m9710(Object obj, boolean z) {
        if (C0004.m1557() < 0) {
            ((AccessibilityNodeInfo) obj).setMultiLine(z);
        }
    }

    /* renamed from: ۟۠ۢۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9711(Object obj) {
        if (C0044.m7508() <= 0) {
            return ((b) obj).e;
        }
        return false;
    }

    /* renamed from: ۟۠ۢۧۥ, reason: not valid java name and contains not printable characters */
    public static void m9712(Object obj) {
        if (C0027.m5017() >= 0) {
            ((C0174a) obj).x();
        }
    }

    /* renamed from: ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m9713(Object obj, int i, int i2) {
        if (C0055.m8740() >= 0) {
            ((GradientDrawable) obj).setStroke(i, i2);
        }
    }

    /* renamed from: ۟۠ۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m9714(Object obj, int i, int i2) {
        if (C0051.m8216() < 0) {
            ((Calendar) obj).set(i, i2);
        }
    }

    /* renamed from: ۟۠ۦۦۦ, reason: not valid java name and contains not printable characters */
    public static Object m9715(Object obj, Object obj2) {
        if (C0004.m1557() < 0) {
            return ((HashMap) obj).get(obj2);
        }
        return null;
    }

    /* renamed from: ۟۠ۨۦ۠, reason: not valid java name and contains not printable characters */
    public static String m9716(Object obj) {
        if (C0037.m6350() <= 0) {
            return ((r) obj).e();
        }
        return null;
    }

    /* renamed from: ۣ۟ۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static c m9717(Object obj) {
        if (C0061.m9359() < 0) {
            return ((com.github.catvod.spider.merge.T0.b) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۡ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static String m9718(Object obj) {
        if (C0035.m6140() <= 0) {
            return ((l) obj).e0();
        }
        return null;
    }

    /* renamed from: ۟ۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static FrameLayout m9719(Object obj) {
        if (C0020.m4210() <= 0) {
            return ((x) obj).f;
        }
        return null;
    }

    /* renamed from: ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static String m9720(String str) {
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
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* renamed from: ۟ۡ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static int m9721(Object obj) {
        if (C0019.m4065() < 0) {
            return ((AccessibilityNodeInfo) obj).getLiveRegion();
        }
        return 0;
    }

    /* renamed from: ۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static HashMap m9722() {
        if (C0012.m3024() > 0) {
            return o.b;
        }
        return null;
    }

    /* renamed from: ۟ۡۤۨۡ, reason: not valid java name and contains not printable characters */
    public static ScheduledExecutorService m9723(Object obj) {
        if (C0004.m1557() < 0) {
            return ((C0259u) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۡۦۨۡ, reason: not valid java name and contains not printable characters */
    public static String m9724() {
        if (C0035.m6140() <= 0) {
            return "            background-position: center; /* 背景图水平和垂直方向都居中 */\n            background-size: cover; /* 保持图片比例并覆盖整个容器 */\n            background-repeat: no-repeat; /* 防止图片重复平铺 */\n            background-attachment: fixed; /* 固定背景图，滚动时不跟随移动 */\n            min-height: 100vh;\n            padding: 2px;\n            color: #333;\n        }\n\n        .container {\n            max-width: 900px;\n            margin: 0 auto;\n            border-radius: 20px;\n            box-shadow: 0 20px 40px rgba(0, 0, 0, 0.1);\n            padding: 10px;\n            min-height: 100vh;\n        }\n\n        .header {\n            text-align: center;\n            margin-bottom: 10px;\n        // background: rgba(255, 255, 255, 0.6);\n            backdrop-filter: blur(1px);\n            border-radius: 20px;\n            padding: 10px;\n        }\n        .back-btn {\n            background: rgba(255, 255, 255, 0.95);\n            border: 2px solid rgba(102, 126, 234, 0.2);\n            box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);\n            position: absolute;\n            left: 5px;\n            text-align: center;\n            color: #667eea;\n            padding: 6px 12px;\n            border-radius: 20px;\n            font-size: 12px;\n            font-weight: 500;\n            text-decoration: none;\n            transition: all 0.3s ease;\n            display: flex;\n            align-items: center;\n            gap: 6px;\n            min-width: 60px;\n            width: auto;\n            /* 关键修改：添加最大宽度约束 */\n            max-width: 10px;\n            /* 防止电视系统强制拉伸 */\n            flex-shrink: 0;\n            cursor: pointer;\n        }\n        /* 1. 优化返回按钮的焦点样式，避免溢出 */\n        .back-btn:focus {\n            background: #667eea;\n            color: white;\n            transform: translateY(-2px); /* 仅保留必要的位移，移除可能的放大 */\n            box-shadow: 0 6px 12px rgba(102, 126, 234, 0.2);\n            /* 限制焦点状态的尺寸，与默认状态一致 */\n            min-width: 60px;\n            max-width: 100px;\n            /* 对抗电视系统的默认放大 */\n            transform: scale(1); /* 强制禁用缩放 */\n            -webkit-transform: scale(1); /* 兼容webkit内核电视 */\n        }\n        .logo {\n            text-align: center;\n            font-size: 1.2em;\n            font-weight: 1000;\n            color: #000000; /* 文字设为黑色 */\n            margin-bottom: 8px;\n            /* 白色描边：通过4个方向的白色阴影模拟轮廓（兼容低版本浏览器） */\n            text-shadow:\n                    -1px -1px 0 #ffffff,\n                    1px -1px 0 #ffffff,\n                    -1px  1px 0 #ffffff,\n                    1px  1px 0 #ffffff;\n        }\n\n\n        .subtitle {\n            text-align: center;\n            font-size: 0.9em;\n        // color: #7f8c8d;\n            margin: 2px 0 0;\n            font-weight: 800;\n            /* 白色描边：通过4个方向的白色阴影模拟轮廓（兼容低版本浏览器） */\n            text-shadow:\n                    -1px -1px 0 #ffffff,\n                    1px -1px 0 #ffffff,\n                    -1px  1px 0 #ffffff,\n                    1px  1px 0 #ffffff;\n        }\n\n        .quick-actions {\n            display: flex;\n            justify-content: center;\n            gap: 10px;\n            margin-top: 20px;\n            width: 100%;\n        }\n\n\n        .quick-btn {\n            flex: 1; /* 三个按钮平均分配宽度 */\n            min-width: 0; /* 允许按钮在狭小空间收缩 */\n            padding: 12px 10px;\n            background: rgba(255, 255, 255, 0.95);\n            color: #667eea;\n            text-decoration: none;\n            border-radius: 20px;\n            font-size: 14px;\n            font-weight: 600;\n            transition: all 0.3s ease;\n            border: 2px solid rgba(102, 126, 234, 0.2);\n            box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);\n            text-align: center;\n            white-space: nowrap;\n            overflow: hidden;\n            text-overflow: ellipsis;\n\n        }\n\n        .quick-btn:hover, .quick-btn:focus {\n            background: #667eea;\n            color: white;\n            transform: translateY(-2px) scale(1.05);\n            box-shadow: 0 6px 12px rgba(102, 126, 234, 0.2);\n            outline: 3px solid rgba(102, 126, 234, 0.5);\n        }\n\n        .tv-btn {\n            background: rgba(255, 255, 255, 0.9);\n            color: #764ba2;\n            border-color: rgba(118, 75, 162, 0.3);\n        }\n\n        .tv-btn:hover, .tv-btn:focus {\n            background: #764ba2;\n            color: white;\n            border-color: #764ba2;\n            box-shadow: 0 6px 12px rgba(118, 75, 162, 0.2);\n            outline: 3px solid rgba(118, 75, 162, 0.5);\n        }\n\n        .push-section {\n            background: rgba(255, 255, 255, 0.95);\n            backdrop-filter: blur(10px);\n            border-radius: 20px;\n            box-shadow: 0 15px 35px rgba(0, 0, 0, 0.1);\n            padding: 30px;\n            margin: 20px auto 20px;\n            max-width: 900px;\n            transition: all 0.3s ease;\n            min-height: 0;\n            overflow: hidden;\n        }\n\n        .push-title {\n            font-size: 1.3em;\n            font-weight: 600;\n            color: #333;\n            margin-bottom: 15px;\n            text-align: center;\n        }\n\n        .input-group {\n            margin-bottom: 12px;\n        }\n\n        .input-group label {\n            display: block;\n            margin-bottom: 6px;\n            font-weight: 500;\n            color: #555;\n            text-align: left;\n        }\n\n        .input-group input,\n        .input-group textarea {\n            width: 100%;\n            padding: 12px 15px;\n            border: 2px solid #e1e5e9;\n            border-radius: 10px;\n            font-size: 16px;\n            transition: all 0.3s ease;\n            background: #fff;\n            outline: none;\n        }\n\n        .input-group input:focus,\n        .input-group textarea:focus {\n            border-color: #667eea;\n            box-shadow: 0 0 0 3px rgba(102, 126, 234, 0.1);\n        }\n\n        .input-group textarea {\n            min-height: 70px;\n            resize: vertical;\n        }\n\n        .btn-group {\n            display: flex;\n            gap: 10px;\n            justify-content: center;\n            flex-wrap: wrap;\n        }\n\n        .btn {\n            padding: 12px 24px;\n            border: none;\n            border-radius: 25px;\n            font-size: 16px;\n            font-weight: 600;\n            cursor: pointer;\n            transition: all 0.3s ease;\n            text-decoration: none;\n            display: inline-block;\n            text-align: center;\n        }\n\n        .btn-primary {\n            background: linear-gradient(45deg, #667eea, #764ba2);\n            color: white;\n        }\n\n        .btn-primary:hover {\n            transform: translateY(-2px);\n            box-shadow: 0 8px 16px rgba(102, 126, 234, 0.3);\n        }\n\n        .btn-secondary {\n            background: rgba(102, 126, 234, 0.1);\n            color: #667eea;\n            border: 2px solid rgba(102, 126, 234, 0.2);\n        }\n\n        .btn-secondary:hover {\n            background: #667eea;\n            color: white;\n        }\n\n        .episodes-section {\n            margin-bottom: 30px;\n        }\n\n        .episodes-title {\n            font-size: 15px;\n            font-weight: 600;\n            color: #000000;\n            -webkit-background-clip: text;\n            background-clip: text;\n            margin: 10px auto 20px;\n            padding: 4px 12px 16px; /* 增加内边距给白框留出空间 */\n            position: relative;\n            display: table; /* 保持文字居中且宽度自适应 */\n        }\n\n        /* 自适应文字的白色半透明背景框 */\n        .episodes-title::before {\n            content: '';\n            position: absolute;\n            top: 0;\n            left: 0;\n            right: 0;\n            /* 自动适应内容高度 */\n            height:  1.5em;\n            /* 关键：通过行高和内边距控制垂直空间，确保完全包裹文字 */\n            line-height: 20;\n            padding: 2px 0; /* 上下各留2px空隙，避免文字贴边 */\n            background-color: white;\n            opacity: 0.5;\n            z-index: -1;\n            border-radius: 5px;\n        }\n\n        /* 延伸到屏幕两头的横线 */\n        .episodes-title::after {\n            content: '';\n            position: absolute;\n            bottom: 0;\n            left: calc(-50vw + 50%);\n            right: calc(-50vw + 50%);\n            height: 2px;\n            background: linear-gradient(90deg,transparent,#e1e5e9 20%, #e1e5e9 80%,transparent);\n            z-index: -1;\n        }\n\n        /* 中间的彩色装饰线 */\n        .episodes-title span {\n            position: relative;\n        }\n        .episodes-title span::after {\n            content: '';\n            position: absolute;\n            bottom: -17px;\n            left: 50%;\n            transform: translateX(-50%);\n            width: 60px;\n            height: 2px;\n            background: linear-gradient(45deg, #667eea, #764ba2);\n            z-index: 1;\n        }\n\n        .episodes-grid {\n            display: flex;\n            flex-wrap: wrap;\n            gap: 12px;\n            margin-bottom: 20px;\n\n            justify-content: center;\n        }\n        /* 为网格中的按钮设置文字与边框的距离 */\n        .episodes-grid .episode-btn {\n            padding: 4px 4px; /* 上下8px，左右12px的内边距 */\n            /* 其他现有样式保持不变 */\n        }\n        .episode-btn {\n            padding: 15px 16px;\n            background: #fff;\n            border: 2px solid #e1e5e9;\n            border-radius: 12px;\n            text-align: center;\n            cursor: pointer;\n            transition: all 0.3s ease;\n            font-weight: 600;\n            color: #333;\n            text-decoration: none;\n            display: inline-block;\n            font-size: 16px;\n            min-width: 60px;\n            white-space: nowrap;\n            flex-shrink: 0;\n        }\n\n        .episode-btn:hover {\n            background: #667eea;\n            color: white;\n            transform: translateY(-3px);\n            box-shadow: 0 8px 20px rgba(102, 126, 234, 0.2);\n            border-color: #667eea;\n        }\n\n        .episode-btn:focus {\n            /* 增强选集按钮的焦点效果 */\n            outline: 3px solid #667eea;\n            outline-offset: 2px;\n            box-shadow: 0 0 0 2px white, 0 0 0 5px rgba(102, 126, 234, 0.5);\n            transform: translateY(-2px) scale(1.05);\n            z-index: 10;\n        }\n\n        .episode-btn.active {\n            background: #4CAF50;\n            color: white;\n            border-color: #4CAF50;\n            transform: translateY(-2px);\n            box-shadow: 0 6px 15px rgba(76, 175, 80, 0.3);\n        }\n\n        .episode-btn.error {\n            background: #f44336;\n            color: white;\n            border-color: #f44336;\n            transform: translateY(-2px);\n            box-shadow: 0 6px 15px rgba(244, 67, 54, 0.3);\n        }\n\n        .message {\n            text-align: center;\n            padding: 12px 20px;\n            border-radius: 10px;\n            margin-top: 15px;\n            display: none;\n            font-weight: 500;\n        }\n\n        .message.success {\n            background: #d4edda;\n            color: #155724;\n            border: 1px solid #c3e6cb;\n        }\n\n        .message.error {\n            background: #f8d7da;\n            color: #721c24;\n            border: 1px solid #f5c6cb;\n        }\n\n        /* 焦点样式增强 */\n        ..focusable:focus {\n            outline: 3px solid #667eea;\n            outline-offset: 2px;\n            z-index: 10;\n            position: relative;\n        }\n        /* 快速操作按钮优化 */\n        .quick-actions {\n            gap: 6px;\n            margin-bottom: 20px;\n            flex-wrap: nowrap;\n        }\n\n        .quick-btn {\n            padding: 6px 10px;\n            font-size: 11px;\n            flex: 1;\n            text-align: center;\n            min-width: 50px;\n        }\n\n        /* 弹幕发送区域优化 */\n        .push-section {\n            padding: 15px;\n            margin-bottom: 20px;\n            border-radius: 15px;\n        }\n\n        .push-title {\n            font-size: 1.1em;\n            margin-bottom: 10px;\n        }\n\n        .input-group {\n            margin-bottom: 8px;\n        }\n\n        .input-group label {\n            font-size: 13px;\n            margin-bottom: 4px;\n        }\n\n        .input-group input,\n        .input-group textarea {\n            padding: 8px 10px;\n            font-size: 13px;\n        }\n\n        .input-group textarea {\n            min-height: 60px;\n        }\n\n        .btn {\n            padding: 8px 16px;\n            font-size: 13px;\n        }\n\n        /* 集数按钮优化 */\n        .episodes-section {\n            margin-bottom: 20px;\n        }\n\n\n\n        .episodes-grid {\n            gap: 6px;\n        }\n\n        .episode-btn {\n            padding: 10px 8px;\n            font-size: 13px;\n            min-width: 45px;\n        }\n        }\n\n\n        /* 安卓4.0 webview兼容性 */\n        .input-group input::-webkit-input-placeholder,\n        .input-group textarea::-webkit-input-placeholder {\n            color: #999;\n        }\n\n        .input-group input::-moz-placeholder,\n        .input-group textarea::-moz-placeholder {\n            color: #999;\n        }\n\n        .input-group input:-ms-input-placeholder,\n        .input-group textarea:-ms-input-placeholder {\n            color: #999;\n        }\n\n        /* 加载动画 */\n        .loading {\n            display: none;\n            width: 20px;\n            height: 20px;\n            border: 2px solid #f3f3f3;\n            border-top: 2px solid #667eea;\n            border-radius: 50%;\n            animation: spin 1s linear infinite;\n            margin: 0 auto;\n        }\n\n        @keyframes spin {\n            0% { transform: rotate(0deg); }\n            100% { transform: rotate(360deg); }\n        }\n    </style></head>\n<body><div class=\"container\">\n    <div class=\"header\">\n        <a class=\"back-btn\" href=\"javascript:history.back()\">\n            返回\n        </a>\n        <div class=\"logo\">🎬 弹幕推送</div>\n        <div class=\"subtitle\">";
        }
        return null;
    }

    /* renamed from: ۟ۡۨۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9725(Object obj, Object obj2) {
        if (C0014.m3353() < 0) {
            return ((Set) obj).containsAll((Collection) obj2);
        }
        return false;
    }

    /* renamed from: ۟ۢۢۧ, reason: not valid java name and contains not printable characters */
    public static void m9726(Object obj, Object obj2, Object obj3) {
        if (C0033.m5872() > 0) {
            ((Activity) obj).addContentView((View) obj2, (ViewGroup.LayoutParams) obj3);
        }
    }

    /* renamed from: ۟ۢۨ۠۠, reason: not valid java name and contains not printable characters */
    public static e m9727(Object obj) {
        if (C0064.m9659() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.R.b) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.P.x m9728() {
        if (C0027.m5017() >= 0) {
            return C.c;
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۡۡ, reason: not valid java name and contains not printable characters */
    public static String m9729(Object obj) {
        if (C0061.m9359() <= 0) {
            return ((HBNT4) obj).c;
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m9730(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((C0174a) obj).n();
        }
        return false;
    }

    /* renamed from: ۣۣ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static void m9731(Object obj, int i) {
        if (C0020.m4210() < 0) {
            ((AccessibilityNodeInfo) obj).setLiveRegion(i);
        }
    }

    /* renamed from: ۣ۟ۦۦۢ, reason: not valid java name and contains not printable characters */
    public static boolean m9732(Object obj) {
        if (C0031.m5628() >= 0) {
            return ((AccessibilityNodeInfo) obj).canOpenPopup();
        }
        return false;
    }

    /* renamed from: ۟ۤ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static String m9733(Object obj, Object obj2) {
        if (C0052.m8320() >= 0) {
            return m.b((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m9734() {
        if (C0049.m8038() < 0) {
            return C0273c.h;
        }
        return 0;
    }

    /* renamed from: ۣ۟ۤۥۦ, reason: not valid java name and contains not printable characters */
    public static CharSequence m9735(Object obj) {
        if (C0033.m5872() >= 0) {
            return ((Notification.Action) obj).title;
        }
        return null;
    }

    /* renamed from: ۟ۤۦۨۥ, reason: not valid java name and contains not printable characters */
    public static v m9736() {
        if (C0032.m5686() < 0) {
            return v.e;
        }
        return null;
    }

    /* renamed from: ۟ۤۨۦۦ, reason: not valid java name and contains not printable characters */
    public static int m9737(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۟ۥ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static String m9738() {
        if (C0026.m4977() <= 0) {
            return W55Movie.a;
        }
        return null;
    }

    /* renamed from: ۟ۥۡۢۦ, reason: not valid java name and contains not printable characters */
    public static String m9739() {
        if (C0036.m6252() >= 0) {
            return "验证结果--> ";
        }
        return null;
    }

    /* renamed from: ۟ۥۢۡۨ, reason: not valid java name and contains not printable characters */
    public static String m9740(Object obj) {
        if (C0039.m6529() < 0) {
            return com.github.catvod.spider.merge.U.p.e((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۥۢۤ, reason: not valid java name and contains not printable characters */
    public static double m9741(Object obj) {
        if (C0003.m1463() <= 0) {
            return ((Number) obj).doubleValue();
        }
        return 0.0d;
    }

    /* renamed from: ۟ۥۢۥۥ, reason: not valid java name and contains not printable characters */
    public static View m9742(Object obj) {
        if (C0022.m4497() > 0) {
            return ((AnimationAnimationListenerC0331k) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۥۦۣۣ, reason: not valid java name and contains not printable characters */
    public static XBPQ m9743(Object obj) {
        if (C0009.m2047() >= 0) {
            return ((XBPQc) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۥۦۨۥ, reason: not valid java name and contains not printable characters */
    public static void m9744(Object obj) throws IOException {
        if (C0000.m1116() < 0) {
            ((OutputStream) obj).flush();
        }
    }

    /* renamed from: ۟ۦ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static void m9745(Object obj, int i) {
        if (C0027.m5017() >= 0) {
            ((com.github.catvod.spider.merge.H0.f) obj).a(i);
        }
    }

    /* renamed from: ۟ۦۣۡۧ, reason: not valid java name and contains not printable characters */
    public static String m9746() {
        if (C0053.m8389() >= 0) {
            return "电影--喜剧&爱情&动作&科幻&战争&警匪&犯罪&动画&奇幻&古装&武侠&冒险&恐怖&惊悚&灾难&悬疑&枪战&剧情&青春&文艺&历史&传奇&音乐&歌舞&都市&运动&儿童&伦理&情色&其他||连续剧--古装&神话&战争&喜剧&爱情&武侠&动作&穿越&奇幻&偶像&家庭&犯罪&悬疑&恐怖&惊悚&灾难&剧情&乡村&都市&经典&历史&传奇&音乐&歌舞&网剧&情景&伦理&情色&其他||综艺--脱口秀&真人秀&访谈&情感&选秀&生活&美食&旅游&音乐&舞蹈&财经&纪实&游戏&歌舞&求职&情色&其他||动漫--科幻&热血&搞笑&冒险&推理&战争&机战&动作&校园&社会&亲子&励志&少年&少女&萝莉&益智&原创&运动&情色&其他||纪录片--纪录&历史&传记&音乐&歌舞&短片&科幻&其他||通用--喜剧&爱情&动作&科幻&战争&犯罪&神话&奇幻&穿越&古装&武侠&冒险&恐怖&惊悚&灾难&悬疑&儿童&伦理&情色&其他";
        }
        return null;
    }

    /* renamed from: ۟ۦۣۢۤ, reason: not valid java name and contains not printable characters */
    public static int m9747() {
        if (C0014.m3353() < 0) {
            return com.github.catvod.spider.merge.g0.f.a;
        }
        return 0;
    }

    /* renamed from: ۟ۦۦۦۢ, reason: not valid java name and contains not printable characters */
    public static void m9748(Object obj, Object obj2) {
        if (C0013.m3167() > 0) {
            ((ClipboardManager) obj).setPrimaryClip((ClipData) obj2);
        }
    }

    /* renamed from: ۟ۧ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static WebView m9749(Object obj) {
        if (C0001.m1164() < 0) {
            return ((q) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۧ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static int m9750() {
        return 990 ^ C0049.f770;
    }

    /* renamed from: ۟ۧ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static int m9751(Object obj) {
        if (C0060.m9355() > 0) {
            return ((k) obj).i;
        }
        return 0;
    }

    /* renamed from: ۟ۧ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m9752(Object obj) {
        if (C0038.m6471() > 0) {
            return ((L) obj).g;
        }
        return false;
    }

    /* renamed from: ۟ۧۢۡۦ, reason: not valid java name and contains not printable characters */
    public static String m9753() {
        if (C0064.m9659() <= 0) {
            return "\\[.*";
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۦۦ, reason: not valid java name and contains not printable characters */
    public static int m9754() {
        if (C0039.m6529() <= 0) {
            return com.github.catvod.spider.p000mergexbpq.U.b.e;
        }
        return 0;
    }

    /* renamed from: ۠ۤۢۧ, reason: not valid java name and contains not printable characters */
    public static int m9755(Object obj, int i, Object obj2) {
        if (C0039.m6529() <= 0) {
            return ((C0273c) obj).c(i, obj2);
        }
        return 0;
    }

    /* renamed from: ۠ۥۤ۠, reason: not valid java name and contains not printable characters */
    public static IBinder m9756(Object obj) {
        if (C0014.m3353() < 0) {
            return ((C0231a) obj).b;
        }
        return null;
    }

    /* renamed from: ۠ۦۨۧ, reason: not valid java name and contains not printable characters */
    public static HashMap m9757(Object obj) {
        if (C0042.m7147() < 0) {
            return ((com.github.catvod.spider.merge.B.c) obj).a;
        }
        return null;
    }

    /* renamed from: ۠ۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m9758(Object obj, Object obj2) {
        if (C0016.m3596() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.r) obj).a((String) obj2);
        }
        return null;
    }

    /* renamed from: ۡ۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.F.e m9759(Object obj) {
        if (C0002.m1242() > 0) {
            return ((com.github.catvod.spider.merge.F.e) obj).c();
        }
        return null;
    }

    /* renamed from: ۡ۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static String m9760(Object obj) {
        if (C0047.m7837() > 0) {
            return ((File) obj).getCanonicalPath();
        }
        return null;
    }

    /* renamed from: ۣۡۢ۟, reason: not valid java name and contains not printable characters */
    public static String m9761(Object obj, Object obj2, Object obj3) {
        if (C0029.m5282() > 0) {
            return ((AppYsV2) obj).d((String) obj2, (JSONObject) obj3);
        }
        return null;
    }

    /* renamed from: ۣۡۤ۟, reason: not valid java name and contains not printable characters */
    public static String m9762() {
        if (C0014.m3353() <= 0) {
            return "2";
        }
        return null;
    }

    /* renamed from: ۡۤۨ۠, reason: not valid java name and contains not printable characters */
    public static float m9763(Object obj) {
        if (C0060.m9355() >= 0) {
            return ((MotionEvent) obj).getX();
        }
        return 0.0f;
    }

    /* renamed from: ۡۥۣ۠, reason: not valid java name and contains not printable characters */
    public static String m9764(Object obj) {
        if (C0024.m4693() <= 0) {
            return ((n) obj).a;
        }
        return null;
    }

    /* renamed from: ۡۦۦۡ, reason: not valid java name and contains not printable characters */
    public static d m9765(Object obj) {
        if (C0028.m5152() < 0) {
            return ((com.github.catvod.spider.merge.T0.m) obj).A();
        }
        return null;
    }

    /* renamed from: ۡۧۦۦ, reason: not valid java name and contains not printable characters */
    public static int m9766(Object obj) {
        if (C0037.m6350() < 0) {
            return ((C0144a) obj).e;
        }
        return 0;
    }

    /* renamed from: ۡۨۢۨ, reason: not valid java name and contains not printable characters */
    public static String m9767() {
        if (C0046.m7701() >= 0) {
            return "/proxy\"]:focus {\n            outline: none;\n            box-shadow: 0 0 0 3px rgba(0, 123, 255, 0.3);\n            transform: translateY(-1px);\n        }\n        \n        /* 剧集卡片内的链接样式 */\n        .episode-link {\n            color: inherit;\n            display: block;\n            width: 100%;\n            height: 100%;\n        }\n        \n        /* 页面整体布局增强 */\n        .page-container {\n            max-width: 800px;\n            margin: 0 auto;\n            padding: 20px;\n            background-color: rgba(255, 255, 255, 0.7);\n            border-radius: 10px;\n            box-shadow: 0 0 15px rgba(0, 0, 0, 0.05);\n        }\n        \n        /* 标题样式增强 */\n        h3 {\n            font-size: 1.3em;\n            margin-bottom: 15px;\n            text-shadow: 1px 1px 2px rgba(0, 0, 0, 0.1);\n            transition: all 0.3s ease;\n        }\n        \n        h3:hover {\n            transform: translateY(-2px);\n        }\n        \n        /* 来源容器样式增强 */\n        .source-container {\n            transition: all 0.3s ease;\n            transform: translateY(0);\n            margin-bottom: 30px;\n        }\n        \n        .source-container:hover {\n            transform: translateY(-3px);\n        }\n        \n        /* 来源标题样式增强 */\n        .source-title {\n            font-size: 1.0em; /* 调整字体大小 */\n            margin-bottom: 15px;\n            border-bottom: 2px solid #eee;padding-bottom: 5px;\n            \n            position: relative;\n        }\n        \n        .source-title::after {\n            content: '';\n            position: absolute;\n            bottom: -2px;\n            left: 0;\n            width: 30%;\n            height: 2px;\n            background-color: #007BFF;\n            transition: width 0.3s ease;\n        }\n        \n        .source-container:hover .source-title::after {\n            width: 100%;\n        }\n        \n        /* 新增的输入区域样式 */\n        .input-container {\n            margin-top: 2px; /* 减少顶部间距 */\n            padding-top: 2px; /* 减少顶部内边距 */\n            border-top: 1px solid #eee;\n            max-width: 600px;\n            margin-left: auto;\n            margin-right: auto;\n        }\n        \n        /* iOS风格折叠按钮 - 增强交互效果 */\n        .toggle-input {\n            background: linear-gradient(180deg, rgba(255, 255, 255, 0.95) 0%, rgba(248, 250, 252, 0.92) 100%);\n            backdrop-filter: blur(40px) saturate(180%);\n            -webkit-backdrop-filter: blur(40px) saturate(180%);\n            color: #007AFF;\n            border: 0.5px solid rgba(255, 255, 255, 0.6);\n            padding: 16px 28px;\n            border-radius: 14px;\n            cursor: pointer;\n            font-size: 15px;\n            font-weight: 600;\n            letter-spacing: -0.3px;\n            transition: all 0.3s cubic-bezier(0.25, 0.46, 0.45, 0.94);\n            margin-bottom: 12px;\n            display: inline-block;\n            box-shadow: \n                0 2px 6px rgba(0, 0, 0, 0.06),\n                0 6px 16px rgba(52, 152, 219, 0.12),\n                0 16px 40px rgba(52, 152, 219, 0.08),\n                inset 0 1px 0 rgba(255, 255, 255, 0.8);\n            position: relative;\n            overflow: hidden;\n            transform: translateY(0);\n        }\n        \n        /* 添加按钮状态指示 */\n        .toggle-input::after {\n            content: '▼';\n            position: absolute;\n            right: 16px;\n            top: 50%;\n            transform: translateY(-50%) rotate(0deg);\n            transition: transform 0.3s ease;\n            font-size: 12px;\n            opacity: 0.6;\n        }\n        \n        .expanded .toggle-input::after {\n            transform: translateY(-50%) rotate(180deg);\n        }\n        \n        .toggle-input::before {\n            content: '';\n            position: absolute;\n            top: 0;\n            left: 0;\n            right: 0;\n            height: 50%;\n            background: linear-gradient(180deg, rgba(255, 255, 255, 0.4) 0%, transparent 100%);\n            border-radius: 14px 14px 0 0;\n            pointer-events: none;\n        }\n        \n        .toggle-input:hover {\n            background: linear-gradient(180deg, rgba(255, 255, 255, 0.98) 0%, rgba(250, 252, 255, 0.95) 100%);\n            transform: translateY(-3px) scale(1.02);\n            box-shadow: \n                0 4px 8px rgba(0, 0, 0, 0.08),\n                0 8px 20px rgba(52, 152, 219, 0.15),\n                0 20px 50px rgba(52, 152, 219, 0.12),\n                inset 0 1px 0 rgba(255, 255, 255, 0.9);\n            border-color: rgba(52, 152, 219, 0.3);\n            color: #0051D5;\n        }\n        \n        .toggle-input:active {\n            transform: translateY(0) scale(0.98);\n            box-shadow: \n                0 1px 2px rgba(0, 0, 0, 0.04),\n                0 2px 8px rgba(52, 152, 219, 0.06),\n                inset 0 1px 0 rgba(255, 255, 255, 0.7);\n            transition: all 0.1s cubic-bezier(0.4, 0, 0.2, 1);\n        }\n        \n        /* 用户名和发送按钮在同一行并居右 */\n        .input-row {\n            display: flex;\n            justify-content: flex-end;\n            align-items: center;\n            gap: 10px; /* 缩小间距 */\n            margin-bottom: 8px; /* 减少底部间距 */\n        }\n        .user-input {\n            flex: 0 1 200px;\n            display: flex;\n            margin-left: auto;\n            align-items: center;\n            gap: 2px; /* 缩小间距 */\n        }\n        .user-input label {\n            white-space: nowrap;\n            font-weight: bold;\n        }\n        .user-input input {\n            width: 40%;\n            margin-left: auto;\n            padding: 12px 16px;\n            border: 2px solid rgba(52, 152, 219, 0.2);\n            border-radius: 10px;\n            font-size: 14px;\n            background: rgba(248, 250, 252, 0.9);\n            color: #2c3e50;\n            transition: all 0.3s ease;\n        }\n\n        .user-input input::placeholder {\n            color: #95a5a6;\n        }\n\n        .user-input input:focus {\n            outline: none;\n            border-color: rgba(52, 152, 219, 0.6);\n            background: rgba(255, 255, 255, 1);\n            box-shadow: 0 0 0 4px rgba(52, 152, 219, 0.1), 0 0 25px rgba(52, 152, 219, 0.15);\n        }\n        \n        .message-input {\n            margin-bottom: 8px; /* 减少底部间距 */\n        }\n        \n        .message-input textarea {\n            width: 100%;\n            padding: 16px;\n            border: 2px solid rgba(52, 152, 219, 0.2);\n            border-radius: 12px;\n            min-height: 90px;\n            font-family: inherit;\n            font-size: 14px;\n            box-sizing: border-box;\n            resize: vertical;\n            background: rgba(248, 250, 252, 0.95);\n            color: #2c3e50;\n            transition: all 0.3s cubic-bezier(0.25, 0.46, 0.45, 0.94);\n            backdrop-filter: blur(10px);\n            box-shadow: inset 0 2px 4px rgba(52, 152, 219, 0.05);\n        }\n\n        .message-input textarea::placeholder {\n            color: #95a5a6;\n        }\n\n        .message-input textarea:focus {\n            outline: none;\n            border-color: rgba(52, 152, 219, 0.6);\n            background: rgba(255, 255, 255, 1);\n            box-shadow: \n                0 0 0 4px rgba(52, 152, 219, 0.15), \n                0 4px 12px rgba(52, 152, 219, 0.2),\n                inset 0 2px 4px rgba(52, 152, 219, 0.05);\n            transform: translateY(-1px);\n        }\n        \n        /* iOS风格发送按钮 */\n        .send-button {\n            background: linear-gradient(180deg, #007AFF 0%, #0051D5 100%);\n            color: white;\n            border: none;\n            padding: 13px 26px;\n            border-radius: 12px;\n            cursor: pointer;\n            font-size: 14px;\n            font-weight: 600;\n            letter-spacing: -0.3px;\n            transition: all 0.25s cubic-bezier(0.4, 0, 0.2, 1);\n            white-space: nowrap;\n            box-shadow: \n                0 1px 3px rgba(0, 0, 0, 0.12),\n                0 4px 12px rgba(0, 122, 255, 0.3),\n                0 12px 32px rgba(0, 122, 255, 0.2),\n                inset 0 1px 0 rgba(255, 255, 255, 0.2);\n            position: relative;\n            overflow: hidden;\n        }\n        \n        .send-button::before {\n            content: '';\n            position: absolute;\n            top: 0;\n            left: 0;\n            right: 0;\n            height: 50%;\n            background: linear-gradient(180deg, rgba(255, 255, 255, 0.25) 0%, transparent 100%);\n            border-radius: 12px 12px 0 0;\n            pointer-events: none;\n        }\n        \n        .send-button:hover {\n            transform: translateY(-2px) scale(1.01);\n            box-shadow: \n                0 2px 4px rgba(0, 0, 0, 0.14),\n                0 6px 16px rgba(0, 122, 255, 0.35),\n                0 16px 40px rgba(0, 122, 255, 0.25),\n                inset 0 1px 0 rgba(255, 255, 255, 0.25);\n            background: linear-gradient(180deg, #0080FF 0%, #0056E0 100%);\n        }\n        \n        .send-button:active {\n            transform: translateY(0) scale(0.98);\n            box-shadow: \n                0 1px 2px rgba(0, 0, 0, 0.1),\n                0 2px 8px rgba(0, 122, 255, 0.2),\n                inset 0 1px 0 rgba(255, 255, 255, 0.15);\n            transition: all 0.1s cubic-bezier(0.4, 0, 0.2, 1);\n        }\n        \n        .send-button:focus {\n            outline: none;\n            box-shadow: \n                0 0 0 4px rgba(0, 122, 255, 0.2),\n                0 4px 12px rgba(0, 122, 255, 0.3),\n                inset 0 1px 0 rgba(255, 255, 255, 0.2);\n        }\n        \n        /* 折叠内容样式 - 增强动画效果 */\n        .collapsible-content {\n            overflow: hidden;\n            transition: all 0.4s cubic-bezier(0.25, 0.46, 0.45, 0.94);\n            opacity: 0;\n            transform: translateY(-10px);\n        }\n        \n        .collapsed .collapsible-content {\n            max-height: 0;\n            opacity: 0;\n            transform: translateY(-10px);\n            padding-top: 0;\n            padding-bottom: 0;\n        }\n        \n        .expanded .collapsible-content {\n            max-height: 500px; /* 足够大的值以容纳内容 */\n            opacity: 1;\n            transform: translateY(0);\n            padding-top: 10px;\n            padding-bottom: 10px;\n        }\n        \n        /* 提示文本和按钮容器 */\n        .info-container {\n            text-align: center;\n            margin-bottom: 10px; /* 减少底部间距 */\n        }\n        \n        .info-text {\n            margin-bottom: 0px; /* 缩小提示文本与按钮的距离 */\n            display: inline-block;\n        }\n        \n        .quick-search-container {\n            margin-top: 2px; /* 缩小与上方元素的距离 */\n        }\n        \n        /* 新增的响应式布局优化 */\n        .page-wrapper {\n            max-width: 1200px;\n            margin: 0 auto;\n            display: flex;\n            flex-direction: column;\n            gap: 20px;\n        }\n        \n        .control-panel {\n            background: rgba(255, 255, 255, 0.95);\n            backdrop-filter: blur(20px);\n            border-radius: 16px;\n            padding: 20px;\n            box-shadow: 0 8px 32px rgba(52, 152, 219, 0.12), 0 4px 16px rgba(0, 0, 0, 0.05);\n            border: 2px solid rgba(52, 152, 219, 0.1);\n            position: relative;\n            z-index: 1;\n        }\n        \n        .control-grid {\n            display: grid;\n            grid-template-columns: 1fr 1fr 1fr;\n            gap: 15px;\n            margin-bottom: 15px;\n            align-items: stretch; /* 确保所有按钮高度一致 */\n        }\n        \n        .episodes-section {\n            flex: 1;\n        }\n        \n        /* iOS风格控制按钮 */\n        .control-grid a {\n            background: linear-gradient(180deg, rgba(255, 255, 255, 0.95) 0%, rgba(248, 250, 252, 0.92) 100%);\n            backdrop-filter: blur(40px) saturate(180%);\n            -webkit-backdrop-filter: blur(40px) saturate(180%);\n            border: 0.5px solid rgba(255, 255, 255, 0.6);\n            box-shadow: \n                0 1px 3px rgba(0, 0, 0, 0.04),\n                0 4px 12px rgba(52, 152, 219, 0.08),\n                0 12px 32px rgba(52, 152, 219, 0.06),\n                inset 0 1px 0 rgba(255, 255, 255, 0.8);\n            color: #007AFF;\n            font-weight: 600;\n            letter-spacing: -0.3px;\n            transition: all 0.25s cubic-bezier(0.4, 0, 0.2, 1);\n            position: relative;\n            overflow: hidden;\n        }\n        \n        .control-grid a::before {\n            content: '';\n            position: absolute;\n            top: 0;\n            left: 0;\n            right: 0;\n            height: 50%;\n            background: linear-gradient(180deg, rgba(255, 255, 255, 0.4) 0%, transparent 100%);\n            pointer-events: none;\n        }\n        \n        .control-grid a:hover {\n            background: linear-gradient(180deg, rgba(255, 255, 255, 0.98) 0%, rgba(250, 252, 255, 0.95) 100%);\n            transform: translateY(-2px) scale(1.01);\n            box-shadow: \n                0 2px 4px rgba(0, 0, 0, 0.05),\n                0 6px 16px rgba(52, 152, 219, 0.12),\n                0 16px 40px rgba(52, 152, 219, 0.1),\n                inset 0 1px 0 rgba(255, 255, 255, 0.9);\n            border-color: rgba(255, 255, 255, 0.7);\n            color: #0051D5;\n        }\n        \n        .control-grid a:active {\n            transform: translateY(0) scale(0.98);\n            box-shadow: \n                0 1px 2px rgba(0, 0, 0, 0.04),\n                0 2px 8px rgba(52, 152, 219, 0.06),\n                inset 0 1px 0 rgba(255, 255, 255, 0.7);\n            transition: all 0.1s cubic-bezier(0.4, 0, 0.2, 1);\n        }\n        \n        /* 美化控制按钮样式 */\n        .control-btn {\n            display: flex;\n            flex-direction: column;\n            align-items: center;\n            justify-content: center;\n            padding: 18px 12px;\n            border-radius: 16px;\n            text-decoration: none;\n            position: relative;\n            overflow: hidden;\n            transition: all 0.4s cubic-bezier(0.25, 0.46, 0.45, 0.94);\n            background: linear-gradient(145deg, rgba(255, 255, 255, 0.98), rgba(248, 252, 255, 0.95));\n            backdrop-filter: blur(25px);\n            border: 2px solid rgba(52, 152, 219, 0.12);\n            box-shadow: 0 8px 32px rgba(52, 152, 219, 0.08), 0 4px 16px rgba(0, 0, 0, 0.04);\n            min-height: 100px; /* 统一最小高度 */\n            height: 100px; /* 固定高度确保一致性 */\n        }\n        \n        .btn-icon {\n            font-size: 28px;\n            margin-bottom: 8px;\n            transition: all 0.3s ease;\n            filter: drop-shadow(0 2px 4px rgba(0, 0, 0, 0.1));\n        }\n        \n        .btn-text {\n            font-size: 13px;\n            font-weight: 600;\n            color: #2c3e50;\n            text-align: center;\n            line-height: 1.3;\n            transition: all 0.3s ease;\n            letter-spacing: 0.3px;\n            word-wrap: break-word;\n            max-width: 100%;\n            overflow-wrap: break-word;\n        }\n        \n        .control-btn::before {\n            content: '';\n            position: absolute;\n            top: 0;\n            left: -100%;\n            width: 100%;\n            height: 100%;\n            background: linear-gradient(90deg, transparent, rgba(255, 255, 255, 0.4), transparent);\n            transition: left 0.6s ease;\n        }\n        \n        .control-btn:hover::before {\n            left: 100%;\n        }\n        \n        .control-btn:hover {\n            transform: translateY(-4px) scale(1.02);\n            box-shadow: 0 12px 40px rgba(52, 152, 219, 0.15), 0 6px 20px rgba(0, 0, 0, 0.08);\n            border-color: rgba(52, 152, 219, 0.25);\n            background: linear-gradient(145deg, rgba(255, 255, 255, 1), rgba(248, 252, 255, 0.98));\n        }\n        \n        .control-btn:hover .btn-icon {\n            transform: scale(1.1);\n        }\n        \n        .control-btn:hover .btn-text {\n            color: #1f618d;\n        }\n        \n        /* 返回主页按钮 - 绿色主题 */\n        .home-btn {\n            background: linear-gradient(145deg, rgba(76, 175, 80, 0.08), rgba(67, 160, 71, 0.05));\n            border-color: rgba(76, 175, 80, 0.2);\n        }\n        \n        .home-btn .btn-text {\n            color: #2e7d32;\n        }\n        \n        .home-btn:hover {\n            background: linear-gradient(145deg, rgba(76, 175, 80, 0.12), rgba(67, 160, 71, 0.08));\n            border-color: rgba(76, 175, 80, 0.35);\n            box-shadow: 0 12px 40px rgba(76, 175, 80, 0.15), 0 6px 20px rgba(0, 0, 0, 0.08);\n        }\n        \n        .home-btn:hover .btn-text {\n            color: #1b5e20;\n        }\n        \n        /* 快速搜索按钮 - 橙色主题 */\n        .search-btn {\n            background: linear-gradient(145deg, rgba(255, 152, 0, 0.08), rgba(255, 143, 0, 0.05));\n            border-color: rgba(255, 152, 0, 0.2);\n        }\n        \n        .search-btn .btn-text {\n            color: #e65100;\n        }\n        \n        .search-btn:hover {\n            background: linear-gradient(145deg, rgba(255, 152, 0, 0.12), rgba(255, 143, 0, 0.08));\n            border-color: rgba(255, 152, 0, 0.35);\n            box-shadow: 0 12px 40px rgba(255, 152, 0, 0.15), 0 6px 20px rgba(0, 0, 0, 0.08);\n        }\n        \n        .search-btn:hover .btn-text {\n            color: #bf360c;\n        }\n        \n        /* 扫码推送按钮 - 紫色主题 */\n        .push-btn {\n            background: linear-gradient(145deg, rgba(156, 39, 176, 0.08), rgba(142, 36, 170, 0.05));\n            border-color: rgba(156, 39, 176, 0.2);\n        }\n        \n        .push-btn .btn-text {\n            color: #7b1fa2;\n        }\n        \n        .push-btn:hover {\n            background: linear-gradient(145deg, rgba(156, 39, 176, 0.12), rgba(142, 36, 170, 0.08));\n            border-color: rgba(156, 39, 176, 0.35);\n            box-shadow: 0 12px 40px rgba(156, 39, 176, 0.15), 0 6px 20px rgba(0, 0, 0, 0.08);\n        }\n        \n        .push-btn:hover .btn-text {\n            color: #4a148c;\n        }\n        \n        /* 移动端优化 */\n        @media (max-width: 768px) {\n            body {\n                padding: 5px;\n                gap: 8px;\n                min-height: 100vh;\n            }\n            \n            .page-wrapper {\n                gap: 10px;\n                padding: 0 2px;\n            }\n            \n            .control-card, .danmaku-card, .episodes-card {\n                padding: 12px !important;\n                border-radius: 10px !important;\n                margin-bottom: 0 !important;\n            }\n            \n            h3 {\n                margin: 0 0 10px 0 !important;\n                font-size: 1.1em !important;\n            }\n            \n            .control-grid {\n                grid-template-columns: 1fr 1fr 1fr;\n                gap: 8px;\n            }\n            \n            .control-btn {\n                padding: 16px 12px !important;\n                min-height: 85px !important;\n                height: 85px !important; /* 移动端固定高度 */\n                border-radius: 12px !important;\n            }\n            \n            .btn-icon {\n                font-size: 24px !important;\n                margin-bottom: 6px !important;\n            }\n            \n            .btn-text {\n                font-size: 11px !important;\n            }\n            \n            .episode-container {\n                gap: 10px !important;\n                padding: 0 !important;\n            }\n            \n            .episode {\n                min-width: 52px !important;\n                height: 44px !important;\n                padding: 10px 14px !important;\n                font-size: 14px !important;\n                border-radius: 10px !important;\n            }\n            \n            .source-title {\n                padding: 8px 12px !important;\n                margin-bottom: 12px !important;\n                border-radius: 8px !important;\n                font-size: 0.9em !important;\n            }\n        }\n        \n        @media (max-width: 480px) {\n            body {\n                padding: 3px;\n                gap: 6px;\n            }\n            \n            .page-wrapper {\n                gap: 8px;\n                padding: 0 1px;\n            }\n            \n            .control-card, .danmaku-card, .episodes-card {\n                padding: 10px !important;\n                border-radius: 8px !important;\n            }\n            \n            h3 {\n                margin: 0 0 8px 0 !important;\n                font-size: 1em !important;\n            }\n            \n            .control-grid {\n                grid-template-columns: 1fr;\n                gap: 8px;\n            }\n            \n            .control-btn {\n                padding: 18px 16px !important;\n                min-height: 90px !important;\n                height: 90px !important; /* 小屏幕固定高度 */\n                border-radius: 10px !important;\n            }\n            \n            .btn-icon {\n                font-size: 26px !important;\n                margin-bottom: 8px !important;\n            }\n            \n            .btn-text {\n                font-size: 12px !important;\n            }\n            \n            .episode-container {\n                gap: 8px !important;\n                justify-content: center !important;\n            }\n            \n            .episode {\n                min-width: 48px !important;\n                height: 42px !important;\n                padding: 10px 14px !important;\n                font-size: 14px !important;\n                border-radius: 8px !important;\n            }\n            \n            .source-title {\n                padding: 6px 10px !important;\n                margin-bottom: 10px !important;\n                border-radius: 6px !important;\n                font-size: 0.85em !important;\n            }\n            \n            /* 优化弹幕发送区域 */\n            .toggle-input {\n                padding: 12px 20px !important;\n                font-size: 13px !important;\n                border-radius: 10px !important;\n                position: relative !important;\n            }\n            \n            .toggle-input::after {\n                right: 12px !important;\n                font-size: 10px !important;\n            }\n            \n            .message-input textarea {\n                min-height: 70px !important;\n                padding: 12px !important;\n                font-size: 13px !important;\n                border-radius: 10px !important;\n            }\n            \n            .user-input input {\n                padding: 10px 14px !important;\n                font-size: 13px !important;\n                border-radius: 8px !important;\n            }\n            \n            .send-button {\n                padding: 10px 18px !important;\n                font-size: 13px !important;\n                border-radius: 8px !important;\n            }\n        }\n        \n        /* 超小屏幕优化 */\n        @media (max-width: 360px) {\n            body {\n                padding: 2px;\n                gap: 4px;\n            }\n            \n            .page-wrapper {\n                gap: 6px;\n                padding: 0;\n            }\n            \n            .control-card, .danmaku-card, .episodes-card {\n                padding: 8px !important;\n                border-radius: 6px !important;\n            }\n            \n            .episode {\n                min-width: 44px !important;\n                height: 40px !important;\n                padding: 8px 12px !important;\n                font-size: 13px !important;\n            }\n        }    </style>\n</head>\n<body>\n    <!-- 页面主容器 -->\n    <div class=\"page-wrapper\" style=\"max-width: 1200px; margin: 0 auto; display: flex; flex-direction: column; gap: 15px; padding: 0 5px;\">\n        \n        <!-- 控制中心卡片 -->\n        <div class=\"control-card\" style=\"background: rgba(255, 255, 255, 0.95); backdrop-filter: blur(20px); border-radius: 12px; padding: 15px; box-shadow: 0 6px 24px rgba(52, 152, 219, 0.1), 0 3px 12px rgba(0, 0, 0, 0.04); border: 1.5px solid rgba(52, 152, 219, 0.1); position: relative; z-index: 1;\">\n            <h3 style=\"margin: 0 0 15px 0; text-align: center;\">🎮 控制中心</h3>\n            <div class=\"control-grid\" style=\"display: grid; grid-template-columns: 1fr 1fr 1fr; gap: 16px;\">\n                <a href=\"";
        }
        return null;
    }

    /* renamed from: ۢ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static Enumeration m9768(Object obj) {
        if (C0034.m6048() < 0) {
            return ((NetworkInterface) obj).getInetAddresses();
        }
        return null;
    }

    /* renamed from: ۣۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m9769() {
        if (C0031.m5628() > 0) {
            return ".*User-Agent\\$(.*?)#.*";
        }
        return null;
    }

    /* renamed from: ۢ۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static i m9770(Object obj) {
        if (C0031.m5628() > 0) {
            return ((com.github.catvod.spider.merge.F.c) obj).b();
        }
        return null;
    }

    /* renamed from: ۢۢۡۡ, reason: not valid java name and contains not printable characters */
    public static String m9771() {
        if (C0060.m9355() > 0) {
            return "magnet";
        }
        return null;
    }

    /* renamed from: ۢۧۥۣ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.c0.c m9772(Object obj, Object obj2) {
        if (C0033.m5872() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.c) obj).s((com.github.catvod.spider.p000mergexbpq.c0.a) obj2);
        }
        return null;
    }

    /* renamed from: ۢۨ, reason: not valid java name and contains not printable characters */
    public static String m9773(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0020.m4210() <= 0) {
            return ((C0253n) obj).j((String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* renamed from: ۣۡۢۦ, reason: not valid java name and contains not printable characters */
    public static C0315D m9774(Object obj) {
        if (C0056.m8886() < 0) {
            return ((C0314C) obj).k;
        }
        return null;
    }

    /* renamed from: ۣۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m9776(Object obj) {
        if (C0049.m8038() <= 0) {
            return com.github.catvod.spider.merge.l0.f.c((String) obj);
        }
        return 0;
    }

    /* renamed from: ۣۨۢ۟, reason: not valid java name and contains not printable characters */
    public static String m9777() {
        if (C0016.m3596() <= 0) {
            return "') no-repeat center center fixed;\n            background-attachment: fixed;\n            min-height: 100vh;\n            padding: 8px;\n            position: relative;\n            color: #2c3e50;\n            display: flex;\n            flex-direction: column;\n            gap: 12px;\n            margin: 0;\n            overflow-x: hidden;\n        }\n\n        /* 网格背景效果 */\n        body::before {\n            content: '';\n            position: fixed;\n            top: 0;\n            left: 0;\n            right: 0;\n            bottom: 0;\n            background-image: \n                linear-gradient(rgba(52, 152, 219, 0.06) 1px, transparent 1px),\n                linear-gradient(90deg, rgba(52, 152, 219, 0.06) 1px, transparent 1px);\n            background-size: 40px 40px;\n            pointer-events: none;\n            z-index: 0;\n        }\n        \n        /* 移动端隐藏网格背景 */\n        @media (max-width: 768px) {\n            body::before {\n                background-image: none;\n                background: rgba(248, 249, 255, 0.3);\n            }\n        }\n\n        h3 {\n            font-size: 1.3em;\n            color: #2c3e50;\n            text-align: center;\n            margin-bottom: 15px;\n            text-shadow: 0 2px 4px rgba(52, 152, 219, 0.3);\n            letter-spacing: 1px;\n            position: relative;\n            z-index: 1;\n        }\n\n        .source-container {\n            margin-bottom: 20px;\n            background: rgba(255, 255, 255, 0.95);\n            backdrop-filter: blur(20px);\n            border-radius: 16px;\n            padding: 20px;\n            box-shadow: 0 8px 32px rgba(52, 152, 219, 0.12), 0 4px 16px rgba(0, 0, 0, 0.05);\n            border: 2px solid rgba(52, 152, 219, 0.1);\n            transition: all 0.3s ease;\n            position: relative;\n            z-index: 1;\n            flex: 1;\n        }\n\n        .source-container:hover {\n            transform: translateY(-3px);\n            box-shadow: 0 15px 50px rgba(52, 152, 219, 0.2), 0 8px 25px rgba(0, 0, 0, 0.08);\n            border-color: rgba(52, 152, 219, 0.3);\n        }\n\n        .source-title {\n            font-size: 1.1em;\n            font-weight: 700;\n            text-align: center;\n            margin-bottom: 18px;\n            color: #2c3e50;\n            text-shadow: 0 2px 4px rgba(52, 152, 219, 0.3);\n            position: relative;\n            padding: 8px 16px;\n            background: linear-gradient(135deg, rgba(52, 152, 219, 0.08), rgba(41, 128, 185, 0.08));\n            border-radius: 10px;\n            border: 1px solid rgba(52, 152, 219, 0.15);\n        }\n\n        .episode-container {\n            display: flex;\n            flex-wrap: wrap;\n            gap: 14px;\n            justify-content: flex-start;\n            align-items: flex-start;\n            max-width: 100%;\n            margin: 0 auto;\n            padding: 0 5px;\n        }\n\n        .episode {\n            background: linear-gradient(145deg, rgba(255, 255, 255, 0.98), rgba(248, 250, 252, 0.95));\n            backdrop-filter: blur(20px);\n            padding: 14px 20px;\n            border-radius: 12px;\n            box-shadow: 0 4px 15px rgba(52, 152, 219, 0.1), 0 2px 8px rgba(0, 0, 0, 0.05), inset 0 1px 0 rgba(255, 255, 255, 0.8);\n            border: 2px solid rgba(52, 152, 219, 0.15);\n            text-align: center;\n            cursor: pointer;\n            transition: all 0.4s cubic-bezier(0.25, 0.46, 0.45, 0.94);\n            min-width: 60px;\n            height: 46px;\n            display: inline-flex;\n            align-items: center;\n            justify-content: center;\n            font-weight: 700;\n            font-size: 15px;\n            color: #2c3e50;\n            position: relative;\n            overflow: hidden;\n            letter-spacing: 0.5px;\n        }\n\n        .episode::before {\n            content: '';\n            position: absolute;\n            top: 0;\n            left: -100%;\n            width: 100%;\n            height: 100%;\n            background: linear-gradient(90deg, transparent, rgba(52, 152, 219, 0.1), transparent);\n            transition: left 0.5s ease;\n        }\n\n        .episode:hover::before {\n            left: 100%;\n        }\n\n        .episode:hover {\n            background: linear-gradient(145deg, rgba(255, 255, 255, 1), rgba(248, 252, 255, 0.98));\n            transform: translateY(-3px) scale(1.05);\n            box-shadow: 0 8px 25px rgba(52, 152, 219, 0.2), 0 4px 15px rgba(0, 0, 0, 0.08), inset 0 1px 0 rgba(255, 255, 255, 0.9);\n            border-color: rgba(52, 152, 219, 0.35);\n            color: #1f618d;\n        }\n        \n        /* 触摸设备优化 */\n        @media (hover: none) and (pointer: coarse) {\n            .episode:active {\n                background: linear-gradient(145deg, rgba(52, 152, 219, 0.1), rgba(41, 128, 185, 0.08));\n                transform: scale(0.95);\n                transition: all 0.1s ease;\n            }\n            \n            .episode:hover {\n                transform: none;\n                background: linear-gradient(145deg, rgba(255, 255, 255, 0.98), rgba(248, 250, 252, 0.95));\n            }\n        }\n\n        .episode.active {\n            background: linear-gradient(145deg, #4CAF50, #45a049);\n            color: white;\n            border-color: #45a049;\n            box-shadow: 0 6px 20px rgba(76, 175, 80, 0.4), 0 3px 12px rgba(0, 0, 0, 0.15), inset 0 1px 0 rgba(255, 255, 255, 0.3);\n            transform: translateY(-2px) scale(1.02);\n            text-shadow: 0 1px 2px rgba(0, 0, 0, 0.2);\n        }\n\n        .episode.active:hover {\n            background: linear-gradient(145deg, #45a049, #3d8b40);\n            transform: translateY(-4px) scale(1.05);\n            box-shadow: 0 8px 25px rgba(76, 175, 80, 0.5), 0 4px 15px rgba(0, 0, 0, 0.2);\n        }\n\n        .episode.error {\n            background: linear-gradient(145deg, #f44336, #d32f2f);\n            color: white;\n            border-color: #d32f2f;\n            box-shadow: 0 6px 20px rgba(244, 67, 54, 0.4), 0 3px 12px rgba(0, 0, 0, 0.15), inset 0 1px 0 rgba(255, 255, 255, 0.3);\n            transform: translateY(-2px) scale(1.02);\n            text-shadow: 0 1px 2px rgba(0, 0, 0, 0.2);\n        }\n\n        .episode.error:hover {\n            background: linear-gradient(145deg, #d32f2f, #b71c1c);\n            transform: translateY(-4px) scale(1.05);\n            box-shadow: 0 8px 25px rgba(244, 67, 54, 0.5), 0 4px 15px rgba(0, 0, 0, 0.2);\n        }\n\n        .response-message {\n            text-align: center;\n            margin: 15px auto;\n            padding: 12px 20px;\n            border-radius: 12px;\n            display: none;\n            max-width: 500px;\n            font-weight: 500;\n            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.15);\n            backdrop-filter: blur(10px);\n        }\n\n        .success {\n            background: rgba(212, 237, 218, 0.95);\n            color: #155724;\n            border: 2px solid #27ae60;\n        }\n\n        .failure {\n            background: rgba(248, 215, 218, 0.95);\n            color: #721c24;\n            border: 2px solid #e74c3c;\n        }\n\n        /* 媒体查询，针对小屏幕设备（如手机） */\n        @media (max-width: 480px) {\n            body {\n                padding: 10px;\n            }\n\n            .episode-container {\n                gap: 8px;\n                justify-content: center;\n            }\n\n            .episode {\n                min-width: 45px;\n                height: 34px;\n                padding: 8px 12px;\n                font-size: 13px;\n                border-radius: 8px;\n            }\n            \n            .input-row {\n                flex-direction: row; /* 保持在同一行 */\n                align-items: center;\n                gap: 8px; /* 缩小间距 */\n                flex-wrap: nowrap; /* 不换行 */\n            }\n            \n            .user-input {\n                flex: 1; /* 让输入框占据可用空间 */\n                min-width: 0; /* 允许收缩 */\n            }\n            \n            .user-input input {\n                width: 100%; /* 占满容器 */\n                min-width: 0; /* 允许收缩 */\n            }\n            \n            .send-button {\n                flex-shrink: 0; /* 不收缩 */\n                width: auto; /* 自动宽度 */\n            }\n            \n            /* 优化移动端输入区域的整体间距 */\n            .input-container {\n                padding: 8px 0;\n            }\n            \n            .message-input {\n                margin-bottom: 8px;\n            }\n        }\n\n        /* 媒体查询，针对大屏幕设备 */\n        @media (min-width: 768px) {\n            .episode-container {\n                gap: 15px;\n                justify-content: flex-start;\n            }\n\n            .episode {\n                min-width: 55px;\n                height: 42px;\n                padding: 12px 18px;\n                font-size: 15px;\n            }\n        }\n\n        /* 超大屏幕优化 */\n        @media (min-width: 1200px) {\n            .episode-container {\n                gap: 18px;\n                max-width: 1000px;\n            }\n\n            .episode {\n                min-width: 60px;\n                height: 45px;\n                padding: 12px 20px;\n                font-size: 16px;\n            }\n        }\n        \n        /* 移除a标签下划线 */\n        a {\n            text-decoration: none;\n            transition: all 0.3s ease;\n            display: inline-block;\n        }\n        \n        /* 快速搜索按钮样式增强 */\n        a[href^=\"";
        }
        return null;
    }

    /* renamed from: ۣۨۤ۟, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.E0.d m9778(Object obj) {
        if (C0052.m8320() > 0) {
            return ((z) obj).e;
        }
        return null;
    }

    /* renamed from: ۣۤۡۡ, reason: not valid java name and contains not printable characters */
    public static void m9779(Object obj) {
        if (C0006.m1726() < 0) {
            com.github.catvod.spider.merge.A0.b.d(obj);
        }
    }

    /* renamed from: ۤۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Class m9780(Object obj) {
        if (C0012.m3024() >= 0) {
            return ((com.github.catvod.spider.merge.w0.i) obj).a;
        }
        return null;
    }

    /* renamed from: ۤۢۨۨ, reason: not valid java name and contains not printable characters */
    public static ArrayList m9781(Object obj) {
        if (C0049.m8038() < 0) {
            return ((C0148e) obj).c;
        }
        return null;
    }

    /* renamed from: ۤۥۢ۟, reason: not valid java name and contains not printable characters */
    public static void m9782(Object obj, int i) {
        if (C0045.m7538() <= 0) {
            ((ByteArrayOutputStream) obj).write(i);
        }
    }

    /* renamed from: ۤۦۨۡ, reason: not valid java name and contains not printable characters */
    public static String m9783() {
        if (C0049.m8038() < 0) {
            return "/proxy?do=settings', {\n            method: 'GET',\n            headers: {\n                'Content-Type': 'application/json'\n            }\n        }).then(response => {\n            if (!response.ok) throw new Error('请求失败');\n            return response.text();\n        }).then(data => {\n            console.log('设置请求成功:', data);\n        }).catch(error => {\n            console.error('设置请求失败:', error);\n        });\" style=\"position: absolute; right: 10px; transform: translateY(-50%);\n               background: none; border: none; cursor: pointer; font-size: 1.2em;\n               color: #667eea; transition: all 0.2s ease;\">\n        ⚙️\n    </button>\n    <i class=\"fas fa-tiger fa-2x\"></i>\n    <div class=\"title-group\">\n        <h1>🎬 小虎斑弹幕</h1>\n        <p class=\"subtitle\">全平台智能弹幕推送-推你想看</p>\n    </div>\n</div>\n<!-- 搜索区域 -->\n<div class=\"search-container\">\n    <!-- 搜索框 -->\n    <div class=\"search-wrapper\">\n        <input id=\"searchInput\" name=\"do=seachdanmu&amp;go=seach&amp;juming\" placeholder=\"输入剧名或关键词搜索\" required=\"\" tabindex=\"0\" type=\"text\" value=\"";
        }
        return null;
    }

    /* renamed from: ۥ۟ۧۦ, reason: contains not printable characters */
    public static h m9784() {
        if (C0012.m3024() > 0) {
            return com.github.catvod.spider.merge.P0.n.r;
        }
        return null;
    }

    /* renamed from: ۥ۠ۡۡ, reason: contains not printable characters */
    public static byte[] m9785() {
        if (C0036.m6252() > 0) {
            return com.github.catvod.spider.merge.d0.d.v;
        }
        return null;
    }

    /* renamed from: ۥۢۦۧ, reason: contains not printable characters */
    public static String m9786() {
        if (C0051.m8216() <= 0) {
            return "getJsonString()错误！-->";
        }
        return null;
    }

    /* renamed from: ۥۣۡۤ, reason: contains not printable characters */
    public static g1 m9787(Object obj) {
        if (C0024.m4693() <= 0) {
            return ((P) obj).c;
        }
        return null;
    }

    /* renamed from: ۥۦۥ۠, reason: contains not printable characters */
    public static int m9788(Object obj) {
        if (C0028.m5152() <= 0) {
            return ((com.github.catvod.spider.merge.T0.g) obj).d;
        }
        return 0;
    }

    /* renamed from: ۥۦۥۧ, reason: contains not printable characters */
    public static ScheduledExecutorService m9789(Object obj) {
        if (C0011.m2755() >= 0) {
            return ((C0233B) obj).j;
        }
        return null;
    }

    /* renamed from: ۥۧۢ۠, reason: contains not printable characters */
    public static String m9790(long j) {
        if (C0028.m5152() <= 0) {
            return Long.toHexString(j);
        }
        return null;
    }

    /* renamed from: ۥۣۨۤ, reason: contains not printable characters */
    public static boolean m9791(Object obj) {
        if (C0005.m1599() < 0) {
            return ((RunnableC0317F) obj).b;
        }
        return false;
    }

    /* renamed from: ۥۣۨۥ, reason: contains not printable characters */
    public static String m9792() {
        if (C0058.m9131() <= 0) {
            return "</span>\n   </div>\n   <div class=\"episode-grid\" id=\"episodeContainer\">";
        }
        return null;
    }

    /* renamed from: ۦ۠ۢ۟, reason: contains not printable characters */
    public static void m9793(Object obj) {
        if (C0005.m1599() <= 0) {
            ((C0281k) obj).clear();
        }
    }

    /* renamed from: ۦۣ۠۟, reason: contains not printable characters */
    public static JSONArray m9794(Object obj, Object obj2) {
        if (C0049.m8038() < 0) {
            return ((Youku) obj).d((HashMap) obj2);
        }
        return null;
    }

    /* renamed from: ۦ۠ۥۥ, reason: contains not printable characters */
    public static Charset m9795(Object obj) {
        if (C0046.m7701() > 0) {
            return ((com.github.catvod.spider.merge.T0.g) obj).b;
        }
        return null;
    }

    /* renamed from: ۦۤۦ۠, reason: contains not printable characters */
    public static int m9796(Object obj) {
        if (C0041.m6823() <= 0) {
            return ((e) obj).e;
        }
        return 0;
    }

    /* renamed from: ۦۧۨ۟, reason: contains not printable characters */
    public static Editable m9797(Object obj) {
        if (C0013.m3167() > 0) {
            return ((EditText) obj).getText();
        }
        return null;
    }

    /* renamed from: ۧ۟۠۟, reason: not valid java name and contains not printable characters */
    public static void m9798(Object obj) {
        if (C0049.m8038() < 0) {
            ((C0259u) obj).n();
        }
    }

    /* renamed from: ۣۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static FrameLayout m9799(Object obj) {
        if (C0059.m9257() <= 0) {
            return ((t) obj).f;
        }
        return null;
    }

    /* renamed from: ۧۥۢۥ, reason: not valid java name and contains not printable characters */
    public static Object m9800(Object obj, Object obj2) {
        if (C0009.m2047() > 0) {
            return ((Parcelable.Creator) obj).createFromParcel((Parcel) obj2);
        }
        return null;
    }

    /* renamed from: ۧۥۤۥ, reason: not valid java name and contains not printable characters */
    public static P123 m9801(Object obj) {
        if (C0015.m3433() >= 0) {
            return ((Cloud) obj).c;
        }
        return null;
    }

    /* renamed from: ۧۥۦۥ, reason: not valid java name and contains not printable characters */
    public static void m9802(Object obj) {
        if (C0031.m5628() > 0) {
            com.github.catvod.spider.merge.w0.g.e((NullPointerException) obj);
        }
    }

    /* renamed from: ۨۢۡۨ, reason: not valid java name and contains not printable characters */
    public static Method m9803(Object obj, Object obj2, Object obj3) {
        if (C0053.m8389() > 0) {
            return ((Class) obj).getMethod((String) obj2, (Class[]) obj3);
        }
        return null;
    }

    /* renamed from: ۨۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m9804(Object obj, Object obj2) {
        if (C0015.m3433() > 0) {
            return com.github.catvod.spider.merge.B0.a.j((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۨۦۧۤ, reason: not valid java name and contains not printable characters */
    public static HashMap m9805(Object obj) {
        if (C0018.m3956() > 0) {
            return ((AppYsV2) obj).a;
        }
        return null;
    }

    /* renamed from: ۨۨۦۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.l0.d m9806(Object obj) {
        if (C0001.m1164() <= 0) {
            return ((com.github.catvod.spider.merge.l0.m) obj).f;
        }
        return null;
    }

    /* renamed from: ۣۣۨۢ, reason: not valid java name and contains not printable characters */
    public static String m9775(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}