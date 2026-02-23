package com.github.catvod.spider.merge.Q0;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.location.GnssStatus;
import android.os.PersistableBundle;
import android.util.AttributeSet;
import android.util.SparseLongArray;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import android.webkit.WebView;
import android.widget.EditText;
import androidx.core.view.DragStartHelper;
import com.github.catvod.spider.AppZzun;
import com.github.catvod.spider.ApplvDV2;
import com.github.catvod.spider.Douban;
import com.github.catvod.spider.HB360;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Mogg;
import com.github.catvod.spider.NG;
import com.github.catvod.spider.P123;
import com.github.catvod.spider.UC;
import com.github.catvod.spider.XBPQb;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.D.f;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.F.h;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0163u;
import com.github.catvod.spider.merge.F0.C0166x;
import com.github.catvod.spider.merge.F0.Q;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.U0.C0176b;
import com.github.catvod.spider.merge.U0.E;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.c;
import com.github.catvod.spider.merge.V0.p;
import com.github.catvod.spider.merge.W.C0228d;
import com.github.catvod.spider.merge.W.o;
import com.github.catvod.spider.merge.W.q;
import com.github.catvod.spider.merge.W.v;
import com.github.catvod.spider.merge.X0.A;
import com.github.catvod.spider.merge.X0.y;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0246g;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.C0259u;
import com.github.catvod.spider.merge.a0.DialogInterfaceOnDismissListenerC0243d;
import com.github.catvod.spider.merge.a0.P;
import com.github.catvod.spider.merge.a0.RunnableC0237F;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.e.C0271a;
import com.github.catvod.spider.merge.e.C0281k;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.g0.e;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0340u;
import com.github.catvod.spider.merge.h0.DialogInterfaceOnClickListenerC0319H;
import com.github.catvod.spider.merge.h0.RunnableC0336p;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.l0.j;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.w.ViewOnTouchListenerC0399c;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.S.i;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b.b;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c.d;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import com.github.catvod.spider.p000mergexbpq.c0.r;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.e0.C0120c;
import com.github.catvod.spider.p000mergexbpq.e0.N;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLConnection;
import java.nio.Buffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Future;
import java.util.regex.Pattern;
import org.json.JSONArray;

/* renamed from: com.github.catvod.spider.merge.Q0.ۣ۟ۤۦۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0025 {

    /* renamed from: ۦۦۧۥ, reason: contains not printable characters */
    public static int f489 = 517;

    /* renamed from: ۟۟۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static int m4768(Object obj) {
        if (C0023.m4566() <= 0) {
            return ((c) obj).b;
        }
        return 0;
    }

    /* renamed from: ۣ۟۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static void m4769(Object obj, Object obj2) {
        if (C0000.m1116() < 0) {
            ((Dialog) obj).setOnDismissListener((DialogInterface.OnDismissListener) obj2);
        }
    }

    /* renamed from: ۟۟ۢۡۡ, reason: not valid java name and contains not printable characters */
    public static String m4770(Object obj, int i) {
        if (C0017.m3633() <= 0) {
            return ((JSONArray) obj).getString(i);
        }
        return null;
    }

    /* renamed from: ۟۟ۢۡۨ, reason: not valid java name and contains not printable characters */
    public static Object m4771(Object obj) {
        if (C0006.m1726() < 0) {
            return ((C0163u) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static void m4772(Object obj, Object obj2, boolean z) {
        if (C0057.m9017() >= 0) {
            ((PersistableBundle) obj).putBoolean((String) obj2, z);
        }
    }

    /* renamed from: ۣ۟۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static void m4773(Object obj, Object obj2, Object obj3) {
        if (C0060.m9355() >= 0) {
            ((C0271a) obj).g(obj2, obj3);
        }
    }

    /* renamed from: ۟۟ۥ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m4774(Object obj) {
        if (C0061.m9359() < 0) {
            return com.github.catvod.spider.merge.T0.c.i((String) obj);
        }
        return false;
    }

    /* renamed from: ۟۟ۦۡۤ, reason: not valid java name and contains not printable characters */
    public static int m4775(Object obj) {
        if (C0005.m1599() < 0) {
            return ((View) obj).getMeasuredWidth();
        }
        return 0;
    }

    /* renamed from: ۣ۟۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static ViewConfiguration m4776(Object obj) {
        if (C0058.m9131() <= 0) {
            return ViewConfiguration.get((Context) obj);
        }
        return null;
    }

    /* renamed from: ۟۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static String m4777(Object obj) {
        if (C0010.m2320() < 0) {
            return ((j) obj).b;
        }
        return null;
    }

    /* renamed from: ۟۟ۨۨ۠, reason: not valid java name and contains not printable characters */
    public static int m4778(Object obj, Object obj2) {
        if (C0017.m3633() <= 0) {
            return ((Enum) obj).compareTo((Enum) obj2);
        }
        return 0;
    }

    /* renamed from: ۟۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m4779() {
        if (C0011.m2755() >= 0) {
            return "调试->解密网址token出错：";
        }
        return null;
    }

    /* renamed from: ۟۠ۢۦۧ, reason: not valid java name and contains not printable characters */
    public static String m4780(Object obj, Object obj2, Object obj3) {
        if (C0019.m4065() < 0) {
            return ((C0254o) obj).j((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟۠ۥۥۨ, reason: not valid java name and contains not printable characters */
    public static Object m4781(Object obj) {
        if (C0005.m1599() < 0) {
            return ((P) obj).d;
        }
        return null;
    }

    /* renamed from: ۟۠ۦۣ۠, reason: not valid java name and contains not printable characters */
    public static Double m4782(Object obj) {
        if (C0063.m9589() < 0) {
            return Double.valueOf((String) obj);
        }
        return null;
    }

    /* renamed from: ۟۠ۦۥۨ, reason: not valid java name and contains not printable characters */
    public static void m4783(Object obj, Object obj2) {
        if (C0005.m1599() <= 0) {
            e.C((String) obj, (File) obj2);
        }
    }

    /* renamed from: ۟ۡ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static int m4784(Object obj) {
        if (C0009.m2047() > 0) {
            return ((View) obj).getLeft();
        }
        return 0;
    }

    /* renamed from: ۟ۡ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static Locale m4785() {
        if (C0018.m3956() > 0) {
            return Locale.US;
        }
        return null;
    }

    /* renamed from: ۟ۡۡۤۦ, reason: not valid java name and contains not printable characters */
    public static Class m4786(Object obj) {
        if (C0016.m3596() < 0) {
            return ((Class) obj).getSuperclass();
        }
        return null;
    }

    /* renamed from: ۟ۡۢۢۥ, reason: not valid java name and contains not printable characters */
    public static Object m4787(Object obj, Object obj2) {
        if (C0007.m1886() >= 0) {
            return ((y) obj).a((com.github.catvod.spider.merge.Y0.c) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۦۡ, reason: not valid java name and contains not printable characters */
    public static void m4788(Object obj, Object obj2) {
        if (C0035.m6140() < 0) {
            ((g) obj).v((List) obj2);
        }
    }

    /* renamed from: ۟ۡۦۡۢ, reason: not valid java name and contains not printable characters */
    public static C0163u m4789(Object obj) {
        if (C0063.m9589() < 0) {
            return ((C0176b) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۢ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static HashMap m4790(Object obj) {
        if (C0059.m9257() < 0) {
            return AppZzun.e((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۢۡۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4791(Object obj, Object obj2) {
        if (C0036.m6252() > 0) {
            return ((PersistableBundle) obj).getBoolean((String) obj2);
        }
        return false;
    }

    /* renamed from: ۣ۟ۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Pattern m4792(Object obj) {
        if (C0026.m4977() < 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).G;
        }
        return null;
    }

    /* renamed from: ۣ۟ۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m4793(Object obj) {
        if (C0046.m7701() >= 0) {
            return ((C0246g) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۦۥ, reason: not valid java name and contains not printable characters */
    public static HashMap m4794() {
        if (C0036.m6252() >= 0) {
            return Douban.a();
        }
        return null;
    }

    /* renamed from: ۟ۢۤۧۢ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.d.c m4796(Object obj) {
        if (C0014.m3353() < 0) {
            return ((b) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۢۥۣ۠, reason: not valid java name and contains not printable characters */
    public static int m4797() {
        return (-814) ^ C0057.f842;
    }

    /* renamed from: ۟ۢۥۧۧ, reason: not valid java name and contains not printable characters */
    public static Pattern m4798() {
        if (C0005.m1599() <= 0) {
            return C.a;
        }
        return null;
    }

    /* renamed from: ۟ۢۦۣۨ, reason: not valid java name and contains not printable characters */
    public static String m4799(Object obj) {
        if (C0015.m3433() > 0) {
            return ((l) obj).T();
        }
        return null;
    }

    /* renamed from: ۟ۢۧۡۤ, reason: not valid java name and contains not printable characters */
    public static String m4800(Object obj, Object obj2, Object obj3) {
        if (C0042.m7147() < 0) {
            return ((String) obj).replaceAll((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۢۧۥۦ, reason: not valid java name and contains not printable characters */
    public static q m4801(Object obj) {
        if (C0063.m9589() < 0) {
            return ((o) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۢۨۡۨ, reason: not valid java name and contains not printable characters */
    public static Set m4802(Object obj) {
        if (C0014.m3353() < 0) {
            return ((ConcurrentHashMap) obj).entrySet();
        }
        return null;
    }

    /* renamed from: ۟ۢۨۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4803(Object obj, Object obj2) {
        if (C0015.m3433() > 0) {
            return Arrays.equals((int[]) obj, (int[]) obj2);
        }
        return false;
    }

    /* renamed from: ۟ۢۨۤۨ, reason: not valid java name and contains not printable characters */
    public static String m4804(Object obj) {
        if (C0057.m9017() > 0) {
            return ((E) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static void m4805(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0016.m3596() < 0) {
            ((C0163u) obj).e(obj2, obj3, (Q) obj4);
        }
    }

    /* renamed from: ۣ۟ۥۣ۟, reason: not valid java name and contains not printable characters */
    public static String m4806() {
        if (C0027.m5017() >= 0) {
            return "\u0003悋Ꜫ脳맭䅼㯧瞆奤\u0003+å\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004\t\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007\u0004\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004\f\t\f\u0004\r\t\r\u0004\u000e\t\u000e\u0004\u000f\t\u000f\u0004\u0010\t\u0010\u0004\u0011\t\u0011\u0004\u0012\t\u0012\u0004\u0013\t\u0013\u0004\u0014\t\u0014\u0004\u0015\t\u0015\u0004\u0016\t\u0016\u0004\u0017\t\u0017\u0004\u0018\t\u0018\u0004\u0019\t\u0019\u0004\u001a\t\u001a\u0004\u001b\t\u001b\u0004\u001c\t\u001c\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0005\u0003=\n\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0007\u0005E\n\u0005\f\u0005\u000e\u0005H\u000b\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0007\u0006M\n\u0006\f\u0006\u000e\u0006P\u000b\u0006\u0003\u0006\u0005\u0006S\n\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0005\u0007X\n\u0007\u0005\u0007Z\n\u0007\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0005\bd\n\b\u0003\t\u0003\t\u0003\t\u0003\t\u0003\n\u0003\n\u0003\u000b\u0003\u000b\u0003\f\u0003\f\u0003\f\u0003\f\u0003\f\u0003\f\u0003\f\u0003\f\u0005\fv\n\f\u0003\r\u0003\r\u0003\r\u0003\r\u0003\r\u0007\r}\n\r\f\r\u000e\r\u0080\u000b\r\u0005\r\u0082\n\r\u0003\r\u0003\r\u0003\u000e\u0003\u000e\u0003\u000e\u0005\u000e\u0089\n\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0005\u000e\u008e\n\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u0094\n\u000f\u0005\u000f\u0096\n\u000f\u0003\u0010\u0003\u0010\u0007\u0010\u009a\n\u0010\f\u0010\u000e\u0010\u009d\u000b\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0007\u0011¢\n\u0011\f\u0011\u000e\u0011¥\u000b\u0011\u0003\u0012\u0003\u0012\u0003\u0012\u0007\u0012ª\n\u0012\f\u0012\u000e\u0012\u00ad\u000b\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0007\u0013²\n\u0013\f\u0013\u000e\u0013µ\u000b\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0007\u0014º\n\u0014\f\u0014\u000e\u0014½\u000b\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0007\u0015Â\n\u0015\f\u0015\u000e\u0015Å\u000b\u0015\u0003\u0016\u0003\u0016\u0003\u0016\u0005\u0016Ê\n\u0016\u0003\u0017\u0005\u0017Í\n\u0017\u0003\u0017\u0003\u0017\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018Ô\n\u0018\u0003\u0019\u0003\u0019\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0005\u001bá\n\u001b\u0003\u001c\u0003\u001c\u0003\u001c\u0002\u0002\u001d\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246\u0002\t\u0003\u0002\n\u000b\u0004\u0002\u0012\u0012\u0016\u0016\u0003\u0002\u001e\u001f\u0005\u0002\u001a\u001b\u001d\u001d $\u0003\u0002\u0010\u0011\u0003\u0002\u0013\u0015\u0004\u0002\t\t++\u0002æ\u00028\u0003\u0002\u0002\u0002\u0004<\u0003\u0002\u0002\u0002\u0006>\u0003\u0002\u0002\u0002\bA\u0003\u0002\u0002\u0002\nR\u0003\u0002\u0002\u0002\fY\u0003\u0002\u0002\u0002\u000ec\u0003\u0002\u0002\u0002\u0010e\u0003\u0002\u0002\u0002\u0012i\u0003\u0002\u0002\u0002\u0014k\u0003\u0002\u0002\u0002\u0016u\u0003\u0002\u0002\u0002\u0018w\u0003\u0002\u0002\u0002\u001a\u008d\u0003\u0002\u0002\u0002\u001c\u0095\u0003\u0002\u0002\u0002\u001e\u0097\u0003\u0002\u0002\u0002 \u009e\u0003\u0002\u0002\u0002\"¦\u0003\u0002\u0002\u0002$®\u0003\u0002\u0002\u0002&¶\u0003\u0002\u0002\u0002(¾\u0003\u0002\u0002\u0002*Æ\u0003\u0002\u0002\u0002,Ì\u0003\u0002\u0002\u0002.Ð\u0003\u0002\u0002\u00020Õ\u0003\u0002\u0002\u00022×\u0003\u0002\u0002\u00024à\u0003\u0002\u0002\u00026â\u0003\u0002\u0002\u000289\u0005\u0014\u000b\u00029\u0003\u0003\u0002\u0002\u0002:=\u0005\b\u0005\u0002;=\u0005\u0006\u0004\u0002<:\u0003\u0002\u0002\u0002<;\u0003\u0002\u0002\u0002=\u0005\u0003\u0002\u0002\u0002>?\t\u0002\u0002\u0002?@\u0005\b\u0005\u0002@\u0007\u0003\u0002\u0002\u0002AF\u0005\n\u0006\u0002BC\t\u0002\u0002\u0002CE\u0005\n\u0006\u0002DB\u0003\u0002\u0002\u0002EH\u0003\u0002\u0002\u0002FD\u0003\u0002\u0002\u0002FG\u0003\u0002\u0002\u0002G\t\u0003\u0002\u0002\u0002HF\u0003\u0002\u0002\u0002IJ\u0005\f\u0007\u0002JN\u0005\u000e\b\u0002KM\u0005\u0010\t\u0002LK\u0003\u0002\u0002\u0002MP\u0003\u0002\u0002\u0002NL\u0003\u0002\u0002\u0002NO\u0003\u0002\u0002\u0002OS\u0003\u0002\u0002\u0002PN\u0003\u0002\u0002\u0002QS\u0005\u0012\n\u0002RI\u0003\u0002\u0002\u0002RQ\u0003\u0002\u0002\u0002S\u000b\u0003\u0002\u0002\u0002TU\u0007\t\u0002\u0002UZ\u0007&\u0002\u0002VX\u0007\u0017\u0002\u0002WV\u0003\u0002\u0002\u0002WX\u0003\u0002\u0002\u0002XZ\u0003\u0002\u0002\u0002YT\u0003\u0002\u0002\u0002YW\u0003\u0002\u0002\u0002Z\r\u0003\u0002\u0002\u0002[d\u00054\u001b\u0002\\]\u0007\u0007\u0002\u0002]^\u0007\f\u0002\u0002^d\u0007\r\u0002\u0002_`\u0007\u0003\u0002\u0002`a\u0007\f\u0002\u0002ab\u0007)\u0002\u0002bd\u0007\r\u0002\u0002c[\u0003\u0002\u0002\u0002c\\\u0003\u0002\u0002\u0002c_\u0003\u0002\u0002\u0002d\u000f\u0003\u0002\u0002\u0002ef\u0007\u000e\u0002\u0002fg\u0005\u0014\u000b\u0002gh\u0007\u000f\u0002\u0002h\u0011\u0003\u0002\u0002\u0002ij\t\u0003\u0002\u0002j\u0013\u0003\u0002\u0002\u0002kl\u0005 \u0011\u0002l\u0015\u0003\u0002\u0002\u0002mv\u00052\u001a\u0002no\u0007\f\u0002\u0002op\u0005\u0014\u000b\u0002pq\u0007\r\u0002\u0002qv\u0003\u0002\u0002\u0002rv\u0007)\u0002\u0002sv\u0007\b\u0002\u0002tv\u0005\u0018\r\u0002um\u0003\u0002\u0002\u0002un\u0003\u0002\u0002\u0002ur\u0003\u0002\u0002\u0002us\u0003\u0002\u0002\u0002ut\u0003\u0002\u0002\u0002v\u0017\u0003\u0002\u0002\u0002wx\u00050\u0019\u0002x\u0081\u0007\f\u0002\u0002y~\u0005\u0014\u000b\u0002z{\u0007\u0018\u0002\u0002{}\u0005\u0014\u000b\u0002|z\u0003\u0002\u0002\u0002}\u0080\u0003\u0002\u0002\u0002~|\u0003\u0002\u0002\u0002~\u007f\u0003\u0002\u0002\u0002\u007f\u0082\u0003\u0002\u0002\u0002\u0080~\u0003\u0002\u0002\u0002\u0081y\u0003\u0002\u0002\u0002\u0081\u0082\u0003\u0002\u0002\u0002\u0082\u0083\u0003\u0002\u0002\u0002\u0083\u0084\u0007\r\u0002\u0002\u0084\u0019\u0003\u0002\u0002\u0002\u0085\u0088\u0005\u001c\u000f\u0002\u0086\u0087\u0007\u0019\u0002\u0002\u0087\u0089\u0005\u001a\u000e\u0002\u0088\u0086\u0003\u0002\u0002\u0002\u0088\u0089\u0003\u0002\u0002\u0002\u0089\u008e\u0003\u0002\u0002\u0002\u008a\u008b\u0007\n\u0002\u0002\u008b\u008c\u0007\u0019\u0002\u0002\u008c\u008e\u0005\u001a\u000e\u0002\u008d\u0085\u0003\u0002\u0002\u0002\u008d\u008a\u0003\u0002\u0002\u0002\u008e\u001b\u0003\u0002\u0002\u0002\u008f\u0096\u0005\u0004\u0003\u0002\u0090\u0093\u0005\u001e\u0010\u0002\u0091\u0092\t\u0002\u0002\u0002\u0092\u0094\u0005\b\u0005\u0002\u0093\u0091\u0003\u0002\u0002\u0002\u0093\u0094\u0003\u0002\u0002\u0002\u0094\u0096\u0003\u0002\u0002\u0002\u0095\u008f\u0003\u0002\u0002\u0002\u0095\u0090\u0003\u0002\u0002\u0002\u0096\u001d\u0003\u0002\u0002\u0002\u0097\u009b\u0005\u0016\f\u0002\u0098\u009a\u0005\u0010\t\u0002\u0099\u0098\u0003\u0002\u0002\u0002\u009a\u009d\u0003\u0002\u0002\u0002\u009b\u0099\u0003\u0002\u0002\u0002\u009b\u009c\u0003\u0002\u0002\u0002\u009c\u001f\u0003\u0002\u0002\u0002\u009d\u009b\u0003\u0002\u0002\u0002\u009e£\u0005\"\u0012\u0002\u009f \u0007\u0004\u0002\u0002 ¢\u0005\"\u0012\u0002¡\u009f\u0003\u0002\u0002\u0002¢¥\u0003\u0002\u0002\u0002£¡\u0003\u0002\u0002\u0002£¤\u0003\u0002\u0002\u0002¤!\u0003\u0002\u0002\u0002¥£\u0003\u0002\u0002\u0002¦«\u0005$\u0013\u0002§¨\u0007\u0005\u0002\u0002¨ª\u0005$\u0013\u0002©§\u0003\u0002\u0002\u0002ª\u00ad\u0003\u0002\u0002\u0002«©\u0003\u0002\u0002\u0002«¬\u0003\u0002\u0002\u0002¬#\u0003\u0002\u0002\u0002\u00ad«\u0003\u0002\u0002\u0002®³\u0005&\u0014\u0002¯°\t\u0004\u0002\u0002°²\u0005&\u0014\u0002±¯\u0003\u0002\u0002\u0002²µ\u0003\u0002\u0002\u0002³±\u0003\u0002\u0002\u0002³´\u0003\u0002\u0002\u0002´%\u0003\u0002\u0002\u0002µ³\u0003\u0002\u0002\u0002¶»\u0005(\u0015\u0002·¸\t\u0005\u0002\u0002¸º\u0005(\u0015\u0002¹·\u0003\u0002\u0002\u0002º½\u0003\u0002\u0002\u0002»¹\u0003\u0002\u0002\u0002»¼\u0003\u0002\u0002\u0002¼'\u0003\u0002\u0002\u0002½»\u0003\u0002\u0002\u0002¾Ã\u0005*\u0016\u0002¿À\t\u0006\u0002\u0002ÀÂ\u0005*\u0016\u0002Á¿\u0003\u0002\u0002\u0002ÂÅ\u0003\u0002\u0002\u0002ÃÁ\u0003\u0002\u0002\u0002ÃÄ\u0003\u0002\u0002\u0002Ä)\u0003\u0002\u0002\u0002ÅÃ\u0003\u0002\u0002\u0002ÆÉ\u0005,\u0017\u0002ÇÈ\t\u0007\u0002\u0002ÈÊ\u0005*\u0016\u0002ÉÇ\u0003\u0002\u0002\u0002ÉÊ\u0003\u0002\u0002\u0002Ê+\u0003\u0002\u0002\u0002ËÍ\u0007\u0010\u0002\u0002ÌË\u0003\u0002\u0002\u0002ÌÍ\u0003\u0002\u0002\u0002ÍÎ\u0003\u0002\u0002\u0002ÎÏ\u0005\u001a\u000e\u0002Ï-\u0003\u0002\u0002\u0002ÐÓ\u00056\u001c\u0002ÑÒ\u0007%\u0002\u0002ÒÔ\u00056\u001c\u0002ÓÑ\u0003\u0002\u0002\u0002ÓÔ\u0003\u0002\u0002\u0002Ô/\u0003\u0002\u0002\u0002ÕÖ\u0005.\u0018\u0002Ö1\u0003\u0002\u0002\u0002×Ø\u0007\u0006\u0002\u0002ØÙ\u0005.\u0018\u0002Ù3\u0003\u0002\u0002\u0002Úá\u0007\u0013\u0002\u0002ÛÜ\u00056\u001c\u0002ÜÝ\u0007%\u0002\u0002ÝÞ\u0007\u0013\u0002\u0002Þá\u0003\u0002\u0002\u0002ßá\u0005.\u0018\u0002àÚ\u0003\u0002\u0002\u0002àÛ\u0003\u0002\u0002\u0002àß\u0003\u0002\u0002\u0002á5\u0003\u0002\u0002\u0002âã\t\b\u0002\u0002ã7\u0003\u0002\u0002\u0002\u001a<FNRWYcu~\u0081\u0088\u008d\u0093\u0095\u009b£«³»ÃÉÌÓà";
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۥۥ, reason: not valid java name and contains not printable characters */
    public static Charset m4807() {
        if (C0016.m3596() <= 0) {
            return com.github.catvod.spider.merge.R0.a.a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۧۥ, reason: not valid java name and contains not printable characters */
    public static int m4808(Object obj, Object obj2, int i, int i2) {
        if (C0029.m5282() >= 0) {
            return ((FileInputStream) obj).read((byte[]) obj2, i, i2);
        }
        return 0;
    }

    /* renamed from: ۣۣ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static String m4809(Object obj) {
        if (C0002.m1242() > 0) {
            return ((h) obj).i();
        }
        return null;
    }

    /* renamed from: ۟ۤۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m4810(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0049.m8038() < 0) {
            return ((C0259u) obj).f((String) obj2, (String) obj3, (String) obj4);
        }
        return null;
    }

    /* renamed from: ۟ۤۢۧۡ, reason: not valid java name and contains not printable characters */
    public static Object[] m4811() {
        if (C0033.m5872() > 0) {
            return C0281k.f;
        }
        return null;
    }

    /* renamed from: ۟ۤۦۤۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.H.b m4812(Object obj) {
        if (C0018.m3956() > 0) {
            return ((com.github.catvod.spider.merge.H.a) obj).a();
        }
        return null;
    }

    /* renamed from: ۟ۤۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Set m4813(Object obj) {
        if (C0004.m1557() <= 0) {
            return ((TreeMap) obj).entrySet();
        }
        return null;
    }

    /* renamed from: ۟ۤۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m4814(Object obj) {
        if (C0026.m4977() <= 0) {
            return ((r) obj).u();
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۨۡ, reason: not valid java name and contains not printable characters */
    public static void m4815(Object obj, Object obj2, Object obj3) {
        if (C0016.m3596() < 0) {
            ((UC) obj).init((Context) obj2, (String) obj3);
        }
    }

    /* renamed from: ۟ۤۨۤۢ, reason: not valid java name and contains not printable characters */
    public static void m4816(Object obj, Object obj2) {
        if (C0019.m4065() < 0) {
            ((Thread) obj).setName((String) obj2);
        }
    }

    /* renamed from: ۟ۥ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m4817(Object obj, int i) {
        if (C0049.m8038() < 0) {
            return ((Random) obj).nextInt(i);
        }
        return 0;
    }

    /* renamed from: ۟ۥ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static WebView m4818(Object obj) {
        if (C0016.m3596() < 0) {
            return v.d((Activity) obj);
        }
        return null;
    }

    /* renamed from: ۟ۥ۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static int m4819(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۟ۥۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4820(Object obj, int i, Object obj2) {
        if (C0049.m8038() < 0) {
            return ((List) obj).addAll(i, (Collection) obj2);
        }
        return false;
    }

    /* renamed from: ۟ۥۣۨۨ, reason: not valid java name and contains not printable characters */
    public static l m4821(Object obj, Object obj2) {
        if (C0038.m6471() > 0) {
            return C0120c.b((N) obj, (l) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۢۡۤ, reason: not valid java name and contains not printable characters */
    public static String m4822(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((XBPQb) obj).e;
        }
        return null;
    }

    /* renamed from: ۟ۦۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4823(Object obj) {
        if (C0059.m9257() <= 0) {
            return ((com.github.catvod.spider.merge.N0.b) obj).c;
        }
        return false;
    }

    /* renamed from: ۟ۦۦ۟۟, reason: not valid java name and contains not printable characters */
    public static int m4824(Object obj, int i) {
        if (C0037.m6350() < 0) {
            return ((Calendar) obj).getMaximum(i);
        }
        return 0;
    }

    /* renamed from: ۟ۦۨۤۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.W.h m4825(Object obj) {
        if (C0063.m9589() <= 0) {
            return ((C0228d) obj).g;
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۢ۟, reason: not valid java name and contains not printable characters */
    public static String m4826() {
        if (C0024.m4693() < 0) {
            return "            </div>\n        </div>\n    </div>\n\n<script>\nfunction sendBackgroundRequest() {\n    // 获取wifiIP（假设该变量已在其他地方定义）\n    const url = `";
        }
        return null;
    }

    /* renamed from: ۟ۧۤۦۡ, reason: not valid java name and contains not printable characters */
    public static Pattern m4827(Object obj) {
        if (C0017.m3633() < 0) {
            return ((Mogg) obj).h;
        }
        return null;
    }

    /* renamed from: ۟ۧۧۡۧ, reason: not valid java name and contains not printable characters */
    public static String m4828(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0048.m7971() > 0) {
            return ((HB360) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m4829(Object obj) {
        if (C0039.m6529() < 0) {
            Init.execute((Runnable) obj);
        }
    }

    /* renamed from: ۣ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static String m4830(Object obj) {
        if (C0060.m9355() > 0) {
            return f.K((String) obj);
        }
        return null;
    }

    /* renamed from: ۠ۡۧۥ, reason: not valid java name and contains not printable characters */
    public static String m4831(Object obj, Object obj2) {
        if (C0029.m5282() > 0) {
            return g.s((ArrayList) obj, (List) obj2);
        }
        return null;
    }

    /* renamed from: ۠ۥۣ۟, reason: not valid java name and contains not printable characters */
    public static String m4832(Object obj, Object obj2) {
        if (C0061.m9359() <= 0) {
            return ((j) obj).a((String) obj2);
        }
        return null;
    }

    /* renamed from: ۠ۥۤۨ, reason: not valid java name and contains not printable characters */
    public static String m4833() {
        if (C0006.m1726() <= 0) {
            return "Anal_MacPlayer";
        }
        return null;
    }

    /* renamed from: ۠ۥۧۢ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.q0.b m4834() {
        if (C0064.m9659() <= 0) {
            return com.github.catvod.spider.merge.q0.b.a;
        }
        return null;
    }

    /* renamed from: ۡ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static String m4835() {
        if (C0063.m9589() <= 0) {
            return "k0";
        }
        return null;
    }

    /* renamed from: ۡ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static void m4836(Object obj, boolean z) {
        if (C0059.m9257() < 0) {
            ((p) obj).g(z);
        }
    }

    /* renamed from: ۡۢۦۧ, reason: not valid java name and contains not printable characters */
    public static Pattern m4837(Object obj) {
        if (C0000.m1116() < 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).O;
        }
        return null;
    }

    /* renamed from: ۣۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m4838(Object obj, int i) {
        if (C0064.m9659() <= 0) {
            ((SparseLongArray) obj).removeAt(i);
        }
    }

    /* renamed from: ۣۡۡ۠, reason: not valid java name and contains not printable characters */
    public static String m4839(String str) {
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

    /* renamed from: ۡۥۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4840(Object obj) {
        if (C0020.m4210() <= 0) {
            return ((AccessibilityNodeInfo) obj).refresh();
        }
        return false;
    }

    /* renamed from: ۡۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static AlertDialog.Builder m4841(Object obj, Object obj2) {
        if (C0055.m8740() > 0) {
            return C0008.m2020((AlertDialog.Builder) obj, (DialogInterfaceOnDismissListenerC0243d) obj2);
        }
        return null;
    }

    /* renamed from: ۡۨۢۧ, reason: not valid java name and contains not printable characters */
    public static int m4842(Object obj) {
        if (C0024.m4693() < 0) {
            return ((com.github.catvod.spider.merge.C.b) obj).f;
        }
        return 0;
    }

    /* renamed from: ۢۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static AccessibilityWindowInfo m4843(Object obj) {
        if (C0000.m1116() <= 0) {
            return ((AccessibilityNodeInfo) obj).getWindow();
        }
        return null;
    }

    /* renamed from: ۣۢ۠۠, reason: not valid java name and contains not printable characters */
    public static int m4844(Object obj) {
        if (C0043.m7332() > 0) {
            return ((RunnableC0336p) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣۢۦۦ, reason: not valid java name and contains not printable characters */
    public static String m4845(Object obj) {
        if (C0002.m1242() > 0) {
            return ((C0254o) obj).k();
        }
        return null;
    }

    /* renamed from: ۣۣۢۢ, reason: not valid java name and contains not printable characters */
    public static int m4846(Object obj, Object obj2, int i, int i2) {
        if (C0041.m6823() <= 0) {
            return ((InputStream) obj).read((byte[]) obj2, i, i2);
        }
        return 0;
    }

    /* renamed from: ۣۧۥ, reason: not valid java name and contains not printable characters */
    public static int m4847(Object obj) {
        if (C0057.m9017() >= 0) {
            return ((i) obj).b;
        }
        return 0;
    }

    /* renamed from: ۤ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m4848(Object obj, Object obj2, Object obj3) {
        if (C0021.m4379() >= 0) {
            return ((AttributeSet) obj).getAttributeValue((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۤۡۡۤ, reason: not valid java name and contains not printable characters */
    public static String m4849() {
        if (C0013.m3167() > 0) {
            return "浏览器";
        }
        return null;
    }

    /* renamed from: ۣۣۤۡ, reason: not valid java name and contains not printable characters */
    public static EditText m4850(Object obj) {
        if (C0030.m5375() >= 0) {
            return ((DialogInterfaceOnClickListenerC0319H) obj).f;
        }
        return null;
    }

    /* renamed from: ۤۤۥۦ, reason: not valid java name and contains not printable characters */
    public static String m4851() {
        if (C0007.m1886() >= 0) {
            return "/proxy?do=seachdanmu&go=dianshisaoma')\n                .then(r => r.text())\n                .then(text => showStatus(text || '✅ 扫码请求已发送，请打开电视端扫码', 'success'))\n                .catch(() => showStatus('❌ 推送失败，请检查服务是否运行', 'failure'));\n        }\n\n        // 切换弹幕面板\n        toggleDanmuBtn.addEventListener('click', toggleDanmuPanel);\n        \n        function toggleDanmuPanel() {\n            if (isPanelVisible) {\n                // 隐藏面板并从DOM中移除\n                if (danmuPanel && danmuPanel.parentNode) {\n                    danmuPanel.parentNode.removeChild(danmuPanel);\n                }\n                danmuPanel = null;\n                toggleDanmuBtn.innerHTML = '<i class=\"fas fa-comment-dots\"></i> 发弹幕';\n            } else {\n                // 创建并显示面板\n                createDanmuPanel();\n                toggleDanmuBtn.innerHTML = '<i class=\"fas fa-eye-slash\"></i> 隐藏面板';\n            }\n            isPanelVisible = !isPanelVisible;\n        }\n        \n        // 创建弹幕面板\n        function createDanmuPanel() {\n            // 创建面板容器\n            danmuPanel = document.createElement('div');\n            danmuPanel.id = 'danmuPanel';\n            \n            // 设置面板内容\ndanmuPanel.innerHTML = `\n                <label for=\"danmuUsername\" style=\"display: inline-block; font-size: 13px; width: 100px;\">弹幕内容：</label>\n                <textarea id=\"danmuMessage\" placeholder=\"输入弹幕内容\" rows=\"2\" tabindex=\"0\"></textarea>\n                <div style=\"margin-bottom: 8px; font-size: 13px;\">\n                    <label for=\"danmuUsername\" style=\"display: inline-block; width: 50px;\">昵称：</label>\n                    <input type=\"text\" id=\"danmuUsername\" placeholder=\"输入昵称\" value=\"";
        }
        return null;
    }

    /* renamed from: ۤۥۣۣ, reason: not valid java name and contains not printable characters */
    public static HashMap m4852() {
        if (C0052.m8320() > 0) {
            return NG.a();
        }
        return null;
    }

    /* renamed from: ۤۥۤۡ, reason: not valid java name and contains not printable characters */
    public static String m4853(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0037.m6350() < 0) {
            return ((P123) obj).playerContent((String) obj2, (String) obj3, (List) obj4);
        }
        return null;
    }

    /* renamed from: ۤۥۨ۠, reason: not valid java name and contains not printable characters */
    public static float m4854(Object obj, int i) {
        if (C0037.m6350() < 0) {
            return ((GnssStatus) obj).getElevationDegrees(i);
        }
        return 0.0f;
    }

    /* renamed from: ۥۣ۟ۤ, reason: contains not printable characters */
    public static DragStartHelper m4855(Object obj) {
        if (C0028.m5152() <= 0) {
            return ((ViewOnTouchListenerC0399c) obj).a;
        }
        return null;
    }

    /* renamed from: ۥ۟ۧ۠, reason: contains not printable characters */
    public static String m4856() {
        if (C0006.m1726() < 0) {
            return ".*(https?\\://[^/]+)/.*";
        }
        return null;
    }

    /* renamed from: ۥۥۣۢ, reason: contains not printable characters */
    public static int m4857(Object obj) {
        if (C0006.m1726() <= 0) {
            return ((C0340u) obj).i;
        }
        return 0;
    }

    /* renamed from: ۥۧ۟ۤ, reason: contains not printable characters */
    public static View m4858(Object obj) {
        if (C0054.m8557() < 0) {
            return ((C0228d) obj).d;
        }
        return null;
    }

    /* renamed from: ۥۨۦۡ, reason: contains not printable characters */
    public static d m4859(Object obj) {
        if (C0043.m7332() > 0) {
            return ((d) obj).d();
        }
        return null;
    }

    /* renamed from: ۦ۟ۡ۠, reason: contains not printable characters */
    public static String m4860(Object obj) {
        if (C0023.m4566() < 0) {
            return ((com.github.catvod.spider.merge.M.d) obj).a();
        }
        return null;
    }

    /* renamed from: ۦ۠۟ۤ, reason: contains not printable characters */
    public static void m4861(Object obj) {
        if (C0000.m1116() < 0) {
            ((com.github.catvod.spider.merge.l0.h) obj).a();
        }
    }

    /* renamed from: ۦ۠ۧۡ, reason: contains not printable characters */
    public static Future m4862(Object obj) {
        if (C0055.m8740() > 0) {
            return ((ExecutorCompletionService) obj).take();
        }
        return null;
    }

    /* renamed from: ۦۣۣۨ, reason: contains not printable characters */
    public static String m4863() {
        if (C0039.m6529() < 0) {
            return "//a";
        }
        return null;
    }

    /* renamed from: ۧ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static String m4864() {
        if (C0028.m5152() < 0) {
            return "简介";
        }
        return null;
    }

    /* renamed from: ۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Map m4865(Object obj) {
        if (C0008.m1975() >= 0) {
            return ((URLConnection) obj).getHeaderFields();
        }
        return null;
    }

    /* renamed from: ۧۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m4866(Object obj, Object obj2) {
        if (C0042.m7147() <= 0) {
            return ((ApplvDV2) obj).c((String) obj2);
        }
        return null;
    }

    /* renamed from: ۧۢۢۢ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.G0.b[] m4867(Object obj) {
        if (C0056.m8886() <= 0) {
            return ((C0166x) obj).h;
        }
        return null;
    }

    /* renamed from: ۧۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Object m4868(Object obj, Object obj2, Object obj3) {
        if (C0006.m1726() < 0) {
            return ((C0281k) obj).getOrDefault(obj2, obj3);
        }
        return null;
    }

    /* renamed from: ۧۤۦۡ, reason: not valid java name and contains not printable characters */
    public static void m4869(Object obj, Object obj2) {
        if (C0007.m1886() > 0) {
            C0033.m5786((Activity) obj, (String[]) obj2, 9999);
        }
    }

    /* renamed from: ۧۨۦۨ, reason: not valid java name and contains not printable characters */
    public static Date m4870(Object obj) {
        if (C0010.m2320() < 0) {
            return ((com.github.catvod.spider.merge.Y0.b) obj).b();
        }
        return null;
    }

    /* renamed from: ۣۨۡ۠, reason: not valid java name and contains not printable characters */
    public static C0163u m4871(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((com.github.catvod.spider.merge.T0.h) obj).k;
        }
        return null;
    }

    /* renamed from: ۣۣۣۨ, reason: not valid java name and contains not printable characters */
    public static int m4872(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((RunnableC0237F) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣۨۧۢ, reason: not valid java name and contains not printable characters */
    public static void m4873(Object obj) {
        if (C0028.m5152() < 0) {
            ((A) obj).l();
        }
    }

    /* renamed from: ۣۨۨۤ, reason: not valid java name and contains not printable characters */
    public static int m4874(Object obj) {
        if (C0006.m1726() <= 0) {
            return ((Buffer) obj).position();
        }
        return 0;
    }

    /* renamed from: ۨۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4875(Object obj) {
        if (C0005.m1599() <= 0) {
            return ((Future) obj).isDone();
        }
        return false;
    }

    /* renamed from: ۣۣ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static String m4795(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}