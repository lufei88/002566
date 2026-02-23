package com.github.catvod.spider.p000mergexbpq.j;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutManager;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.os.PersistableBundle;
import android.view.View;
import android.view.WindowInsets;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.FishHxq;
import com.github.catvod.spider.HBNT4;
import com.github.catvod.spider.HBcms10;
import com.github.catvod.spider.HBfling;
import com.github.catvod.spider.Hanime;
import com.github.catvod.spider.Notice;
import com.github.catvod.spider.XPath;
import com.github.catvod.spider.Xb6v;
import com.github.catvod.spider.Zxzj;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E0.o;
import com.github.catvod.spider.merge.F0.C0165w;
import com.github.catvod.spider.merge.F0.O;
import com.github.catvod.spider.merge.F0.T;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.K0.b;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.B;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.C0171c;
import com.github.catvod.spider.merge.P0.x;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.R.a;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.g;
import com.github.catvod.spider.merge.T0.r;
import com.github.catvod.spider.merge.U.h;
import com.github.catvod.spider.merge.U.k;
import com.github.catvod.spider.merge.U0.C0174a;
import com.github.catvod.spider.merge.U0.C0176b;
import com.github.catvod.spider.merge.U0.E;
import com.github.catvod.spider.merge.U0.L;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.DialogInterfaceOnClickListenerC0227c;
import com.github.catvod.spider.merge.W.p;
import com.github.catvod.spider.merge.W.t;
import com.github.catvod.spider.merge.W.w;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.M;
import com.github.catvod.spider.merge.a0.S;
import com.github.catvod.spider.merge.a0.U;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d0.d;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.e.C0271a;
import com.github.catvod.spider.merge.e.C0273c;
import com.github.catvod.spider.merge.e.C0277g;
import com.github.catvod.spider.merge.e0.C0288g;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f0.C0300c;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0335o;
import com.github.catvod.spider.merge.h0.RunnableC0337q;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.l0.e;
import com.github.catvod.spider.merge.l0.l;
import com.github.catvod.spider.merge.l0.m;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.Q.v;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.c0.c;
import com.github.catvod.spider.p000mergexbpq.d0.P;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.net.URL;
import java.nio.channels.Pipe;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* renamed from: com.github.catvod.spider.merge-xbpq.j.ۣ۟ۢ۟ۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0013 {

    /* renamed from: ۣ۟۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static int f357 = 237;

    /* renamed from: ۟۟ۥۢ۟, reason: not valid java name and contains not printable characters */
    public static XmlResourceParser m3078(Object obj, Object obj2, Object obj3) {
        if (C0027.m5017() >= 0) {
            return ((PackageItemInfo) obj).loadXmlMetaData((PackageManager) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟۟ۧۥۣ, reason: not valid java name and contains not printable characters */
    public static Double m3079(double d) {
        if (C0060.m9355() > 0) {
            return Double.valueOf(d);
        }
        return null;
    }

    /* renamed from: ۟۟ۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static WebView m3080(Object obj) {
        if (C0000.m1116() <= 0) {
            return p.d((Activity) obj);
        }
        return null;
    }

    /* renamed from: ۟۠۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static int m3081(Object obj) {
        if (C0035.m6140() < 0) {
            return ((g) obj).h;
        }
        return 0;
    }

    /* renamed from: ۟۠ۡۥۢ, reason: not valid java name and contains not printable characters */
    public static Pattern m3082(Object obj) {
        if (C0046.m7701() >= 0) {
            return ((a) obj).x;
        }
        return null;
    }

    /* renamed from: ۟۠ۢۤۤ, reason: not valid java name and contains not printable characters */
    public static void m3083(Object obj) {
        if (C0005.m1599() <= 0) {
            ((t) obj).g();
        }
    }

    /* renamed from: ۟۠ۢۨ۠, reason: not valid java name and contains not printable characters */
    public static ThreadPoolExecutor m3084(Object obj) {
        if (C0058.m9131() < 0) {
            return ((k) obj).c;
        }
        return null;
    }

    /* renamed from: ۟۠ۢۨۢ, reason: not valid java name and contains not printable characters */
    public static String m3085(Object obj) {
        if (C0036.m6252() >= 0) {
            return ((Class) obj).getName();
        }
        return null;
    }

    /* renamed from: ۟۠ۤۦۥ, reason: not valid java name and contains not printable characters */
    public static String m3086() {
        if (C0007.m1886() >= 0) {
            return "Cookie";
        }
        return null;
    }

    /* renamed from: ۟۠ۥۢۤ, reason: not valid java name and contains not printable characters */
    public static String m3087(Object obj, Object obj2, Object obj3, boolean z, Object obj4) {
        if (C0025.m4797() >= 0) {
            return ((XPath) obj).a((String) obj2, (String) obj3, z, (HashMap) obj4);
        }
        return null;
    }

    /* renamed from: ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static Object[] m3088(Object obj, Object obj2, int i) {
        if (C0039.m6529() < 0) {
            return ((C0271a) obj).k((Object[]) obj2, i);
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static String m3089() {
        if (C0023.m4566() < 0) {
            return "r";
        }
        return null;
    }

    /* renamed from: ۣ۟ۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static C0300c m3090(Object obj) {
        if (C0002.m1242() > 0) {
            return ((Notice) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۡۡۤۤ, reason: not valid java name and contains not printable characters */
    public static C0271a m3091(Object obj) {
        if (m3167() >= 0) {
            return ((C0277g) obj).e;
        }
        return null;
    }

    /* renamed from: ۟ۡۡۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3092(Object obj, Object obj2) {
        if (C0002.m1242() >= 0) {
            return ((C0273c) obj).remove(obj2);
        }
        return false;
    }

    /* renamed from: ۟ۡۢۡ, reason: not valid java name and contains not printable characters */
    public static int m3093(Object obj) {
        if (C0040.m6582() > 0) {
            return ((com.github.catvod.spider.merge.K0.a) obj).i;
        }
        return 0;
    }

    /* renamed from: ۟ۡۢۡۦ, reason: not valid java name and contains not printable characters */
    public static int m3094(Object obj, Object obj2) {
        if (C0004.m1557() <= 0) {
            return ((List) obj).indexOf(obj2);
        }
        return 0;
    }

    /* renamed from: ۟ۡۤۢۦ, reason: not valid java name and contains not printable characters */
    public static void m3095(Object obj, Object obj2, Object obj3) {
        if (C0062.m9429() > 0) {
            ((ShortcutManager) obj).disableShortcuts((List) obj2, (CharSequence) obj3);
        }
    }

    /* renamed from: ۟ۡۤۨۢ, reason: not valid java name and contains not printable characters */
    public static String[] m3096(Object obj) {
        if (C0035.m6140() < 0) {
            return ((HBcms10) obj).c;
        }
        return null;
    }

    /* renamed from: ۣ۟ۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static HashMap m3097() {
        if (C0023.m4566() <= 0) {
            return HBfling.a();
        }
        return null;
    }

    /* renamed from: ۟ۢۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3098(Object obj) {
        if (C0046.m7701() > 0) {
            return ((l) obj).c;
        }
        return false;
    }

    /* renamed from: ۣ۟ۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static ReentrantLock m3099(Object obj) {
        if (C0005.m1599() <= 0) {
            return ((d) obj).o;
        }
        return null;
    }

    /* renamed from: ۟ۢۤۡۦ, reason: not valid java name and contains not printable characters */
    public static String m3100(Object obj) {
        if (C0037.m6350() < 0) {
            return ((e) obj).k;
        }
        return null;
    }

    /* renamed from: ۟ۢۤۥۧ, reason: not valid java name and contains not printable characters */
    public static ScheduledExecutorService m3101(int i) {
        if (C0036.m6252() > 0) {
            return Executors.newScheduledThreadPool(i);
        }
        return null;
    }

    /* renamed from: ۟ۢۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m3102(Object obj, int i) {
        if (C0058.m9131() <= 0) {
            return S.e((List) obj, i);
        }
        return null;
    }

    /* renamed from: ۟ۢۨۡ۟, reason: not valid java name and contains not printable characters */
    public static int m3103(int i) {
        if (C0030.m5375() >= 0) {
            return com.github.catvod.spider.merge.g0.e.h(i);
        }
        return 0;
    }

    /* renamed from: ۣ۟۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.c0.l m3104(Object obj) {
        if (C0027.m5017() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.l) obj).P();
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static String m3105() {
        if (C0038.m6471() > 0) {
            return "[替换";
        }
        return null;
    }

    /* renamed from: ۣۣ۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m3107(Object obj, Object obj2) {
        if (C0001.m1164() < 0) {
            return ((c) obj).equals(obj2);
        }
        return false;
    }

    /* renamed from: ۣۣ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static B m3108(Object obj) {
        if (C0024.m4693() <= 0) {
            return ((C0171c) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۦ۟۠, reason: not valid java name and contains not printable characters */
    public static Iterator m3109(Object obj) {
        if (C0012.m3024() >= 0) {
            return ((List) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۧۦ, reason: not valid java name and contains not printable characters */
    public static int m3110(Object obj) {
        if (C0023.m4566() < 0) {
            return ((View) obj).getPaddingTop();
        }
        return 0;
    }

    /* renamed from: ۟ۤ۟۟, reason: not valid java name and contains not printable characters */
    public static String m3111(Object obj, Object obj2) {
        if (C0008.m1975() > 0) {
            return ((M) obj).o((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static int m3112(Object obj) {
        if (C0051.m8216() < 0) {
            return ((h) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣ۟ۤۦۣ, reason: not valid java name and contains not printable characters */
    public static String m3113() {
        if (C0032.m5686() <= 0) {
            return "{year}";
        }
        return null;
    }

    /* renamed from: ۟ۤۧۡ, reason: not valid java name and contains not printable characters */
    public static String m3114() {
        if (C0046.m7701() > 0) {
            return "全";
        }
        return null;
    }

    /* renamed from: ۟ۥ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static String m3115(Object obj) {
        if (C0009.m2047() >= 0) {
            return ((U) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۥۢۨ۟, reason: not valid java name and contains not printable characters */
    public static String m3116() {
        if (C0010.m2320() <= 0) {
            return "40";
        }
        return null;
    }

    /* renamed from: ۟ۥۣۦۡ, reason: not valid java name and contains not printable characters */
    public static r m3117(Object obj) {
        if (C0016.m3596() < 0) {
            return ((r) obj).n();
        }
        return null;
    }

    /* renamed from: ۟ۥۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m3118() {
        if (C0034.m6048() < 0) {
            return "\" tabindex=\"0\">\n        </div>\n        <button class=\"send-btn\" onclick=\"sendDanmu()\" tabindex=\"0\">发送弹幕</button>\n      `;\n      \n      // 添加到DOM\n      posterContent.appendChild(inputPanel);\n      \n      // 为文本框添加Enter发送事件\n      const messageInput = document.getElementById('messageInput');\n      messageInput.addEventListener('keypress', e => {\n        if (e.key === 'Enter' && !e.shiftKey) {\n          e.preventDefault();\n          sendDanmu();\n        }\n      });\n      \n      // 设置焦点到文本框\n      messageInput.focus();\n    }\n    \n    function sendDanmu() {\n      // 确保面板存在\n      if (!inputPanel) return;\n      \n      const username = document.getElementById('usernameInput').value.trim();\n      const message = document.getElementById('messageInput').value.trim();\n\n      if (!username) return showMessage('请输入昵称', 'failure');\n      if (!message) return showMessage('请输入弹幕内容', 'failure');\n\n      const url = `";
        }
        return null;
    }

    /* renamed from: ۟ۥۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static ServiceLoader m3119(Object obj, Object obj2) {
        if (C0061.m9359() <= 0) {
            return ServiceLoader.load((Class) obj, (ClassLoader) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۥۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m3120(Object obj) {
        if (C0012.m3024() > 0) {
            return ((WindowInsets) obj).consumeSystemWindowInsets();
        }
        return null;
    }

    /* renamed from: ۟ۦ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static Object m3121(Object obj, Object obj2) {
        if (C0033.m5872() >= 0) {
            return ((HashMap) obj).remove(obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۡ۠۟, reason: not valid java name and contains not printable characters */
    public static void m3122(Object obj) {
        if (C0058.m9131() < 0) {
            ((C0174a) obj).b();
        }
    }

    /* renamed from: ۟ۦۡۢۦ, reason: not valid java name and contains not printable characters */
    public static void m3123(Object obj, Object obj2, int i, Object obj3) {
        if (C0000.m1116() < 0) {
            ((com.github.catvod.spider.merge.K0.a) obj).e((byte[]) obj2, i, (b) obj3);
        }
    }

    /* renamed from: ۟ۦۣۦۧ, reason: not valid java name and contains not printable characters */
    public static int m3124(Object obj) {
        if (C0004.m1557() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.R.d) obj).b;
        }
        return 0;
    }

    /* renamed from: ۟ۦۣۧ۠, reason: not valid java name and contains not printable characters */
    public static void m3125(Object obj, Object obj2) {
        if (C0031.m5628() > 0) {
            ((com.github.catvod.spider.merge.F.c) obj).d((com.github.catvod.spider.merge.F.g) obj2);
        }
    }

    /* renamed from: ۟ۦۤۦۤ, reason: not valid java name and contains not printable characters */
    public static List m3126(Object obj) {
        if (C0024.m4693() < 0) {
            return com.github.catvod.spider.merge.G.c.a((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۦۤۦۦ, reason: not valid java name and contains not printable characters */
    public static void m3127(Object obj) {
        if (C0009.m2047() >= 0) {
            com.github.catvod.spider.p000mergexbpq.b.p.m1931((com.github.catvod.spider.p000mergexbpq.b.p) obj);
        }
    }

    /* renamed from: ۟ۦۨ۟۠, reason: not valid java name and contains not printable characters */
    public static v m3128(Object obj, int i) {
        if (C0022.m4497() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.Q.a) obj).b(i);
        }
        return null;
    }

    /* renamed from: ۣ۟ۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m3129(Object obj) {
        if (C0019.m4065() < 0) {
            return ((x) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۧۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m3130() {
        if (C0029.m5282() >= 0) {
            return ";;搜首页";
        }
        return null;
    }

    /* renamed from: ۣ۟ۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m3131() {
        if (C0012.m3024() >= 0) {
            return "验证错误-->";
        }
        return null;
    }

    /* renamed from: ۟ۧۦۣۢ, reason: not valid java name and contains not printable characters */
    public static String m3132(Object obj) {
        if (C0044.m7508() <= 0) {
            return ((a) obj).p0;
        }
        return null;
    }

    /* renamed from: ۟ۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static ShapeDrawable m3133(Object obj, int i, int i2) {
        if (C0026.m4977() <= 0) {
            return com.github.catvod.spider.merge.a1.l.b((Context) obj, i, i2);
        }
        return null;
    }

    /* renamed from: ۣ۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static String[] m3134() {
        if (C0043.m7332() > 0) {
            return E.n;
        }
        return null;
    }

    /* renamed from: ۠ۥۨۤ, reason: not valid java name and contains not printable characters */
    public static long m3135(Object obj) {
        if (C0052.m8320() > 0) {
            return ((File) obj).lastModified();
        }
        return 0L;
    }

    /* renamed from: ۡۡۧۧ, reason: not valid java name and contains not printable characters */
    public static AtomicBoolean m3136(Object obj) {
        if (C0004.m1557() < 0) {
            return ((k) obj).d;
        }
        return null;
    }

    /* renamed from: ۡۤۥۥ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m3137(Object obj) {
        if (C0062.m9429() > 0) {
            return ((C0335o) obj).j;
        }
        return null;
    }

    /* renamed from: ۡۥۡ۟, reason: not valid java name and contains not printable characters */
    public static String m3138() {
        if (C0054.m8557() < 0) {
            return "二次跳转播放链接";
        }
        return null;
    }

    /* renamed from: ۡۦۢ, reason: not valid java name and contains not printable characters */
    public static String m3139() {
        if (C0014.m3353() < 0) {
            return "director";
        }
        return null;
    }

    /* renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public static void m3140(Object obj) {
        if (C0059.m9257() <= 0) {
            ((C0233B) obj).v();
        }
    }

    /* renamed from: ۢ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static String m3141() {
        if (C0017.m3633() < 0) {
            return "desc";
        }
        return null;
    }

    /* renamed from: ۢ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static void m3142(Object obj) {
        if (C0000.m1116() <= 0) {
            ((DialogInterface) obj).dismiss();
        }
    }

    /* renamed from: ۣۢۢۡ, reason: not valid java name and contains not printable characters */
    public static int m3143(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۣۢۤ۟, reason: not valid java name and contains not printable characters */
    public static int m3144(Object obj) {
        if (C0017.m3633() <= 0) {
            return ((ByteArrayInputStream) obj).available();
        }
        return 0;
    }

    /* renamed from: ۢۦۤۢ, reason: not valid java name and contains not printable characters */
    public static AlertDialog m3145(Object obj) {
        if (C0008.m1975() >= 0) {
            return ((S) obj).b;
        }
        return null;
    }

    /* renamed from: ۢۨ, reason: not valid java name and contains not printable characters */
    public static String m3146(Object obj) {
        if (C0060.m9355() >= 0) {
            return com.github.catvod.spider.merge.W.v.f((String[]) obj);
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static Object m3147(Object obj) {
        if (C0049.m8038() <= 0) {
            return ((DialogInterfaceOnClickListenerC0227c) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static Logger m3148() {
        if (C0022.m4497() > 0) {
            return m.h;
        }
        return null;
    }

    /* renamed from: ۣ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static ArrayList m3149(Object obj) {
        if (C0054.m8557() < 0) {
            return ((C0174a) obj).i;
        }
        return null;
    }

    /* renamed from: ۣۣۡ۟, reason: not valid java name and contains not printable characters */
    public static Level m3150() {
        if (C0055.m8740() > 0) {
            return Level.WARNING;
        }
        return null;
    }

    /* renamed from: ۣۢۥۤ, reason: not valid java name and contains not printable characters */
    public static HashMap m3151() {
        if (m3167() > 0) {
            return Zxzj.a();
        }
        return null;
    }

    /* renamed from: ۣۢۨۨ, reason: not valid java name and contains not printable characters */
    public static Charset m3152() {
        if (C0051.m8216() < 0) {
            return C0035.m6095();
        }
        return null;
    }

    /* renamed from: ۣۣ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Typeface m3153(Object obj) {
        if (C0017.m3633() <= 0) {
            return ((TextView) obj).getTypeface();
        }
        return null;
    }

    /* renamed from: ۣۣۣ۟, reason: not valid java name and contains not printable characters */
    public static C0271a m3154(Object obj) {
        if (C0036.m6252() > 0) {
            return ((C0273c) obj).d;
        }
        return null;
    }

    /* renamed from: ۣۥۣۡ, reason: not valid java name and contains not printable characters */
    public static String m3155(String str) {
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

    /* renamed from: ۣۥۥۨ, reason: not valid java name and contains not printable characters */
    public static String m3156(Object obj, char c, char c2) {
        if (C0043.m7332() > 0) {
            return ((P) obj).a(c, c2);
        }
        return null;
    }

    /* renamed from: ۣۦۣ, reason: not valid java name and contains not printable characters */
    public static int m3157(Object obj) {
        if (C0043.m7332() >= 0) {
            return ((T) obj).b;
        }
        return 0;
    }

    /* renamed from: ۣۦۣ۟, reason: not valid java name and contains not printable characters */
    public static WebView m3158(Object obj) {
        if (C0062.m9429() > 0) {
            return ((C0288g) obj).e;
        }
        return null;
    }

    /* renamed from: ۣۧۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3159(Object obj) {
        if (C0008.m1975() > 0) {
            return ((com.github.catvod.spider.merge.F.e) obj).f();
        }
        return false;
    }

    /* renamed from: ۤ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m3160(int i, int i2) {
        if (C0057.m9017() >= 0) {
            return com.github.catvod.spider.p000mergexbpq.N.a.o(i, i2);
        }
        return 0;
    }

    /* renamed from: ۤ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static HashMap m3161(Object obj) {
        if (C0057.m9017() > 0) {
            return ((M) obj).f();
        }
        return null;
    }

    /* renamed from: ۤۡۡ۟, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.E0.p m3162(Object obj) {
        if (C0028.m5152() <= 0) {
            return ((o) obj).g;
        }
        return null;
    }

    /* renamed from: ۣۤۡۡ, reason: not valid java name and contains not printable characters */
    public static r m3163(Object obj) {
        if (C0020.m4210() <= 0) {
            return ((r) obj).w();
        }
        return null;
    }

    /* renamed from: ۣۤۦۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.E0.p m3164(Object obj, Object obj2) {
        if (C0048.m7971() >= 0) {
            return ((com.github.catvod.spider.merge.E0.p) obj).e((Class) obj2);
        }
        return null;
    }

    /* renamed from: ۤۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.E.d m3165(Object obj, Object obj2, Object obj3) {
        if (C0004.m1557() < 0) {
            return Hanime.a((String) obj, (String) obj2, (ArrayList) obj3);
        }
        return null;
    }

    /* renamed from: ۥۣۡۥ, reason: contains not printable characters */
    public static String m3166(Object obj) {
        if (C0001.m1164() <= 0) {
            return ((HBNT4) obj).a;
        }
        return null;
    }

    /* renamed from: ۥۣۥ۟, reason: contains not printable characters */
    public static int m3167() {
        return (-532) ^ C0017.f382;
    }

    /* renamed from: ۥۣۤۨ, reason: contains not printable characters */
    public static String m3168() {
        if (C0037.m6350() <= 0) {
            return "Coding_format";
        }
        return null;
    }

    /* renamed from: ۥۧ۟ۧ, reason: contains not printable characters */
    public static boolean m3169(Object obj) {
        if (C0020.m4210() < 0) {
            return ((WeakHashMap) obj).isEmpty();
        }
        return false;
    }

    /* renamed from: ۥۣۧ۠, reason: contains not printable characters */
    public static Object m3170(Object obj) {
        if (C0060.m9355() >= 0) {
            return ((com.github.catvod.spider.merge.H0.h) obj).b;
        }
        return null;
    }

    /* renamed from: ۥۨ۟ۦ, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.T0.m m3171(Object obj, Object obj2) {
        if (C0006.m1726() <= 0) {
            return ((C0176b) obj).u((L) obj2);
        }
        return null;
    }

    /* renamed from: ۦۣ۠ۦ, reason: contains not printable characters */
    public static Object m3172(Object obj, Object obj2, Object obj3) {
        if (C0028.m5152() < 0) {
            return ((IdentityHashMap) obj).put(obj2, obj3);
        }
        return null;
    }

    /* renamed from: ۦۢ۟ۥ, reason: contains not printable characters */
    public static Icon m3173(Object obj) {
        if (C0034.m6048() < 0) {
            return Icon.createWithContentUri((Uri) obj);
        }
        return null;
    }

    /* renamed from: ۦۦۥ, reason: contains not printable characters */
    public static void m3174(Object obj, int i) {
        if (C0039.m6529() <= 0) {
            ((TextView) obj).setMinHeight(i);
        }
    }

    /* renamed from: ۦۦۥۡ, reason: contains not printable characters */
    public static int m3175(Object obj, Object obj2) {
        if (C0011.m2755() > 0) {
            return ((PersistableBundle) obj).getInt((String) obj2);
        }
        return 0;
    }

    /* renamed from: ۦۦۧۦ, reason: contains not printable characters */
    public static String m3176(Object obj) {
        if (C0034.m6048() < 0) {
            return ((a) obj).h0;
        }
        return null;
    }

    /* renamed from: ۦۧۧۦ, reason: contains not printable characters */
    public static int m3177(Object obj) {
        if (C0037.m6350() < 0) {
            return ((O) obj).b;
        }
        return 0;
    }

    /* renamed from: ۦۧۨۤ, reason: contains not printable characters */
    public static String m3178(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0000.m1116() < 0) {
            return FishHxq.s((String) obj, (String) obj2, (String) obj3, (String) obj4);
        }
        return null;
    }

    /* renamed from: ۦۨۦ, reason: contains not printable characters */
    public static FrameLayout.LayoutParams m3179(Object obj) {
        if (C0043.m7332() >= 0) {
            return ((w) obj).i;
        }
        return null;
    }

    /* renamed from: ۧ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static int m3180(Object obj) {
        if (m3167() > 0) {
            return ((RunnableC0337q) obj).a;
        }
        return 0;
    }

    /* renamed from: ۧۡۧ, reason: not valid java name and contains not printable characters */
    public static String m3181(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0052.m8320() > 0) {
            return ((Xb6v) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۧۦ۟, reason: not valid java name and contains not printable characters */
    public static int m3182(Object obj) {
        if (C0040.m6582() >= 0) {
            return ((URL) obj).getPort();
        }
        return 0;
    }

    /* renamed from: ۣۨۨۢ, reason: not valid java name and contains not printable characters */
    public static int m3183(Object obj) {
        if (C0061.m9359() < 0) {
            return ((C0165w) obj).b;
        }
        return 0;
    }

    /* renamed from: ۨۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Uri.Builder m3184(Object obj) {
        if (C0043.m7332() >= 0) {
            return ((Uri) obj).buildUpon();
        }
        return null;
    }

    /* renamed from: ۣۨۤ۟, reason: not valid java name and contains not printable characters */
    public static Pipe.SourceChannel m3185(Object obj) {
        if (C0005.m1599() < 0) {
            return ((Pipe) obj).source();
        }
        return null;
    }

    /* renamed from: ۨۦۨۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m3186(Object obj) {
        if (C0042.m7147() < 0) {
            return ((C0176b) obj).q;
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۧۡ, reason: not valid java name and contains not printable characters */
    public static String m3106(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}