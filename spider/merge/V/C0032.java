package com.github.catvod.spider.merge.V;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.github.catvod.spider.ChangZhang;
import com.github.catvod.spider.HBQG;
import com.github.catvod.spider.HBmoou;
import com.github.catvod.spider.HBtdou;
import com.github.catvod.spider.HBtiantian;
import com.github.catvod.spider.MYzhiqiu;
import com.github.catvod.spider.Mogg;
import com.github.catvod.spider.NG;
import com.github.catvod.spider.XPath;
import com.github.catvod.spider.merge.B.l;
import com.github.catvod.spider.merge.E.j;
import com.github.catvod.spider.merge.E0.k;
import com.github.catvod.spider.merge.E0.o;
import com.github.catvod.spider.merge.E0.q;
import com.github.catvod.spider.merge.F.e;
import com.github.catvod.spider.merge.F.n;
import com.github.catvod.spider.merge.F0.AbstractC0151h;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0144a;
import com.github.catvod.spider.merge.F0.C0147d;
import com.github.catvod.spider.merge.F0.InterfaceC0167y;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.H0.d;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.U.g;
import com.github.catvod.spider.merge.W.B;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.X0.A;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0232A;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.C0259u;
import com.github.catvod.spider.merge.a0.DialogInterfaceOnDismissListenerC0243d;
import com.github.catvod.spider.merge.a0.W;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e0.AbstractC0287f;
import com.github.catvod.spider.merge.e0.C0288g;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.C0306a;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.AbstractC0324d;
import com.github.catvod.spider.merge.h0.N;
import com.github.catvod.spider.merge.h0.O;
import com.github.catvod.spider.merge.h0.x;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.k0.C0350a;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.Q.S;
import com.github.catvod.spider.p000mergexbpq.Q.f;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.S.i;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b.p;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.u;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.e0.C0120c;
import com.github.catvod.spider.p000mergexbpq.e0.C0124g;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.whl.quickjs.wrapper.QuickJSContext;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.NetworkInterface;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: com.github.catvod.spider.merge.V.۟ۤۤۨۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0032 {

    /* renamed from: ۢ۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static int f630 = 287;

    /* renamed from: ۣ۟۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m5670() {
        if (C0013.m3167() >= 0) {
            return "\"url\"*\"&&\",";
        }
        return null;
    }

    /* renamed from: ۣ۟۟۠۠, reason: not valid java name and contains not printable characters */
    public static String m5671(Object obj) {
        if (C0036.m6252() >= 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).l0;
        }
        return null;
    }

    /* renamed from: ۟۟ۤۥ۠, reason: not valid java name and contains not printable characters */
    public static WebView m5672(Object obj) {
        if (C0021.m4379() > 0) {
            return AbstractC0287f.b((Activity) obj);
        }
        return null;
    }

    /* renamed from: ۟۟ۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m5673() {
        if (C0026.m4977() <= 0) {
            return B.b;
        }
        return null;
    }

    /* renamed from: ۟۟ۧۤۦ, reason: not valid java name and contains not printable characters */
    public static int m5674(Object obj) {
        if (C0054.m8557() < 0) {
            return ((TimeZone) obj).getDSTSavings();
        }
        return 0;
    }

    /* renamed from: ۟۟ۨۦۨ, reason: not valid java name and contains not printable characters */
    public static int m5675(Object obj) {
        if (C0064.m9659() <= 0) {
            return ((Parcel) obj).dataPosition();
        }
        return 0;
    }

    /* renamed from: ۟۠۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static double m5676(Object obj) {
        if (C0006.m1726() <= 0) {
            return ((Double) obj).doubleValue();
        }
        return 0.0d;
    }

    /* renamed from: ۟۠۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static void m5677(Object obj, Object obj2) {
        if (C0022.m4497() > 0) {
            ((C0233B) obj).p((String) obj2);
        }
    }

    /* renamed from: ۟۠ۡۡ۟, reason: not valid java name and contains not printable characters */
    public static String m5678() {
        if (C0062.m9429() > 0) {
            return "筛选类型名称";
        }
        return null;
    }

    /* renamed from: ۟۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static String m5679() {
        if (C0009.m2047() > 0) {
            return "筛选年份名称";
        }
        return null;
    }

    /* renamed from: ۟ۡ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static void m5680(Object obj, Object obj2) {
        if (C0006.m1726() < 0) {
            ((Context) obj).startActivity((Intent) obj2);
        }
    }

    /* renamed from: ۟ۡ۠۟۟, reason: not valid java name and contains not printable characters */
    public static String m5681() {
        if (C0054.m8557() < 0) {
            return HBtiantian.b();
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۢ۟, reason: not valid java name and contains not printable characters */
    public static List m5682(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        if (C0049.m8038() <= 0) {
            return ((C0232A) obj).h((j) obj2, (ArrayList) obj3, (ArrayList) obj4, (String) obj5, (String) obj6, (Integer) obj7);
        }
        return null;
    }

    /* renamed from: ۟ۡۢۤ۟, reason: not valid java name and contains not printable characters */
    public static long m5683(Object obj, Object obj2) {
        if (C0052.m8320() >= 0) {
            return ((Delayed) obj).getDelay((TimeUnit) obj2);
        }
        return 0L;
    }

    /* renamed from: ۣ۟ۡۥۡ, reason: not valid java name and contains not printable characters */
    public static void m5684(Object obj, int i) {
        if (C0004.m1557() < 0) {
            ((LinearLayout) obj).setOrientation(i);
        }
    }

    /* renamed from: ۟ۡۤۥ۠, reason: not valid java name and contains not printable characters */
    public static void m5685(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0051.m8216() < 0) {
            com.github.catvod.spider.merge.B0.a.y((String) obj, (String) obj2, (String) obj3, (ArrayList) obj4);
        }
    }

    /* renamed from: ۟ۡۥۣۤ, reason: not valid java name and contains not printable characters */
    public static int m5686() {
        return 549 ^ C0043.f745;
    }

    /* renamed from: ۟ۡۧۨۢ, reason: not valid java name and contains not printable characters */
    public static FrameLayout m5687(Object obj) {
        if (C0062.m9429() >= 0) {
            return ((C0288g) obj).c;
        }
        return null;
    }

    /* renamed from: ۣ۟ۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m5688(Object obj, Object obj2) {
        if (C0028.m5152() < 0) {
            return ((f) obj).equals(obj2);
        }
        return false;
    }

    /* renamed from: ۟ۢۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Class m5689() {
        if (m5686() <= 0) {
            return Short.TYPE;
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۨۡ, reason: not valid java name and contains not printable characters */
    public static void m5690(Object obj, Object obj2) {
        if (C0050.m8121() <= 0) {
            ((C0259u) obj).k((String) obj2);
        }
    }

    /* renamed from: ۣ۟۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static d m5691(Object obj) {
        if (C0003.m1463() < 0) {
            return ((k) obj).n;
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static String m5692(Object obj) {
        if (C0020.m4210() < 0) {
            return ((com.github.catvod.spider.merge.F.k) obj).b();
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static File m5693(Object obj) {
        if (C0033.m5872() >= 0) {
            return ((p) obj).s();
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۦ۟, reason: not valid java name and contains not printable characters */
    public static String m5694() {
        if (C0014.m3353() < 0) {
            return "ookie";
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۧ۠, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.n0.a m5695() {
        if (C0045.m7538() <= 0) {
            return com.github.catvod.spider.p000mergexbpq.n0.c.c();
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۦۦ, reason: not valid java name and contains not printable characters */
    public static int m5696(Object obj) {
        if (C0034.m6048() <= 0) {
            return ((NG.Rst) obj).e;
        }
        return 0;
    }

    /* renamed from: ۟ۤ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m5697(Object obj, boolean z) {
        if (C0006.m1726() <= 0) {
            return ((Mogg) obj).homeContent(z);
        }
        return null;
    }

    /* renamed from: ۟ۤ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static String m5698() {
        if (C0053.m8389() >= 0) {
            return "播放数组";
        }
        return null;
    }

    /* renamed from: ۟ۤۢۧۡ, reason: not valid java name and contains not printable characters */
    public static List m5699(Object obj) {
        if (C0040.m6582() >= 0) {
            return ((com.github.catvod.spider.merge.I.b) obj).i();
        }
        return null;
    }

    /* renamed from: ۟ۤۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m5700(Object obj, int i, int i2) {
        if (C0044.m7508() < 0) {
            return HBmoou.getjmdata((String) obj, i, i2);
        }
        return null;
    }

    /* renamed from: ۟ۤۥۢ, reason: not valid java name and contains not printable characters */
    public static float m5701(Object obj) {
        if (C0042.m7147() < 0) {
            return ((C0288g) obj).g;
        }
        return 0.0f;
    }

    /* renamed from: ۟ۤۥۨۥ, reason: not valid java name and contains not printable characters */
    public static void m5702(Object obj, float f) {
        if (C0008.m1975() >= 0) {
            ((View) obj).setAlpha(f);
        }
    }

    /* renamed from: ۟ۤۦ۠ۡ, reason: not valid java name and contains not printable characters */
    public static TextDirectionHeuristic m5703() {
        if (C0050.m8121() <= 0) {
            return TextDirectionHeuristics.LTR;
        }
        return null;
    }

    /* renamed from: ۟ۤۦۡ۟, reason: not valid java name and contains not printable characters */
    public static void m5704(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0015.m3433() > 0) {
            ((o) obj).j((com.github.catvod.spider.merge.E0.d) obj2, (String) obj3, (q) obj4);
        }
    }

    /* renamed from: ۟ۤۦۨۥ, reason: not valid java name and contains not printable characters */
    public static int m5705(Object obj) {
        if (C0025.m4797() > 0) {
            return ((FrameLayout.LayoutParams) obj).topMargin;
        }
        return 0;
    }

    /* renamed from: ۟ۤۧۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5706(Object obj) {
        if (C0053.m8389() >= 0) {
            return ((l) obj).f;
        }
        return false;
    }

    /* renamed from: ۟ۤۨۤۨ, reason: not valid java name and contains not printable characters */
    public static u m5707(Object obj) {
        if (C0037.m6350() <= 0) {
            return ((u) obj).K();
        }
        return null;
    }

    /* renamed from: ۟ۥۣۦۡ, reason: not valid java name and contains not printable characters */
    public static boolean m5709(Object obj) {
        if (C0015.m3433() >= 0) {
            return ((File) obj).isFile();
        }
        return false;
    }

    /* renamed from: ۟ۥۦۤۧ, reason: not valid java name and contains not printable characters */
    public static HashMap m5710(Object obj) {
        if (C0003.m1463() <= 0) {
            return ((ChangZhang) obj).a();
        }
        return null;
    }

    /* renamed from: ۟ۥۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static HashMap m5711() {
        if (C0042.m7147() <= 0) {
            return HBtdou.a();
        }
        return null;
    }

    /* renamed from: ۟ۦۣ۠ۦ, reason: not valid java name and contains not printable characters */
    public static x m5712() {
        if (C0029.m5282() > 0) {
            return AbstractC0324d.b;
        }
        return null;
    }

    /* renamed from: ۟ۦۣ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m5713(Object obj) {
        if (C0051.m8216() < 0) {
            return ((O) obj).c;
        }
        return 0;
    }

    /* renamed from: ۟ۦۦۢ, reason: not valid java name and contains not printable characters */
    public static HashMap m5714(Object obj) {
        if (C0062.m9429() >= 0) {
            return ((e) obj).e();
        }
        return null;
    }

    /* renamed from: ۟ۦۧۥ, reason: not valid java name and contains not printable characters */
    public static p m5715(Object obj) {
        if (C0049.m8038() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.b.c) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۧ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static View m5716(Object obj, Object obj2) {
        if (C0009.m2047() > 0) {
            return ((View) obj).findViewWithTag(obj2);
        }
        return null;
    }

    /* renamed from: ۟ۧۡۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5717(Object obj) {
        if (C0054.m8557() < 0) {
            return ((NetworkInterface) obj).isUp();
        }
        return false;
    }

    /* renamed from: ۟ۧۢۢ۟, reason: not valid java name and contains not printable characters */
    public static HashMap m5718(Object obj) {
        if (C0047.m7837() > 0) {
            return ((C0306a) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static String m5719() {
        if (C0019.m4065() < 0) {
            return "$";
        }
        return null;
    }

    /* renamed from: ۣ۟ۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.B.a m5720(Object obj, Object obj2, Object obj3) {
        if (C0005.m1599() < 0) {
            return ((com.github.catvod.spider.merge.B.c) obj).a((Class) obj2, (Method[]) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۟ۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5721(Object obj) {
        if (C0040.m6582() >= 0) {
            return ((com.github.catvod.spider.merge.e1.b) obj).b();
        }
        return false;
    }

    /* renamed from: ۟ۧۦۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m5722(Object obj, Object obj2) {
        if (C0008.m1975() > 0) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        return false;
    }

    /* renamed from: ۟ۧۧۤ۠, reason: not valid java name and contains not printable characters */
    public static String m5723(Object obj) {
        if (C0018.m3956() > 0) {
            return ((NG.Rst) obj).c;
        }
        return null;
    }

    /* renamed from: ۣ۠۟, reason: not valid java name and contains not printable characters */
    public static byte[] m5724(Object obj) {
        if (C0030.m5375() > 0) {
            return ((BigInteger) obj).toByteArray();
        }
        return null;
    }

    /* renamed from: ۠ۡۨۤ, reason: not valid java name and contains not printable characters */
    public static String m5725() {
        if (C0026.m4977() < 0) {
            return "调试->fetchPost出错：";
        }
        return null;
    }

    /* renamed from: ۠ۡۨۧ, reason: not valid java name and contains not printable characters */
    public static int m5726(Object obj) {
        if (C0003.m1463() <= 0) {
            return ((C0147d) obj).e;
        }
        return 0;
    }

    /* renamed from: ۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Pattern m5727() {
        if (C0037.m6350() < 0) {
            return com.github.catvod.spider.merge.D.a.a;
        }
        return null;
    }

    /* renamed from: ۠ۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Object m5728(Object obj) {
        if (C0008.m1975() > 0) {
            return ((g) obj).b;
        }
        return null;
    }

    /* renamed from: ۠ۤۤۢ, reason: not valid java name and contains not printable characters */
    public static String m5729(Object obj) {
        if (C0008.m1975() > 0) {
            return ((com.github.catvod.spider.merge.T0.q) obj).y();
        }
        return null;
    }

    /* renamed from: ۠ۥۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m5730(Object obj) {
        if (C0050.m8121() < 0) {
            return ((com.github.catvod.spider.merge.b0.d) obj).d;
        }
        return false;
    }

    /* renamed from: ۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m5731(Object obj, Object obj2) {
        if (C0021.m4379() > 0) {
            return ((XPath) obj).isVideoFormat((String) obj2);
        }
        return false;
    }

    /* renamed from: ۡۡۢۥ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo m5732(Object obj) {
        if (C0036.m6252() > 0) {
            return ((AccessibilityNodeInfo) obj).getLabeledBy();
        }
        return null;
    }

    /* renamed from: ۡۥۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.G0.b[] m5733() {
        if (C0019.m4065() <= 0) {
            return A.k;
        }
        return null;
    }

    /* renamed from: ۡۥۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m5734(Object obj) {
        if (C0007.m1886() > 0) {
            return ((k) obj).k;
        }
        return false;
    }

    /* renamed from: ۡۦۣۡ, reason: not valid java name and contains not printable characters */
    public static int m5735(Object obj) {
        if (C0049.m8038() <= 0) {
            return ((n) obj).c();
        }
        return 0;
    }

    /* renamed from: ۡۦۨۨ, reason: not valid java name and contains not printable characters */
    public static String m5736(Object obj) {
        if (C0038.m6471() > 0) {
            return ((com.github.catvod.spider.merge.I.a) obj).c();
        }
        return null;
    }

    /* renamed from: ۡۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m5737(Object obj) {
        if (C0038.m6471() > 0) {
            return ((N) obj).b;
        }
        return 0;
    }

    /* renamed from: ۡۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Object m5738(Object obj) {
        if (C0044.m7508() < 0) {
            return ((com.github.catvod.spider.merge.H0.b) obj).a;
        }
        return null;
    }

    /* renamed from: ۡۧۥۥ, reason: not valid java name and contains not printable characters */
    public static String m5739() {
        if (C0018.m3956() >= 0) {
            return "点击";
        }
        return null;
    }

    /* renamed from: ۢ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static int m5740(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۣۢۧ۠, reason: not valid java name and contains not printable characters */
    public static Calendar m5741(Object obj, Object obj2) {
        if (C0008.m1975() > 0) {
            return Calendar.getInstance((TimeZone) obj, (Locale) obj2);
        }
        return null;
    }

    /* renamed from: ۢۧۡۨ, reason: not valid java name and contains not printable characters */
    public static String m5742(Object obj, char c, char c2) {
        if (C0055.m8740() >= 0) {
            return ((com.github.catvod.spider.merge.U0.O) obj).a(c, c2);
        }
        return null;
    }

    /* renamed from: ۢۧۧۤ, reason: not valid java name and contains not printable characters */
    public static String m5743(Object obj) {
        if (C0043.m7332() >= 0) {
            return ((MYzhiqiu) obj).a;
        }
        return null;
    }

    /* renamed from: ۢۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m5744(Object obj, Object obj2, Object obj3) {
        if (C0036.m6252() > 0) {
            ((HBQG) obj).init((Context) obj2, (String) obj3);
        }
    }

    /* renamed from: ۢۨۡ۟, reason: not valid java name and contains not printable characters */
    public static HashSet m5745(Object obj) {
        if (C0047.m7837() > 0) {
            return ((com.github.catvod.spider.merge.X.a) obj).a;
        }
        return null;
    }

    /* renamed from: ۢۨۤۥ, reason: not valid java name and contains not printable characters */
    public static ArrayList m5746(Object obj) {
        if (C0025.m4797() > 0) {
            return a.c((List) obj);
        }
        return null;
    }

    /* renamed from: ۣ, reason: not valid java name and contains not printable characters */
    public static BufferedInputStream m5747(Object obj) {
        if (C0006.m1726() <= 0) {
            return ((com.github.catvod.spider.merge.l0.e) obj).c;
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static Drawable m5748(Object obj, int i) {
        if (C0024.m4693() <= 0) {
            return ((Resources) obj).getDrawable(i);
        }
        return null;
    }

    /* renamed from: ۣۣ۠ۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.B.g[] m5749() {
        if (C0056.m8886() < 0) {
            return com.github.catvod.spider.merge.B.g.values();
        }
        return null;
    }

    /* renamed from: ۣۡۢۡ, reason: not valid java name and contains not printable characters */
    public static AlertDialog.Builder m5750(Object obj, Object obj2) {
        if (C0049.m8038() < 0) {
            return C0008.m2020((AlertDialog.Builder) obj, (DialogInterfaceOnDismissListenerC0243d) obj2);
        }
        return null;
    }

    /* renamed from: ۣۥۧ۟, reason: not valid java name and contains not printable characters */
    public static int m5751(Object obj, int i) {
        if (C0059.m9257() < 0) {
            return Integer.parseInt((String) obj, i);
        }
        return 0;
    }

    /* renamed from: ۣۨ۟, reason: not valid java name and contains not printable characters */
    public static i m5752(int i, int i2) {
        if (C0036.m6252() > 0) {
            return i.b(i, i2);
        }
        return null;
    }

    /* renamed from: ۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m5753(Object obj) {
        if (C0013.m3167() >= 0) {
            return ((ViewGroup.MarginLayoutParams) obj).getMarginStart();
        }
        return 0;
    }

    /* renamed from: ۤ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static Object m5754(Object obj, Object obj2) {
        if (C0018.m3956() >= 0) {
            return ((com.github.catvod.spider.merge.X0.d) obj).a((com.github.catvod.spider.merge.Y0.c) obj2);
        }
        return null;
    }

    /* renamed from: ۤۡۧ۠, reason: not valid java name and contains not printable characters */
    public static int m5755(Object obj) {
        if (C0063.m9589() < 0) {
            return ((com.github.catvod.spider.merge.K0.c) obj).b;
        }
        return 0;
    }

    /* renamed from: ۤۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static C0124g m5756(Object obj, Object obj2) {
        if (C0033.m5872() > 0) {
            return C0120c.a((com.github.catvod.spider.p000mergexbpq.e0.N) obj, (com.github.catvod.spider.p000mergexbpq.c0.l) obj2);
        }
        return null;
    }

    /* renamed from: ۤۨ, reason: not valid java name and contains not printable characters */
    public static void m5757(Object obj) {
        if (C0018.m3956() > 0) {
            ((com.github.catvod.spider.merge.F.i) obj).a();
        }
    }

    /* renamed from: ۤۨۥۧ, reason: not valid java name and contains not printable characters */
    public static String m5758(Object obj) {
        if (C0021.m4379() > 0) {
            return ((W) obj).f;
        }
        return null;
    }

    /* renamed from: ۥۡۧۡ, reason: contains not printable characters */
    public static WindowInsets.Builder m5759(Object obj, Object obj2) {
        if (C0052.m8320() >= 0) {
            return ((WindowInsets.Builder) obj).setStableInsets((Insets) obj2);
        }
        return null;
    }

    /* renamed from: ۥۢ۠ۨ, reason: contains not printable characters */
    public static int m5760(Object obj) {
        if (C0022.m4497() >= 0) {
            return ((Parcel) obj).readInt();
        }
        return 0;
    }

    /* renamed from: ۥۤۧۥ, reason: contains not printable characters */
    public static String m5761(Object obj, Object obj2) {
        if (C0030.m5375() >= 0) {
            return com.github.catvod.spider.merge.M0.d.e((Iterable) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۥۥ۟ۨ, reason: contains not printable characters */
    public static void m5762() {
        if (C0011.m2755() >= 0) {
            com.github.catvod.spider.merge.Z.c.a();
        }
    }

    /* renamed from: ۥۦۡۨ, reason: contains not printable characters */
    public static Charset m5763() {
        if (C0056.m8886() < 0) {
            return com.github.catvod.spider.p000mergexbpq.a0.b.a;
        }
        return null;
    }

    /* renamed from: ۥۦۧ۟, reason: contains not printable characters */
    public static Long m5764(Object obj) {
        if (C0014.m3353() <= 0) {
            return ((com.github.catvod.spider.merge.Y0.b) obj).d();
        }
        return null;
    }

    /* renamed from: ۥۨ۠ۧ, reason: contains not printable characters */
    public static InterfaceC0167y[] m5765(Object obj) {
        if (C0035.m6140() < 0) {
            return ((C0144a) obj).h;
        }
        return null;
    }

    /* renamed from: ۦ۠۠ۥ, reason: contains not printable characters */
    public static Date m5766(Object obj) {
        if (C0026.m4977() < 0) {
            return ((Calendar) obj).getTime();
        }
        return null;
    }

    /* renamed from: ۦۦ۟, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.G0.d m5767() {
        if (C0028.m5152() <= 0) {
            return AbstractC0151h.c;
        }
        return null;
    }

    /* renamed from: ۧ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m5768() {
        if (C0046.m7701() >= 0) {
            return "//proxy?do=settings', {\n            method: 'GET',\n            headers: {\n                'Content-Type': 'application/json'\n            }\n        }).then(response => {\n            if (!response.ok) throw new Error('请求失败');\n            return response.text();\n        }).then(data => {\n            console.log('设置请求成功:', data);\n        }).catch(error => {\n            console.error('设置请求失败:', error);\n        });\" style=\"\n               position: absolute;\n               right: 10px;\n               /* top: 30px; */\n               transform: translateY(-50%);\n               background: none;\n               border: none;\n               cursor: pointer;\n               font-size: 1.2em;\n               color: #667eea;\n               transition: all 0.2s ease;\n               \">\n        ⚙️\n    </button>\n    <i class=\"fas fa-tiger fa-2x\"></i>\n    <div class=\"title-group\">\n        <h1>🎬 小虎斑弹幕</h1>\n        <p class=\"subtitle\">全平台智能弹幕推送-推你想看</p>\n    </div>\n</div>\n<!-- 搜索区域 -->\n<div class=\"search-container\">\n    <!-- 搜索框 -->\n    <div class=\"search-wrapper\">\n        <input id=\"searchInput\" name=\"do=seachdanmu&amp;go=seach&amp;juming\" placeholder=\"输入剧名或关键词搜索\" required=\"\" tabindex=\"0\" type=\"text\" value=\"";
        }
        return null;
    }

    /* renamed from: ۣۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m5769(Object obj, Object obj2) {
        if (C0050.m8121() <= 0) {
            return com.github.catvod.spider.merge.Z.c.l((String) obj, (Map) obj2);
        }
        return null;
    }

    /* renamed from: ۣۣۧۨ, reason: not valid java name and contains not printable characters */
    public static Object[] m5770(Object obj, Object obj2) {
        if (C0043.m7332() > 0) {
            return ((p) obj).H((Map) obj2);
        }
        return null;
    }

    /* renamed from: ۣۧۧ۟, reason: not valid java name and contains not printable characters */
    public static String m5771(String str) {
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
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* renamed from: ۧۨۡۢ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.R.b[] m5772(Object obj) {
        if (C0002.m1242() > 0) {
            return ((S) obj).e;
        }
        return null;
    }

    /* renamed from: ۨ۠۠۟, reason: not valid java name and contains not printable characters */
    public static ArrayList m5773(Object obj, Object obj2) {
        if (C0041.m6823() < 0) {
            return ((com.github.catvod.spider.merge.V0.d) obj).b((String) obj2);
        }
        return null;
    }

    /* renamed from: ۨ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static QuickJSContext.Console m5774(Object obj) {
        if (C0021.m4379() > 0) {
            return ((C0350a) obj).a;
        }
        return null;
    }

    /* renamed from: ۨۢۧ۠, reason: not valid java name and contains not printable characters */
    public static void m5775(Object obj, Object obj2) {
        if (C0041.m6823() <= 0) {
            ((com.github.catvod.spider.merge.H0.f) obj).c((com.github.catvod.spider.merge.H0.c) obj2);
        }
    }

    /* renamed from: ۨۢۨ۠, reason: not valid java name and contains not printable characters */
    public static int m5776(Object obj) {
        if (C0005.m1599() < 0) {
            return ((com.github.catvod.spider.merge.U0.O) obj).b;
        }
        return 0;
    }

    /* renamed from: ۣۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m5777(Object obj) {
        if (C0025.m4797() > 0) {
            return ((File) obj).isDirectory();
        }
        return false;
    }

    /* renamed from: ۨۤۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m5778(Object obj, Object obj2) {
        if (C0050.m8121() < 0) {
            return ((i) obj).a((i) obj2);
        }
        return false;
    }

    /* renamed from: ۨۥۨۤ, reason: not valid java name and contains not printable characters */
    public static Pattern m5779() {
        if (C0016.m3596() <= 0) {
            return com.github.catvod.spider.merge.T0.a.h;
        }
        return null;
    }

    /* renamed from: ۨۨۥۤ, reason: not valid java name and contains not printable characters */
    public static String m5780(Object obj, int i) {
        if (C0056.m8886() < 0) {
            return ((HttpURLConnection) obj).getHeaderFieldKey(i);
        }
        return null;
    }

    /* renamed from: ۟ۥۣۢۥ, reason: not valid java name and contains not printable characters */
    public static String m5708(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}