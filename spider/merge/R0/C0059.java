package com.github.catvod.spider.merge.r0;

import android.app.Activity;
import android.content.pm.ShortcutManager;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.UrlQuerySanitizer;
import android.util.Range;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Switch;
import android.widget.TextView;
import com.github.catvod.spider.HBAppfox;
import com.github.catvod.spider.Local;
import com.github.catvod.spider.NG;
import com.github.catvod.spider.XPathMac;
import com.github.catvod.spider.Youku;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.H0.e;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.C0170b;
import com.github.catvod.spider.merge.P0.C0172d;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.T0.r;
import com.github.catvod.spider.merge.U.n;
import com.github.catvod.spider.merge.U0.B;
import com.github.catvod.spider.merge.U0.C0174a;
import com.github.catvod.spider.merge.U0.C0200n;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.h;
import com.github.catvod.spider.merge.W.s;
import com.github.catvod.spider.merge.W.v;
import com.github.catvod.spider.merge.X0.A;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.C0246g;
import com.github.catvod.spider.merge.a0.J;
import com.github.catvod.spider.merge.a0.RunnableC0234C;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.b0.o;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.C0276f;
import com.github.catvod.spider.merge.e1.d;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f.C0293d;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f0.C0304g;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h0.C0315D;
import com.github.catvod.spider.merge.h0.C0340u;
import com.github.catvod.spider.merge.h0.DialogInterfaceOnClickListenerC0319H;
import com.github.catvod.spider.merge.h0.ViewOnClickListenerC0330j;
import com.github.catvod.spider.merge.h0.ViewOnFocusChangeListenerC0326f;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.P.f;
import com.github.catvod.spider.p000mergexbpq.P.j;
import com.github.catvod.spider.p000mergexbpq.P.w;
import com.github.catvod.spider.p000mergexbpq.P.x;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b.p;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c.g;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.r0.ۣ۟ۡۧۤ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0059 {

    /* renamed from: ۣ۟ۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int f855 = 840;

    /* renamed from: ۟۟۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static AtomicReferenceFieldUpdater m9177(Object obj) {
        if (m9257() <= 0) {
            return ((C0293d) obj).d;
        }
        return null;
    }

    /* renamed from: ۟۟ۢۤۡ, reason: not valid java name and contains not printable characters */
    public static int m9178(Object obj, Object obj2) {
        if (C0055.m8740() > 0) {
            return ((String) obj).indexOf((String) obj2);
        }
        return 0;
    }

    /* renamed from: ۟۟ۢۥۢ, reason: not valid java name and contains not printable characters */
    public static void m9179(Object obj, Object obj2) {
        if (C0038.m6471() > 0) {
            ((AccessibilityNodeInfo) obj).setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) obj2);
        }
    }

    /* renamed from: ۟۟ۢۧۤ, reason: not valid java name and contains not printable characters */
    public static void m9180(Object obj) {
        if (C0032.m5686() < 0) {
            ((A) obj).B();
        }
    }

    /* renamed from: ۣ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static float m9181(Object obj) {
        if (C0025.m4797() > 0) {
            return ((TextView) obj).getLineSpacingExtra();
        }
        return 0.0f;
    }

    /* renamed from: ۣ۟۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static String m9182() {
        if (C0016.m3596() < 0) {
            return m.i;
        }
        return null;
    }

    /* renamed from: ۟۠ۧۢۥ, reason: not valid java name and contains not printable characters */
    public static double m9183(Object obj, Object obj2) {
        if (C0053.m8389() > 0) {
            return ((JSONObject) obj).getDouble((String) obj2);
        }
        return 0.0d;
    }

    /* renamed from: ۟ۡ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static String m9184(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0039.m6529() < 0) {
            return ((C0233B) obj).t((String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* renamed from: ۟ۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m9185(Object obj, Object obj2) {
        if (C0012.m3024() >= 0) {
            ((w) obj).m((x) obj2);
        }
    }

    /* renamed from: ۣ۟ۡۧ۠, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.g1.c m9186() {
        if (C0058.m9131() < 0) {
            return d.e;
        }
        return null;
    }

    /* renamed from: ۟ۡۧۧ۠, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.e1.a m9187(Object obj) {
        if (C0044.m7508() < 0) {
            return ((com.github.catvod.spider.merge.g1.c) obj).a();
        }
        return null;
    }

    /* renamed from: ۟ۢ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static void m9188(Object obj, Object obj2) {
        if (C0006.m1726() <= 0) {
            ((ShortcutManager) obj).removeDynamicShortcuts((List) obj2);
        }
    }

    /* renamed from: ۟ۢۡۥۡ, reason: not valid java name and contains not printable characters */
    public static int m9189(Object obj) {
        if (m9257() <= 0) {
            return ((C0174a) obj).e;
        }
        return 0;
    }

    /* renamed from: ۟ۢۤۢ۟, reason: not valid java name and contains not printable characters */
    public static int m9190(Object obj) {
        if (C0008.m1975() >= 0) {
            return ((C0172d) obj).b;
        }
        return 0;
    }

    /* renamed from: ۟ۢۥۡ۟, reason: not valid java name and contains not printable characters */
    public static String m9191(Object obj) {
        if (C0027.m5017() > 0) {
            return v.i((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۢۦۤۡ, reason: not valid java name and contains not printable characters */
    public static int m9192(Object obj) {
        if (C0032.m5686() < 0) {
            return ((C0315D) obj).e;
        }
        return 0;
    }

    /* renamed from: ۣ۟ۢۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9193(Object obj) {
        if (C0024.m4693() < 0) {
            return ((NetworkInterface) obj).isLoopback();
        }
        return false;
    }

    /* renamed from: ۣ۟۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static String m9194() {
        if (C0052.m8320() > 0) {
            return "调试->播放链接跳转未成功";
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static List m9195(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0012.m3024() >= 0) {
            return com.github.catvod.spider.merge.B0.a.u(obj, (ArrayList) obj2, obj3, (ArrayList) obj4);
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۢۧ, reason: not valid java name and contains not printable characters */
    public static StringBuffer m9196(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((com.github.catvod.spider.merge.N0.a) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static List m9197(Object obj) {
        if (C0045.m7538() <= 0) {
            return ((ShortcutManager) obj).getDynamicShortcuts();
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۧۥ, reason: not valid java name and contains not printable characters */
    public static Switch m9198(Object obj) {
        if (C0050.m8121() < 0) {
            return ((DialogInterfaceOnClickListenerC0319H) obj).c;
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۧ۠, reason: not valid java name and contains not printable characters */
    public static Range m9199(Object obj, Object obj2) {
        if (C0035.m6140() < 0) {
            return ((Range) obj).extend((Range) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۦۦ۠, reason: not valid java name and contains not printable characters */
    public static void m9200(Object obj, Object obj2) {
        if (C0035.m6140() <= 0) {
            ((g) obj).b((String) obj2);
        }
    }

    /* renamed from: ۟ۤ۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static String m9201() {
        if (C0055.m8740() >= 0) {
            return "调试->playerContent线程睡眠错：";
        }
        return null;
    }

    /* renamed from: ۟ۤۢۨۡ, reason: not valid java name and contains not printable characters */
    public static String m9202(Object obj) {
        if (C0009.m2047() >= 0) {
            return ((C0233B) obj).i();
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۤۡ, reason: not valid java name and contains not printable characters */
    public static double m9203(double d) {
        if (C0032.m5686() < 0) {
            return Math.log(d);
        }
        return 0.0d;
    }

    /* renamed from: ۟ۤۥ۠, reason: not valid java name and contains not printable characters */
    public static String m9204(Object obj) {
        if (C0003.m1463() < 0) {
            return ((C0233B) obj).q;
        }
        return null;
    }

    /* renamed from: ۟ۤۥۤۨ, reason: not valid java name and contains not printable characters */
    public static double m9205(Object obj) {
        if (C0045.m7538() <= 0) {
            return Double.parseDouble((String) obj);
        }
        return 0.0d;
    }

    /* renamed from: ۟ۤۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m9206(Object obj) {
        if (C0030.m5375() > 0) {
            return ((com.github.catvod.spider.merge.L.c) obj).b();
        }
        return null;
    }

    /* renamed from: ۟ۤۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9207(Object obj) {
        if (C0035.m6140() < 0) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).isSelected();
        }
        return false;
    }

    /* renamed from: ۟ۥۣ۟۠, reason: not valid java name and contains not printable characters */
    public static String m9208() {
        if (C0014.m3353() < 0) {
            return s.b;
        }
        return null;
    }

    /* renamed from: ۟ۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static e m9209(int i, int i2) {
        if (C0050.m8121() < 0) {
            return e.a(i, i2);
        }
        return null;
    }

    /* renamed from: ۟ۥ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m9210(Object obj, int i) {
        if (C0045.m7538() < 0) {
            return Arrays.copyOf((byte[]) obj, i);
        }
        return null;
    }

    /* renamed from: ۟ۥۢۤ, reason: not valid java name and contains not printable characters */
    public static String m9211(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((h) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۥۥۣۤ, reason: not valid java name and contains not printable characters */
    public static String m9212() {
        if (C0025.m4797() > 0) {
            return "筛选排序名称";
        }
        return null;
    }

    /* renamed from: ۟ۥۥۣۧ, reason: not valid java name and contains not printable characters */
    public static ExecutorService m9213(Object obj) {
        if (C0018.m3956() > 0) {
            return ((Youku) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۦ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m9214() {
        if (C0045.m7538() <= 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
        }
        return null;
    }

    /* renamed from: ۟ۦۣۣۨ, reason: not valid java name and contains not printable characters */
    public static void m9215(Object obj, boolean z) throws SocketException {
        if (C0038.m6471() >= 0) {
            ((ServerSocket) obj).setReuseAddress(z);
        }
    }

    /* renamed from: ۟ۦۤۢۡ, reason: not valid java name and contains not printable characters */
    public static void m9216(Object obj, int i) {
        if (C0058.m9131() < 0) {
            ((C0276f) obj).c(i);
        }
    }

    /* renamed from: ۟ۦۥۤۦ, reason: not valid java name and contains not printable characters */
    public static int m9217(Object obj) {
        if (m9257() < 0) {
            return ((WindowInsets) obj).getStableInsetLeft();
        }
        return 0;
    }

    /* renamed from: ۟ۦۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m9218(Object obj) {
        if (C0047.m7837() > 0) {
            return ((J) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۦۦۡۦ, reason: not valid java name and contains not printable characters */
    public static int m9219(Object obj) {
        if (C0052.m8320() > 0) {
            return ((com.github.catvod.spider.merge.E0.h) obj).e;
        }
        return 0;
    }

    /* renamed from: ۟ۧ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.Z.c m9220() {
        if (C0039.m6529() <= 0) {
            return com.github.catvod.spider.merge.Z.b.a;
        }
        return null;
    }

    /* renamed from: ۟ۧ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static Object m9221(Object obj) {
        if (C0052.m8320() > 0) {
            return ((NG.Rst) obj).getData();
        }
        return null;
    }

    /* renamed from: ۟ۧ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static TextView m9222(Object obj, Object obj2) {
        if (C0017.m3633() < 0) {
            return C0304g.b((Activity) obj, (View) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۧۤۦۢ, reason: not valid java name and contains not printable characters */
    public static String m9224(String str) {
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

    /* renamed from: ۟ۧۥۦۣ, reason: not valid java name and contains not printable characters */
    public static List m9225(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((r) obj).j();
        }
        return null;
    }

    /* renamed from: ۟ۧۦۥ, reason: not valid java name and contains not printable characters */
    public static String m9226() {
        if (C0004.m1557() <= 0) {
            return "/;;搜首页";
        }
        return null;
    }

    /* renamed from: ۣ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m9227(Object obj) {
        if (C0056.m8886() <= 0) {
            return ((com.github.catvod.spider.merge.l0.e) obj).l;
        }
        return null;
    }

    /* renamed from: ۠۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static C0246g m9228(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((RunnableC0234C) obj).b;
        }
        return null;
    }

    /* renamed from: ۠ۢۢ۟, reason: not valid java name and contains not printable characters */
    public static String m9229() {
        if (C0042.m7147() <= 0) {
            return "调试->点击播放弹窗出错：";
        }
        return null;
    }

    /* renamed from: ۠ۧ۟۠, reason: not valid java name and contains not printable characters */
    public static j m9230(Object obj) {
        if (C0060.m9355() > 0) {
            return j.k((f) obj);
        }
        return null;
    }

    /* renamed from: ۡ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static int m9231(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۡ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static String m9232() {
        if (C0028.m5152() <= 0) {
            return com.github.catvod.spider.merge.J0.a.a;
        }
        return null;
    }

    /* renamed from: ۣۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.c0.c m9233(Object obj) {
        if (C0044.m7508() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.r) obj).d();
        }
        return null;
    }

    /* renamed from: ۣۡۦۤ, reason: not valid java name and contains not printable characters */
    public static int m9234(Object obj) {
        if (C0011.m2755() >= 0) {
            return Array.getLength(obj);
        }
        return 0;
    }

    /* renamed from: ۡۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m9235(Object obj, Object obj2) {
        if (C0018.m3956() > 0) {
            ((com.github.catvod.spider.merge.O.a) obj).b((com.github.catvod.spider.merge.O.c) obj2);
        }
    }

    /* renamed from: ۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m9236(Object obj) {
        if (C0036.m6252() >= 0) {
            return ((o) obj).a;
        }
        return 0;
    }

    /* renamed from: ۢۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m9237(Object obj, float f) {
        if (C0013.m3167() >= 0) {
            ((Paint) obj).setStrokeWidth(f);
        }
    }

    /* renamed from: ۣۢۡۤ, reason: not valid java name and contains not printable characters */
    public static int m9238(int i, int i2) {
        if (C0005.m1599() < 0) {
            return com.github.catvod.spider.merge.Z0.b.b(i, i2);
        }
        return 0;
    }

    /* renamed from: ۣۡۤ۠, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.E.m m9239(Object obj) {
        if (C0019.m4065() < 0) {
            return ((com.github.catvod.spider.merge.M.b) obj).d();
        }
        return null;
    }

    /* renamed from: ۣۣۡۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.E.m m9240(Object obj, Object obj2) {
        if (C0039.m6529() < 0) {
            return Local.b((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۣۣۣ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.E.j m9241(Object obj) {
        if (C0044.m7508() <= 0) {
            return C0233B.j((String) obj);
        }
        return null;
    }

    /* renamed from: ۣۣۦ, reason: not valid java name and contains not printable characters */
    public static String m9242() {
        if (C0041.m6823() < 0) {
            return "m0";
        }
        return null;
    }

    /* renamed from: ۣۦ۟۟, reason: not valid java name and contains not printable characters */
    public static String m9243(Object obj) {
        if (C0041.m6823() <= 0) {
            return ((ViewOnClickListenerC0330j) obj).b;
        }
        return null;
    }

    /* renamed from: ۤ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static String m9244() {
        if (C0026.m4977() < 0) {
            return "btwaf=";
        }
        return null;
    }

    /* renamed from: ۣۤۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9245(int i) {
        if (C0019.m4065() <= 0) {
            return com.github.catvod.spider.merge.S0.b.e(i);
        }
        return false;
    }

    /* renamed from: ۤۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m9246(Object obj, Object obj2) {
        if (C0003.m1463() <= 0) {
            ((p) obj).K((String) obj2);
        }
    }

    /* renamed from: ۥ۠ۦۡ, reason: contains not printable characters */
    public static Map m9247(Object obj) {
        if (C0056.m8886() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.d.c) obj).d();
        }
        return null;
    }

    /* renamed from: ۥۡ۠ۥ, reason: contains not printable characters */
    public static String m9248(Object obj, Object obj2, Object obj3) {
        if (C0007.m1886() >= 0) {
            return ((n) obj).f((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۥۣۡۥ, reason: contains not printable characters */
    public static String m9249(Object obj) {
        if (C0056.m8886() < 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).a0;
        }
        return null;
    }

    /* renamed from: ۥۢ۠ۥ, reason: contains not printable characters */
    public static String m9250(Object obj) {
        if (C0046.m7701() >= 0) {
            return C0233B.h((String) obj);
        }
        return null;
    }

    /* renamed from: ۥۢۢۡ, reason: contains not printable characters */
    public static Drawable m9251(Object obj) {
        if (C0051.m8216() <= 0) {
            return ((View) obj).getBackground();
        }
        return null;
    }

    /* renamed from: ۥۣۦۢ, reason: contains not printable characters */
    public static String m9252() {
        if (C0015.m3433() >= 0) {
            return "        <div class=\"source-title\" style=\"background: linear-gradient(135deg, rgba(52, 152, 219, 0.1), rgba(41, 128, 185, 0.08)); border: 2px solid rgba(52, 152, 219, 0.15); border-radius: 12px; padding: 12px 20px; margin-bottom: 20px; text-align: center; font-weight: 700; color: #2c3e50; position: relative; overflow: hidden;\">\n            <span style=\"position: relative; z-index: 2;\">🎬 ";
        }
        return null;
    }

    /* renamed from: ۥۨۤۤ, reason: contains not printable characters */
    public static ConcurrentHashMap m9253(Object obj) {
        if (C0033.m5872() >= 0) {
            return ((C0170b) obj).a;
        }
        return null;
    }

    /* renamed from: ۥۨۥۢ, reason: contains not printable characters */
    public static boolean m9254(Object obj) {
        if (C0022.m4497() >= 0) {
            return ((com.github.catvod.spider.merge.g1.d) obj).i();
        }
        return false;
    }

    /* renamed from: ۦ۠ۡۢ, reason: contains not printable characters */
    public static C0200n m9255() {
        if (C0032.m5686() <= 0) {
            return B.t;
        }
        return null;
    }

    /* renamed from: ۦۣۧۢ, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.P0.h m9256() {
        if (C0012.m3024() >= 0) {
            return com.github.catvod.spider.merge.P0.n.n;
        }
        return null;
    }

    /* renamed from: ۦۥۢۦ, reason: contains not printable characters */
    public static int m9257() {
        return 441 ^ C0048.f769;
    }

    /* renamed from: ۦۣۧۨ, reason: contains not printable characters */
    public static String m9258() {
        if (C0016.m3596() < 0) {
            return "nbxiaohuban";
        }
        return null;
    }

    /* renamed from: ۧۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Pattern m9259(Object obj) {
        if (C0063.m9589() <= 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).M;
        }
        return null;
    }

    /* renamed from: ۧۢۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9260(Object obj) {
        if (C0037.m6350() < 0) {
            return com.github.catvod.spider.merge.l0.m.f((com.github.catvod.spider.merge.l0.j) obj);
        }
        return false;
    }

    /* renamed from: ۧۥ۟۠, reason: not valid java name and contains not printable characters */
    public static String m9261(Object obj, Object obj2) {
        if (C0006.m1726() <= 0) {
            return ((UrlQuerySanitizer) obj).getValue((String) obj2);
        }
        return null;
    }

    /* renamed from: ۧۧۡۡ, reason: not valid java name and contains not printable characters */
    public static GradientDrawable m9262(Object obj) {
        if (C0008.m1975() > 0) {
            return ((ViewOnFocusChangeListenerC0326f) obj).d;
        }
        return null;
    }

    /* renamed from: ۨۡۥ۠, reason: not valid java name and contains not printable characters */
    public static void m9263(Object obj) {
        if (C0025.m4797() >= 0) {
            ((C0340u) obj).b();
        }
    }

    /* renamed from: ۨۤۢ, reason: not valid java name and contains not printable characters */
    public static String m9264(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0053.m8389() > 0) {
            return ((HBAppfox) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣۣۨۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.h.d m9265(Object obj, Object obj2, Object obj3) {
        if (C0033.m5872() > 0) {
            return com.github.catvod.spider.p000mergexbpq.h.b.f((String) obj, (String) obj2, (Map) obj3);
        }
        return null;
    }

    /* renamed from: ۨۦۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9266(Object obj) {
        if (C0039.m6529() < 0) {
            return ((XPathMac) obj).d;
        }
        return false;
    }

    /* renamed from: ۨۨۢ۟, reason: not valid java name and contains not printable characters */
    public static Object m9267(Object obj, long j, Object obj2) {
        if (C0058.m9131() <= 0) {
            return ((Future) obj).get(j, (TimeUnit) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۧۤۥۣ, reason: not valid java name and contains not printable characters */
    public static String m9223(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}