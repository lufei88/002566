package com.github.catvod.spider.merge.V;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Path;
import android.location.GnssStatus;
import android.net.Uri;
import android.os.Handler;
import android.text.PrecomputedText;
import android.text.TextPaint;
import android.util.Half;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import com.github.catvod.spider.AppZzun;
import com.github.catvod.spider.BilibiliLive;
import com.github.catvod.spider.HBcms10;
import com.github.catvod.spider.HBv1Class;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.NG;
import com.github.catvod.spider.merge.F0.C0150g;
import com.github.catvod.spider.merge.F0.d0;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.q;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.T0.t;
import com.github.catvod.spider.merge.U0.I;
import com.github.catvod.spider.merge.V0.l;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.C0228d;
import com.github.catvod.spider.merge.X0.A;
import com.github.catvod.spider.merge.X0.h;
import com.github.catvod.spider.merge.X0.z;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0246g;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.DialogInterfaceOnClickListenerC0257s;
import com.github.catvod.spider.merge.a0.M;
import com.github.catvod.spider.merge.a0.W;
import com.github.catvod.spider.merge.a0.y;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.a1.k;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e0.C0286e;
import com.github.catvod.spider.merge.e0.C0288g;
import com.github.catvod.spider.merge.f.AbstractC0296g;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f.C0295f;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f0.RunnableC0301d;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.e;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0314C;
import com.github.catvod.spider.merge.h0.C0315D;
import com.github.catvod.spider.merge.h0.C0335o;
import com.github.catvod.spider.merge.h0.x;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.P.C;
import com.github.catvod.spider.p000mergexbpq.P.r;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.S.j;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.d;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.c0.n;
import com.github.catvod.spider.p000mergexbpq.d.g;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.URL;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import org.json.JSONArray;

/* renamed from: com.github.catvod.spider.merge.V.۟ۤ۟ۢۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0031 {

    /* renamed from: ۟ۤۧۡۦ, reason: not valid java name and contains not printable characters */
    public static int f629 = -618;

    /* renamed from: ۟۟۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static int m5562(Object obj) {
        if (C0040.m6582() >= 0) {
            return ((C0228d) obj).f;
        }
        return 0;
    }

    /* renamed from: ۣ۟۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m5563(Object obj) {
        if (C0047.m7837() >= 0) {
            ((ViewGroup) obj).removeAllViews();
        }
    }

    /* renamed from: ۟۟۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static String m5564(Object obj) {
        if (C0058.m9131() < 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).A;
        }
        return null;
    }

    /* renamed from: ۟۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m5566(Object obj) {
        if (C0007.m1886() > 0) {
            return ((WindowInsets) obj).consumeStableInsets();
        }
        return null;
    }

    /* renamed from: ۟۟ۢۢ۠, reason: not valid java name and contains not printable characters */
    public static String m5567() {
        if (C0051.m8216() <= 0) {
            return "调试->获取筛选出错：";
        }
        return null;
    }

    /* renamed from: ۟۟ۥۣۡ, reason: not valid java name and contains not printable characters */
    public static void m5568(Object obj, Object obj2) {
        if (C0052.m8320() >= 0) {
            Arrays.sort((Object[]) obj, (Comparator) obj2);
        }
    }

    /* renamed from: ۟۟ۥۤ۟, reason: not valid java name and contains not printable characters */
    public static String m5569(Object obj, Object obj2, Object obj3, boolean z) {
        if (C0038.m6471() >= 0) {
            return ((W) obj).l((String) obj2, (String) obj3, z);
        }
        return null;
    }

    /* renamed from: ۟۠۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static String m5570() {
        if (C0057.m9017() >= 0) {
            return ".*#(.*?)\\$";
        }
        return null;
    }

    /* renamed from: ۟۠۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static int m5571(Object obj) {
        if (C0014.m3353() < 0) {
            return ((AccessibilityNodeInfo.CollectionInfo) obj).getColumnCount();
        }
        return 0;
    }

    /* renamed from: ۟۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static Handler m5572(Object obj) {
        if (C0005.m1599() <= 0) {
            return ((Init) obj).b;
        }
        return null;
    }

    /* renamed from: ۟۠ۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m5573(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0015.m3433() >= 0) {
            return e.i((String) obj, (String) obj2, (String) obj3, (String) obj4);
        }
        return null;
    }

    /* renamed from: ۟۠ۧۧۦ, reason: not valid java name and contains not printable characters */
    public static Socket m5574(Object obj, Object obj2, int i) {
        if (C0047.m7837() >= 0) {
            return ((SocketFactory) obj).createSocket((String) obj2, i);
        }
        return null;
    }

    /* renamed from: ۟۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static void m5575(Object obj, boolean z) {
        if (C0024.m4693() < 0) {
            ((AccessibilityNodeInfo) obj).setTextEntryKey(z);
        }
    }

    /* renamed from: ۟۠ۨۤۤ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.RangeInfo m5576(int i, float f, float f2, float f3) {
        if (C0034.m6048() <= 0) {
            return AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3);
        }
        return null;
    }

    /* renamed from: ۟ۡ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m5577(Object obj) {
        if (C0036.m6252() > 0) {
            return ((I) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۡۡۥۦ, reason: not valid java name and contains not printable characters */
    public static String m5578(Object obj) {
        if (C0062.m9429() > 0) {
            return ((com.github.catvod.spider.merge.H0.b) obj).toString();
        }
        return null;
    }

    /* renamed from: ۟ۡۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m5579(Object obj) {
        if (C0050.m8121() <= 0) {
            return ((C0254o) obj).m;
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۦۤ, reason: not valid java name and contains not printable characters */
    public static FrameLayout.LayoutParams m5580(Object obj) {
        if (C0025.m4797() >= 0) {
            return ((C0288g) obj).j;
        }
        return null;
    }

    /* renamed from: ۟ۡۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m5581(Object obj) {
        if (C0063.m9589() <= 0) {
            ((M) obj).c();
        }
    }

    /* renamed from: ۟ۡۥۨ۠, reason: not valid java name and contains not printable characters */
    public static int m5582(Object obj) {
        if (C0002.m1242() > 0) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex();
        }
        return 0;
    }

    /* renamed from: ۟ۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static float m5583(Object obj, int i) {
        if (C0041.m6823() <= 0) {
            return ((GnssStatus) obj).getAzimuthDegrees(i);
        }
        return 0.0f;
    }

    /* renamed from: ۣ۟ۢۤۨ, reason: not valid java name and contains not printable characters */
    public static String m5584(Object obj) {
        if (C0000.m1116() < 0) {
            return ((HBcms10) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۢۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m5585(char c) {
        if (C0029.m5282() >= 0) {
            return Character.getNumericValue(c);
        }
        return 0;
    }

    /* renamed from: ۟ۢۦ۟, reason: not valid java name and contains not printable characters */
    public static String m5586(Object obj, Object obj2, Object obj3) {
        if (C0055.m8740() >= 0) {
            return ((W) obj).f((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۢۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m5587(Object obj) {
        if (C0037.m6350() < 0) {
            ((x) obj).b();
        }
    }

    /* renamed from: ۟ۢۧۢۢ, reason: not valid java name and contains not printable characters */
    public static String m5588(Object obj) {
        if (C0062.m9429() > 0) {
            return Arrays.toString((int[]) obj);
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۧ۠, reason: not valid java name and contains not printable characters */
    public static j m5589(Object obj, int i, Object obj2) {
        if (C0010.m2320() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.Q.a) obj).c(i, (C) obj2);
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static void m5590(Object obj) {
        if (C0042.m7147() <= 0) {
            ((W) obj).d();
        }
    }

    /* renamed from: ۣ۟ۥۦۧ, reason: not valid java name and contains not printable characters */
    public static String m5591(Object obj) {
        if (C0058.m9131() < 0) {
            return BilibiliLive.b((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۤ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static int m5592(Object obj, int i, int i2) {
        if (C0033.m5872() > 0) {
            return ((String) obj).lastIndexOf(i, i2);
        }
        return 0;
    }

    /* renamed from: ۟ۤۦۦۦ, reason: not valid java name and contains not printable characters */
    public static int m5593(Object obj) {
        if (C0002.m1242() >= 0) {
            return ((y) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Pattern m5594() {
        if (C0016.m3596() <= 0) {
            return b.a;
        }
        return null;
    }

    /* renamed from: ۟ۥ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static String m5595(Object obj, Object obj2, Object obj3) {
        if (C0002.m1242() >= 0) {
            return ((String) obj).replaceFirst((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۥۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Object m5596(Object obj, Object obj2) {
        if (C0006.m1726() < 0) {
            return ((h) obj).a((com.github.catvod.spider.merge.Y0.c) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۥ۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static SSLContext m5597(Object obj) {
        if (C0043.m7332() >= 0) {
            return SSLContext.getInstance((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۥۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m5598(Object obj) {
        if (C0038.m6471() > 0) {
            return ((NG.DtIt) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۥۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static List m5599(Object obj) {
        if (C0036.m6252() > 0) {
            return ((com.github.catvod.spider.merge.M.e) obj).e();
        }
        return null;
    }

    /* renamed from: ۟ۥۧۡۨ, reason: not valid java name and contains not printable characters */
    public static int m5600(Object obj) {
        if (C0047.m7837() > 0) {
            return ((com.github.catvod.spider.merge.E0.c) obj).c;
        }
        return 0;
    }

    /* renamed from: ۟ۥۧۦۤ, reason: not valid java name and contains not printable characters */
    public static void m5601(Object obj, Object obj2) {
        if (C0036.m6252() > 0) {
            ((AccessibilityNodeInfo) obj).setViewIdResourceName((String) obj2);
        }
    }

    /* renamed from: ۟ۥۨۥ۠, reason: not valid java name and contains not printable characters */
    public static String m5602(Object obj) {
        if (C0033.m5872() >= 0) {
            return AppZzun.f((JSONArray) obj);
        }
        return null;
    }

    /* renamed from: ۟ۦۡۡ۟, reason: not valid java name and contains not printable characters */
    public static g m5603(Object obj) {
        if (C0049.m8038() < 0) {
            return ((g) obj).g();
        }
        return null;
    }

    /* renamed from: ۟ۦۢۢۡ, reason: not valid java name and contains not printable characters */
    public static Object m5604(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((RunnableC0301d) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۦۢۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m5605(Object obj) {
        if (C0026.m4977() <= 0) {
            return ((com.github.catvod.spider.merge.g1.e) obj).a;
        }
        return false;
    }

    /* renamed from: ۟ۦۥ۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m5606(Object obj) {
        if (C0041.m6823() <= 0) {
            return ((CompoundButton) obj).isChecked();
        }
        return false;
    }

    /* renamed from: ۟ۦۥۢۦ, reason: not valid java name and contains not printable characters */
    public static String m5607() {
        if (C0038.m6471() >= 0) {
            return "m3u8#.mp4#.flv#.mp3#.m4a#magnet:#ed2k:#ftp:#thunder:#push:#tvbox-xg:";
        }
        return null;
    }

    /* renamed from: ۟ۦۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m5608(Object obj, Object obj2, Object obj3) {
        if (C0003.m1463() < 0) {
            ((com.github.catvod.spider.merge.N0.b) obj).a((StringBuffer) obj2, obj3);
        }
    }

    /* renamed from: ۟ۦۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m5609() {
        if (m5628() > 0) {
            return C0150g.d;
        }
        return null;
    }

    /* renamed from: ۟ۦۧۤۤ, reason: not valid java name and contains not printable characters */
    public static m m5610(Object obj, Object obj2) {
        if (C0048.m7971() > 0) {
            return ((m) obj).F((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۧ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static d m5611(Object obj) {
        if (C0016.m3596() <= 0) {
            return ((d) obj).b();
        }
        return null;
    }

    /* renamed from: ۟ۧۡۢۢ, reason: not valid java name and contains not printable characters */
    public static String m5612() {
        if (C0010.m2320() <= 0) {
            return HBv1Class.g;
        }
        return null;
    }

    /* renamed from: ۟ۧۡۥ, reason: not valid java name and contains not printable characters */
    public static URL m5613(Object obj, Object obj2) {
        if (C0053.m8389() > 0) {
            return com.github.catvod.spider.p000mergexbpq.b0.b.h((URL) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m5614(Object obj) {
        if (C0052.m8320() > 0) {
            ((A) obj).z();
        }
    }

    /* renamed from: ۣ۟ۧۧۨ, reason: not valid java name and contains not printable characters */
    public static Uri.Builder m5615(Object obj, Object obj2, Object obj3) {
        if (C0051.m8216() <= 0) {
            return ((Uri.Builder) obj).appendQueryParameter((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۧۤۢۢ, reason: not valid java name and contains not printable characters */
    public static String m5616() {
        if (C0064.m9659() <= 0) {
            return "decrypt()错误-->";
        }
        return null;
    }

    /* renamed from: ۟ۧۤۥ۟, reason: not valid java name and contains not printable characters */
    public static int m5617(Object obj) {
        if (C0054.m8557() < 0) {
            return ((r) obj).i();
        }
        return 0;
    }

    /* renamed from: ۟ۧۤۦۣ, reason: not valid java name and contains not printable characters */
    public static String[] m5618(Object obj) {
        if (C0013.m3167() > 0) {
            return ((DateFormatSymbols) obj).getEras();
        }
        return null;
    }

    /* renamed from: ۟ۧۤۧۧ, reason: not valid java name and contains not printable characters */
    public static void m5619(Object obj, Object obj2) {
        if (C0002.m1242() > 0) {
            ((com.github.catvod.spider.merge.Y0.c) obj).b((com.github.catvod.spider.merge.V0.d) obj2);
        }
    }

    /* renamed from: ۟ۧۦۤ۟, reason: not valid java name and contains not printable characters */
    public static SharedPreferences m5620(Object obj, Object obj2, int i) {
        if (C0046.m7701() > 0) {
            return ((Context) obj).getSharedPreferences((String) obj2, i);
        }
        return null;
    }

    /* renamed from: ۟ۧۧۥۨ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m5621(Object obj) {
        if (C0020.m4210() <= 0) {
            return com.github.catvod.spider.merge.f1.b.g((String) obj);
        }
        return null;
    }

    /* renamed from: ۠۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static int m5622(Object obj, Object obj2, int i) {
        if (C0001.m1164() <= 0) {
            return ((LinkedBlockingQueue) obj).drainTo((Collection) obj2, i);
        }
        return 0;
    }

    /* renamed from: ۠ۥۦۤ, reason: not valid java name and contains not printable characters */
    public static Boolean m5623(Object obj) {
        if (C0022.m4497() >= 0) {
            return ((com.github.catvod.spider.merge.g1.d) obj).c;
        }
        return null;
    }

    /* renamed from: ۠ۦۣ۠, reason: not valid java name and contains not printable characters */
    public static float m5624(Object obj) {
        if (C0003.m1463() <= 0) {
            return ((C0314C) obj).f;
        }
        return 0.0f;
    }

    /* renamed from: ۣۡۡۡ, reason: not valid java name and contains not printable characters */
    public static String m5625(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((com.github.catvod.spider.merge.N0.b) obj).n;
        }
        return null;
    }

    /* renamed from: ۡۢۢۢ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.TouchDelegateInfo m5626(Object obj) {
        if (C0033.m5872() >= 0) {
            return ((AccessibilityNodeInfo) obj).getTouchDelegateInfo();
        }
        return null;
    }

    /* renamed from: ۡۥۥۢ, reason: not valid java name and contains not printable characters */
    public static String m5627(long j) {
        if (C0030.m5375() > 0) {
            return String.valueOf(j);
        }
        return null;
    }

    /* renamed from: ۡۦۣۣ, reason: not valid java name and contains not printable characters */
    public static int m5628() {
        return 286 ^ C0022.f465;
    }

    /* renamed from: ۡۧۡۢ, reason: not valid java name and contains not printable characters */
    public static int m5629(Object obj) {
        if (C0032.m5686() < 0) {
            return ((C0335o) obj).i;
        }
        return 0;
    }

    /* renamed from: ۡۧۨ, reason: not valid java name and contains not printable characters */
    public static String m5630(Object obj, Object obj2, Object obj3, boolean z) {
        if (C0048.m7971() > 0) {
            return ((C0246g) obj).b((String) obj2, (String) obj3, z);
        }
        return null;
    }

    /* renamed from: ۡۨۤۡ, reason: not valid java name and contains not printable characters */
    public static Thread m5631() {
        if (C0024.m4693() < 0) {
            return Thread.currentThread();
        }
        return null;
    }

    /* renamed from: ۡۨۥۧ, reason: not valid java name and contains not printable characters */
    public static int m5632(int i, Object obj) {
        if (C0021.m4379() >= 0) {
            return com.github.catvod.spider.merge.Z0.b.c(i, obj);
        }
        return 0;
    }

    /* renamed from: ۢۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Pattern m5633(Object obj) {
        if (C0027.m5017() >= 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).I;
        }
        return null;
    }

    /* renamed from: ۣ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static Half m5634(float f) {
        if (C0011.m2755() > 0) {
            return Half.valueOf(f);
        }
        return null;
    }

    /* renamed from: ۣۣۢۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.c0.g m5635(Object obj) {
        if (C0022.m4497() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.g) obj).a();
        }
        return null;
    }

    /* renamed from: ۣۢۧ, reason: not valid java name and contains not printable characters */
    public static int m5636(Object obj) {
        if (C0057.m9017() > 0) {
            return ((com.github.catvod.spider.merge.H0.e) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣۣۧۨ, reason: not valid java name and contains not printable characters */
    public static String m5637(String str) {
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

    /* renamed from: ۣۤۤ۟, reason: not valid java name and contains not printable characters */
    public static int m5638(Object obj, Object obj2) {
        if (C0044.m7508() <= 0) {
            return n.c((String) obj, (int[]) obj2);
        }
        return 0;
    }

    /* renamed from: ۣۧۡۢ, reason: not valid java name and contains not printable characters */
    public static Collection m5639(Object obj) {
        if (C0012.m3024() >= 0) {
            return ((HashMap) obj).values();
        }
        return null;
    }

    /* renamed from: ۤ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static String m5640() {
        if (C0044.m7508() <= 0) {
            return "调试->免嗅出错：";
        }
        return null;
    }

    /* renamed from: ۤ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static Object m5641(Object obj, Object obj2) {
        if (C0030.m5375() >= 0) {
            return ((z) obj).a((com.github.catvod.spider.merge.Y0.c) obj2);
        }
        return null;
    }

    /* renamed from: ۣۤۡۥ, reason: not valid java name and contains not printable characters */
    public static String m5642(Object obj) {
        if (C0039.m6529() < 0) {
            return ((NetworkInterface) obj).getName();
        }
        return null;
    }

    /* renamed from: ۤۡۦ۠, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.W.A m5643(Object obj) {
        if (C0033.m5872() > 0) {
            return ((C0315D) obj).a;
        }
        return null;
    }

    /* renamed from: ۤۢۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m5644(Object obj, Object obj2) {
        if (C0023.m4566() <= 0) {
            return ((LinkedList) obj).add(obj2);
        }
        return false;
    }

    /* renamed from: ۣۣۤۤ, reason: not valid java name and contains not printable characters */
    public static String m5645() {
        if (C0052.m8320() > 0) {
            return "dtActor";
        }
        return null;
    }

    /* renamed from: ۤۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m5646(Object obj) {
        if (C0043.m7332() > 0) {
            return t.B((StringBuilder) obj);
        }
        return false;
    }

    /* renamed from: ۤۦۣۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5647(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0057.m9017() > 0) {
            return ((k) obj).c((AbstractC0296g) obj2, (C0295f) obj3, (C0295f) obj4);
        }
        return false;
    }

    /* renamed from: ۣۣۤۨ, reason: not valid java name and contains not printable characters */
    public static String m5648(Object obj) {
        if (C0026.m4977() <= 0) {
            return ((l) obj).c();
        }
        return null;
    }

    /* renamed from: ۥۡۤۡ, reason: contains not printable characters */
    public static long m5649(Object obj) {
        if (C0011.m2755() > 0) {
            return ((Long) obj).longValue();
        }
        return 0L;
    }

    /* renamed from: ۥۡۦۣ, reason: contains not printable characters */
    public static Object m5650(Object obj, Object obj2) {
        if (C0016.m3596() < 0) {
            return ((IdentityHashMap) obj).get(obj2);
        }
        return null;
    }

    /* renamed from: ۥۣۦ, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.U.b m5651() {
        if (C0022.m4497() > 0) {
            return com.github.catvod.spider.merge.U.a.b;
        }
        return null;
    }

    /* renamed from: ۥۤۡۥ, reason: contains not printable characters */
    public static Application m5652() {
        if (C0056.m8886() < 0) {
            return Init.context();
        }
        return null;
    }

    /* renamed from: ۥۤۢۢ, reason: contains not printable characters */
    public static String m5653() {
        if (C0013.m3167() > 0) {
            return "?";
        }
        return null;
    }

    /* renamed from: ۥۨۨۡ, reason: contains not printable characters */
    public static void m5654(Object obj) {
        if (C0030.m5375() > 0) {
            ((com.github.catvod.spider.merge.B.l) obj).f();
        }
    }

    /* renamed from: ۦ۟ۦۡ, reason: contains not printable characters */
    public static Object m5655(Object obj, Object obj2, Object obj3) {
        if (C0038.m6471() >= 0) {
            return ((ConcurrentHashMap) obj).putIfAbsent(obj2, obj3);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge-xbpq.Q.r0>] */
    /* renamed from: ۦۡ۟ۤ, reason: contains not printable characters */
    public static ArrayList m5656(Object obj) {
        if (C0003.m1463() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.Q.a) obj).i;
        }
        return null;
    }

    /* renamed from: ۦۢۤۨ, reason: contains not printable characters */
    public static int m5657(Object obj) {
        if (C0052.m8320() > 0) {
            return ((com.github.catvod.spider.merge.E0.d) obj).g;
        }
        return 0;
    }

    /* renamed from: ۦۢۦۤ, reason: contains not printable characters */
    public static SeekBar m5658(Object obj) {
        if (C0025.m4797() >= 0) {
            return ((C0228d) obj).c;
        }
        return null;
    }

    /* renamed from: ۦۤۡ۠, reason: contains not printable characters */
    public static int m5659(Object obj, int i) {
        if (C0056.m8886() <= 0) {
            return ((BitSet) obj).nextSetBit(i);
        }
        return 0;
    }

    /* renamed from: ۧ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static int m5660(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۧۥ۠۠, reason: not valid java name and contains not printable characters */
    public static void m5661(Object obj, Object obj2, long j) {
        if (C0057.m9017() > 0) {
            ((com.github.catvod.spider.merge.l0.j) obj).e((OutputStream) obj2, j);
        }
    }

    /* renamed from: ۧۥۢۦ, reason: not valid java name and contains not printable characters */
    public static EditText m5662(Object obj) {
        if (C0007.m1886() >= 0) {
            return ((DialogInterfaceOnClickListenerC0257s) obj).c;
        }
        return null;
    }

    /* renamed from: ۧۦۤۦ, reason: not valid java name and contains not printable characters */
    public static ArrayList m5663(Object obj) {
        if (C0062.m9429() > 0) {
            return ((com.github.catvod.spider.merge.U.n) obj).b;
        }
        return null;
    }

    /* renamed from: ۧۨ۠, reason: not valid java name and contains not printable characters */
    public static Path m5664(Object obj) {
        if (C0050.m8121() < 0) {
            return ((C0286e) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۨۢۡ, reason: not valid java name and contains not printable characters */
    public static TextPaint m5665(Object obj) {
        if (C0000.m1116() <= 0) {
            return ((PrecomputedText.Params) obj).getTextPaint();
        }
        return null;
    }

    /* renamed from: ۨۢۨۦ, reason: not valid java name and contains not printable characters */
    public static int m5666(Object obj) {
        if (C0052.m8320() >= 0) {
            return ((com.github.catvod.spider.merge.E0.d) obj).c;
        }
        return 0;
    }

    /* renamed from: ۨۦۤۢ, reason: not valid java name and contains not printable characters */
    public static List m5667(Object obj) {
        if (C0013.m3167() >= 0) {
            return d0.a((HashSet) obj);
        }
        return null;
    }

    /* renamed from: ۣۨۨۢ, reason: not valid java name and contains not printable characters */
    public static q m5668() {
        if (C0011.m2755() > 0) {
            return q.d;
        }
        return null;
    }

    /* renamed from: ۨۨۨۢ, reason: not valid java name and contains not printable characters */
    public static Collection m5669(Object obj) {
        if (C0060.m9355() > 0) {
            return ((ConcurrentHashMap) obj).values();
        }
        return null;
    }

    /* renamed from: ۟۟ۡۡۡ, reason: not valid java name and contains not printable characters */
    public static String m5565(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}