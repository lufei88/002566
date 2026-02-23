package com.github.catvod.spider.merge.h;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebView;
import com.github.catvod.spider.AppZzun;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.HBDmSou;
import com.github.catvod.spider.HBNT4;
import com.github.catvod.spider.HBcms10Dou;
import com.github.catvod.spider.HBqwKan;
import com.github.catvod.spider.JSDemo;
import com.github.catvod.spider.NG;
import com.github.catvod.spider.Notice;
import com.github.catvod.spider.PPX;
import com.github.catvod.spider.Quark;
import com.github.catvod.spider.Tianyi;
import com.github.catvod.spider.UC;
import com.github.catvod.spider.W55Movie;
import com.github.catvod.spider.XBPQ;
import com.github.catvod.spider.Zhaozy;
import com.github.catvod.spider.merge.B.l;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0150g;
import com.github.catvod.spider.merge.F0.U;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.H0.f;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.h;
import com.github.catvod.spider.merge.P0.n;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.g;
import com.github.catvod.spider.merge.U0.P;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.o;
import com.github.catvod.spider.merge.W.p;
import com.github.catvod.spider.merge.W.z;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.C0246g;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.M;
import com.github.catvod.spider.merge.a0.N;
import com.github.catvod.spider.merge.a0.S;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.C0281k;
import com.github.catvod.spider.merge.e1.d;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f.C0293d;
import com.github.catvod.spider.merge.f.C0295f;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f0.C0302e;
import com.github.catvod.spider.merge.f0.RunnableC0301d;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h0.C0335o;
import com.github.catvod.spider.merge.h0.Q;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.l0.i;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.p0.C0359b;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.t0.InterfaceC0370c;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.P.x;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.v;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.R.e;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.c0.r;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.j.j;
import com.github.catvod.spider.p000mergexbpq.j.k;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.Field;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.slf4j.ILoggerFactory;
import org.slf4j.impl.StaticLoggerBinder;

/* renamed from: com.github.catvod.spider.merge.h.ۤۦۢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0054 {

    /* renamed from: ۥۦۥۨ, reason: contains not printable characters */
    public static int f802 = 566;

    /* renamed from: ۣۣ۟۟۟, reason: not valid java name and contains not printable characters */
    public static String m8546(Object obj) {
        if (C0058.m9131() <= 0) {
            return ((InterfaceC0370c) obj).f();
        }
        return null;
    }

    /* renamed from: ۣ۟۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m8547(Object obj) {
        if (C0053.m8389() >= 0) {
            return ((com.github.catvod.spider.merge.U.b) obj).c;
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static WebView m8548() {
        if (C0005.m1599() < 0) {
            return p.a;
        }
        return null;
    }

    /* renamed from: ۟۟ۡۢ۟, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.K.b m8549(Object obj) {
        if (C0063.m9589() < 0) {
            return ((com.github.catvod.spider.merge.K.a) obj).a();
        }
        return null;
    }

    /* renamed from: ۟۟ۢۨۤ, reason: not valid java name and contains not printable characters */
    public static Throwable m8550(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((C0359b) obj).a;
        }
        return null;
    }

    /* renamed from: ۟۟ۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m8551(Object obj) {
        if (C0017.m3633() < 0) {
            ((ReentrantLock) obj).lock();
        }
    }

    /* renamed from: ۟۟ۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m8552(Object obj) {
        if (C0061.m9359() <= 0) {
            return ((com.github.catvod.spider.merge.H0.a) obj).hasNext();
        }
        return false;
    }

    /* renamed from: ۟۟ۨۦۧ, reason: not valid java name and contains not printable characters */
    public static h m8553() {
        if (C0004.m1557() < 0) {
            return n.o;
        }
        return null;
    }

    /* renamed from: ۟۠۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8554(Object obj) {
        if (C0006.m1726() <= 0) {
            return ((View) obj).isAttachedToWindow();
        }
        return false;
    }

    /* renamed from: ۟۠۠۠, reason: not valid java name and contains not printable characters */
    public static Object m8555(Object obj) {
        if (C0017.m3633() <= 0) {
            return ((z) obj).b;
        }
        return null;
    }

    /* renamed from: ۟۠ۡ۠۠, reason: not valid java name and contains not printable characters */
    public static Integer m8556(Object obj, int i, int i2) {
        if (C0056.m8886() < 0) {
            return com.github.catvod.spider.merge.B0.a.e((String) obj, i, i2);
        }
        return null;
    }

    /* renamed from: ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m8557() {
        return (-45) ^ C0027.f493;
    }

    /* renamed from: ۟۠ۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8558(Object obj) {
        if (C0009.m2047() > 0) {
            return ((v) obj).h;
        }
        return false;
    }

    /* renamed from: ۟۠ۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static m m8559(Object obj) {
        if (C0062.m9429() >= 0) {
            return ((UC) obj).a;
        }
        return null;
    }

    /* renamed from: ۟۠ۨۢۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m8560(Object obj) {
        if (C0034.m6048() <= 0) {
            return ((com.github.catvod.spider.merge.K0.a) obj).g;
        }
        return null;
    }

    /* renamed from: ۟ۡ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8561(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((CharBuffer) obj).hasArray();
        }
        return false;
    }

    /* renamed from: ۟ۡۡۥۦ, reason: not valid java name and contains not printable characters */
    public static Object m8562(Object obj, Object obj2, Object obj3) {
        if (C0036.m6252() >= 0) {
            return k.y((Context) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۟ۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static JSONObject m8563(Object obj, Object obj2) {
        if (C0051.m8216() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.b.p) obj).y((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۦۥ, reason: not valid java name and contains not printable characters */
    public static String m8564() {
        if (C0062.m9429() >= 0) {
            return StaticLoggerBinder.REQUESTED_API_VERSION;
        }
        return null;
    }

    /* renamed from: ۟ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static String m8565() {
        if (C0040.m6582() >= 0) {
            return "2-";
        }
        return null;
    }

    /* renamed from: ۟ۡۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m8566(Object obj, Object obj2) {
        if (C0045.m7538() <= 0) {
            ((r) obj).G((String) obj2);
        }
    }

    /* renamed from: ۟ۡۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static UUID m8567() {
        if (C0043.m7332() >= 0) {
            return C0150g.e;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static HashMap m8568(Object obj) {
        if (C0025.m4797() > 0) {
            return ((HBqwKan) obj).b();
        }
        return null;
    }

    /* renamed from: ۟ۡۧۤۨ, reason: not valid java name and contains not printable characters */
    public static HashMap m8569() {
        if (C0037.m6350() < 0) {
            return com.github.catvod.spider.merge.B.m.b;
        }
        return null;
    }

    /* renamed from: ۟ۡۧۦۥ, reason: not valid java name and contains not printable characters */
    public static ArrayList m8570(Object obj) {
        if (C0031.m5628() >= 0) {
            return ((l) obj).g;
        }
        return null;
    }

    /* renamed from: ۟ۡۨۨ, reason: not valid java name and contains not printable characters */
    public static String m8571(Object obj, Object obj2) {
        if (C0009.m2047() > 0) {
            return ((Quark) obj).detailContent((List) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۢۦۣ۟, reason: not valid java name and contains not printable characters */
    public static StringBuilder m8572() {
        if (m8557() <= 0) {
            return com.github.catvod.spider.merge.S0.b.b();
        }
        return null;
    }

    /* renamed from: ۟ۢۦ۠۟, reason: not valid java name and contains not printable characters */
    public static i m8573() {
        if (C0041.m6823() <= 0) {
            return i.f;
        }
        return null;
    }

    /* renamed from: ۣ۟ۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m8575(Object obj, boolean z) {
        if (C0010.m2320() < 0) {
            ((AccessibilityNodeInfo) obj).setEditable(z);
        }
    }

    /* renamed from: ۣ۟ۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m8576() {
        if (C0024.m4693() < 0) {
            return "指定代理";
        }
        return null;
    }

    /* renamed from: ۣ۟ۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m8577(Object obj) {
        if (C0063.m9589() < 0) {
            return ((ViewGroup.LayoutParams) obj).height;
        }
        return 0;
    }

    /* renamed from: ۟ۤ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static void m8578(Object obj, Object obj2, Object obj3) {
        if (C0009.m2047() > 0) {
            AppZzun.a((JSONObject) obj, (String) obj2, (ArrayList) obj3);
        }
    }

    /* renamed from: ۟ۤ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static void m8579(Object obj) {
        if (C0033.m5872() > 0) {
            ((C0246g) obj).d();
        }
    }

    /* renamed from: ۟ۤۡۤۡ, reason: not valid java name and contains not printable characters */
    public static Process m8580(Object obj, Object obj2) {
        if (C0012.m3024() > 0) {
            return ((Runtime) obj).exec((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static e m8581(Object obj, int i) {
        if (C0058.m9131() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.R.b) obj).a(i);
        }
        return null;
    }

    /* renamed from: ۣ۟ۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m8582(Object obj) {
        if (C0005.m1599() <= 0) {
            d.g((ArrayList) obj);
        }
    }

    /* renamed from: ۣۣ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static void m8583() {
        if (C0010.m2320() < 0) {
            C0302e.e();
        }
    }

    /* renamed from: ۟ۤۥۡۡ, reason: not valid java name and contains not printable characters */
    public static Bitmap.CompressFormat m8584() {
        if (C0052.m8320() >= 0) {
            return Bitmap.CompressFormat.JPEG;
        }
        return null;
    }

    /* renamed from: ۟ۤۦۥۤ, reason: not valid java name and contains not printable characters */
    public static void m8585(Object obj) {
        if (C0000.m1116() < 0) {
            ((C0335o) obj).a();
        }
    }

    /* renamed from: ۟ۤۦۨۧ, reason: not valid java name and contains not printable characters */
    public static String m8586(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0035.m6140() < 0) {
            return ((XBPQ) obj).decrypt((String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* renamed from: ۟ۤۨۤۢ, reason: not valid java name and contains not printable characters */
    public static int m8587(Object obj) {
        if (C0064.m9659() <= 0) {
            return ((com.github.catvod.spider.merge.E0.l) obj).f;
        }
        return 0;
    }

    /* renamed from: ۟ۥۡۡ۠, reason: not valid java name and contains not printable characters */
    public static void m8588(Object obj) {
        if (C0011.m2755() >= 0) {
            ((f) obj).f();
        }
    }

    /* renamed from: ۟ۥۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m8589(Object obj, Object obj2) {
        if (C0003.m1463() < 0) {
            return ((Tianyi) obj).detailContentVodPlayUrl((List) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۥۢۤ, reason: not valid java name and contains not printable characters */
    public static int m8590(Object obj) {
        if (C0048.m7971() >= 0) {
            return ((String) obj).hashCode();
        }
        return 0;
    }

    /* renamed from: ۟ۥۣ۠, reason: not valid java name and contains not printable characters */
    public static HBDmSou m8591(Object obj) {
        if (C0037.m6350() < 0) {
            return ((com.github.catvod.spider.merge.b0.d) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۥۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m8592() {
        if (C0033.m5872() > 0) {
            return "三次跳转播放链接";
        }
        return null;
    }

    /* renamed from: ۟ۥۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static HashMap m8593() {
        if (C0042.m7147() < 0) {
            return PPX.a();
        }
        return null;
    }

    /* renamed from: ۟ۥۦۢۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.L.a m8594(Object obj) {
        if (C0014.m3353() <= 0) {
            return ((C0233B) obj).i;
        }
        return null;
    }

    /* renamed from: ۟ۥۦۨۥ, reason: not valid java name and contains not printable characters */
    public static void m8595(Object obj, Object obj2) {
        if (C0016.m3596() < 0) {
            ((C0254o) obj).t((String) obj2);
        }
    }

    /* renamed from: ۟ۦ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static void m8596(Object obj, Object obj2) {
        if (C0005.m1599() <= 0) {
            ((m) obj).l((String) obj2);
        }
    }

    /* renamed from: ۟ۦۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m8597(Object obj, Object obj2) {
        if (C0055.m8740() > 0) {
            ((j) obj).vertifyCode((String) obj2);
        }
    }

    /* renamed from: ۟ۦۤۥۥ, reason: not valid java name and contains not printable characters */
    public static int m8598() {
        if (C0022.m4497() >= 0) {
            return View.generateViewId();
        }
        return 0;
    }

    /* renamed from: ۟ۦۥۢۨ, reason: not valid java name and contains not printable characters */
    public static String m8599(int i) {
        if (C0013.m3167() > 0) {
            return String.valueOf(i);
        }
        return null;
    }

    /* renamed from: ۟ۦۨ۠۠, reason: not valid java name and contains not printable characters */
    public static int m8600(Object obj) {
        if (C0031.m5628() >= 0) {
            return ((U) obj).c;
        }
        return 0;
    }

    /* renamed from: ۟ۦۨۥۦ, reason: not valid java name and contains not printable characters */
    public static AtomicReferenceFieldUpdater m8601(Object obj) {
        if (C0044.m7508() <= 0) {
            return ((C0293d) obj).e;
        }
        return null;
    }

    /* renamed from: ۟ۧۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m8602(Object obj, Object obj2) {
        if (C0031.m5628() > 0) {
            ((com.github.catvod.spider.p000mergexbpq.T.c) obj).h((x) obj2);
        }
    }

    /* renamed from: ۣ۟ۧۤۨ, reason: not valid java name and contains not printable characters */
    public static String m8603() {
        if (C0027.m5017() >= 0) {
            return "vod_year";
        }
        return null;
    }

    /* renamed from: ۟ۧۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.F0.r m8604(Object obj) {
        if (C0046.m7701() > 0) {
            return ((com.github.catvod.spider.merge.G0.b) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۧۦۡۡ, reason: not valid java name and contains not printable characters */
    public static Field m8605(Object obj, Object obj2) {
        if (C0029.m5282() >= 0) {
            return ((Class) obj).getDeclaredField((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m8606(Object obj, Object obj2, int i) {
        if (C0059.m9257() <= 0) {
            C0281k.b((int[]) obj, (Object[]) obj2, i);
        }
    }

    /* renamed from: ۣ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static String m8607(Object obj) {
        if (C0037.m6350() <= 0) {
            return ((com.github.catvod.spider.merge.F.h) obj).d();
        }
        return null;
    }

    /* renamed from: ۠ۤ۠۟, reason: not valid java name and contains not printable characters */
    public static JSDemo m8608(Object obj) {
        if (C0021.m4379() > 0) {
            return ((com.github.catvod.spider.merge.b0.k) obj).b;
        }
        return null;
    }

    /* renamed from: ۠ۤۦ۟, reason: not valid java name and contains not printable characters */
    public static Object m8609(Object obj) {
        if (C0017.m3633() <= 0) {
            return ((Stack) obj).peek();
        }
        return null;
    }

    /* renamed from: ۠ۥ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m8610(Object obj) {
        if (C0064.m9659() < 0) {
            return ((P) obj).e;
        }
        return false;
    }

    /* renamed from: ۠ۨۤۨ, reason: not valid java name and contains not printable characters */
    public static String m8611() {
        if (C0011.m2755() >= 0) {
            return "需要验证，源码为--> ";
        }
        return null;
    }

    /* renamed from: ۠ۨۦ۠, reason: not valid java name and contains not printable characters */
    public static void m8612(Object obj, Object obj2) {
        if (C0004.m1557() < 0) {
            ((C0246g) obj).x((com.github.catvod.spider.merge.F.e) obj2);
        }
    }

    /* renamed from: ۡۢۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m8613(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0013.m3167() >= 0) {
            return ((Path) obj).op((Path) obj2, (Path) obj3, (Path.Op) obj4);
        }
        return false;
    }

    /* renamed from: ۡۢۢۡ, reason: not valid java name and contains not printable characters */
    public static List m8614(Object obj) {
        if (C0031.m5628() >= 0) {
            return ((NG.VtInfo) obj).getUrl();
        }
        return null;
    }

    /* renamed from: ۡۢۧ۠, reason: not valid java name and contains not printable characters */
    public static int m8615(Object obj) {
        if (C0011.m2755() > 0) {
            return ((Q) obj).a;
        }
        return 0;
    }

    /* renamed from: ۡۢۨۨ, reason: not valid java name and contains not printable characters */
    public static void m8616(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0028.m5152() <= 0) {
            com.github.catvod.spider.merge.T0.a.b((String) obj, (String) obj2, (Appendable) obj3, (g) obj4);
        }
    }

    /* renamed from: ۡۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.CollectionItemInfo m8617(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        if (C0039.m6529() < 0) {
            return AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2);
        }
        return null;
    }

    /* renamed from: ۡۦۦۢ, reason: not valid java name and contains not printable characters */
    public static String m8618(Object obj) {
        if (C0003.m1463() < 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).y;
        }
        return null;
    }

    /* renamed from: ۡۧۤۢ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.c0.m m8619(Object obj) {
        if (C0056.m8886() < 0) {
            return com.github.catvod.spider.p000mergexbpq.c0.m.valueOf((String) obj);
        }
        return null;
    }

    /* renamed from: ۢ۠۟۠, reason: not valid java name and contains not printable characters */
    public static String[] m8620(Object obj) {
        if (C0030.m5375() >= 0) {
            return ((com.github.catvod.spider.merge.Z.f) obj).c;
        }
        return null;
    }

    /* renamed from: ۢ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m8621(Object obj, boolean z, boolean z2) {
        if (C0042.m7147() < 0) {
            return ((Drawable) obj).setVisible(z, z2);
        }
        return false;
    }

    /* renamed from: ۢۢۧۨ, reason: not valid java name and contains not printable characters */
    public static long m8622(Object obj) {
        if (C0057.m9017() >= 0) {
            return ((M) obj).q;
        }
        return 0L;
    }

    /* renamed from: ۢۥ, reason: not valid java name and contains not printable characters */
    public static Pattern m8623(Object obj) {
        if (C0056.m8886() <= 0) {
            return ((Zhaozy) obj).c;
        }
        return null;
    }

    /* renamed from: ۣۣ۟۟, reason: not valid java name and contains not printable characters */
    public static int m8624(Object obj) {
        if (C0057.m9017() >= 0) {
            return ((RunnableC0301d) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣۡۤۧ, reason: not valid java name and contains not printable characters */
    public static String m8625(Object obj) {
        if (C0000.m1116() <= 0) {
            return ((HBcms10Dou) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۨۧۧ, reason: not valid java name and contains not printable characters */
    public static File m8626(Object obj) {
        if (C0004.m1557() <= 0) {
            return ((File) obj).getCanonicalFile();
        }
        return null;
    }

    /* renamed from: ۤ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static String m8627(Object obj) {
        if (C0033.m5872() >= 0) {
            return ((Config) obj).k;
        }
        return null;
    }

    /* renamed from: ۤۡۧۥ, reason: not valid java name and contains not printable characters */
    public static int m8628(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۤۥۦۥ, reason: not valid java name and contains not printable characters */
    public static void m8629(Object obj, int i) {
        if (C0052.m8320() >= 0) {
            ((View) obj).setOverScrollMode(i);
        }
    }

    /* renamed from: ۤۦۦۦ, reason: not valid java name and contains not printable characters */
    public static int m8630(Object obj) {
        if (C0044.m7508() < 0) {
            return ((Notice) obj).c;
        }
        return 0;
    }

    /* renamed from: ۤۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m8631(Object obj) {
        if (C0062.m9429() >= 0) {
            return ((View) obj).getHeight();
        }
        return 0;
    }

    /* renamed from: ۤۧۥ, reason: not valid java name and contains not printable characters */
    public static int m8632() {
        if (C0016.m3596() <= 0) {
            return Build.VERSION.SDK_INT;
        }
        return 0;
    }

    /* renamed from: ۤۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.H0.h m8633(Object obj) {
        if (C0013.m3167() >= 0) {
            return ((com.github.catvod.spider.merge.E0.d) obj).e;
        }
        return null;
    }

    /* renamed from: ۥ۠ۢۦ, reason: contains not printable characters */
    public static int m8634(Object obj) {
        if (C0034.m6048() <= 0) {
            return ((com.github.catvod.spider.merge.G0.d) obj).e;
        }
        return 0;
    }

    /* renamed from: ۥۢۡ, reason: contains not printable characters */
    public static SharedPreferences.Editor m8635(Object obj, Object obj2, int i) {
        if (C0024.m4693() < 0) {
            return ((SharedPreferences.Editor) obj).putInt((String) obj2, i);
        }
        return null;
    }

    /* renamed from: ۥۧۥ۟, reason: contains not printable characters */
    public static String m8636(Object obj, int i, int i2) {
        if (C0041.m6823() < 0) {
            return ((String) obj).substring(i, i2);
        }
        return null;
    }

    /* renamed from: ۥۧۨۨ, reason: contains not printable characters */
    public static ILoggerFactory m8637(Object obj) {
        if (C0029.m5282() > 0) {
            return ((StaticLoggerBinder) obj).getLoggerFactory();
        }
        return null;
    }

    /* renamed from: ۦۥۣۥ, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.F.p m8638(Object obj) {
        if (C0019.m4065() <= 0) {
            return ((com.github.catvod.spider.merge.F.c) obj).c();
        }
        return null;
    }

    /* renamed from: ۦۨۡ, reason: contains not printable characters */
    public static String m8639() {
        if (C0013.m3167() > 0) {
            return W55Movie.c;
        }
        return null;
    }

    /* renamed from: ۧ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.T0.m m8640(Object obj) {
        if (C0050.m8121() < 0) {
            return ((com.github.catvod.spider.merge.T0.m) obj).L();
        }
        return null;
    }

    /* renamed from: ۧ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static int m8641(Object obj) {
        if (m8557() < 0) {
            return ((com.github.catvod.spider.merge.T.b) obj).a;
        }
        return 0;
    }

    /* renamed from: ۧۡۤۧ, reason: not valid java name and contains not printable characters */
    public static String m8642() {
        if (C0037.m6350() <= 0) {
            return "逗号";
        }
        return null;
    }

    /* renamed from: ۣۧۨۡ, reason: not valid java name and contains not printable characters */
    public static String m8643() {
        if (C0023.m4566() <= 0) {
            return "选集";
        }
        return null;
    }

    /* renamed from: ۧۦ۟, reason: not valid java name and contains not printable characters */
    public static HashMap m8644() {
        if (C0040.m6582() > 0) {
            return HBNT4.a();
        }
        return null;
    }

    /* renamed from: ۧۦۦۣ, reason: not valid java name and contains not printable characters */
    public static float m8645(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((Paint) obj).ascent();
        }
        return 0.0f;
    }

    /* renamed from: ۣۧۧ۟, reason: not valid java name and contains not printable characters */
    public static int m8646(int i, Object obj) {
        if (C0063.m9589() < 0) {
            return com.github.catvod.spider.merge.g0.e.o(i, (String) obj);
        }
        return 0;
    }

    /* renamed from: ۧۨۧۢ, reason: not valid java name and contains not printable characters */
    public static String m8647(Object obj, Object obj2) {
        if (C0047.m7837() >= 0) {
            return com.github.catvod.spider.p000mergexbpq.j.m.a((String) obj, (Charset) obj2);
        }
        return null;
    }

    /* renamed from: ۨ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static void m8648(Object obj, Object obj2, Object obj3) {
        if (C0012.m3024() >= 0) {
            ((com.github.catvod.spider.merge.a1.k) obj).e((C0295f) obj2, (Thread) obj3);
        }
    }

    /* renamed from: ۨ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static int m8649(Object obj) {
        if (C0056.m8886() <= 0) {
            return ((CharBuffer) obj).arrayOffset();
        }
        return 0;
    }

    /* renamed from: ۨ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static int m8650(Object obj) {
        if (C0046.m7701() > 0) {
            return ((o) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣۣۨۥ, reason: not valid java name and contains not printable characters */
    public static String m8651() {
        if (C0053.m8389() >= 0) {
            return "data:image/png;base64,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";
        }
        return null;
    }

    /* renamed from: ۣۣۨۤ, reason: not valid java name and contains not printable characters */
    public static String m8652(String str) {
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

    /* renamed from: ۨۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8653(Object obj, int i) {
        if (C0045.m7538() <= 0) {
            return ((com.github.catvod.spider.merge.E0.f) obj).g(i);
        }
        return false;
    }

    /* renamed from: ۨۦۣۧ, reason: not valid java name and contains not printable characters */
    public static S m8654(Object obj) {
        if (C0062.m9429() > 0) {
            return ((N) obj).b;
        }
        return null;
    }

    /* renamed from: ۣۣۣ۟۠, reason: not valid java name and contains not printable characters */
    public static String m8574(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}