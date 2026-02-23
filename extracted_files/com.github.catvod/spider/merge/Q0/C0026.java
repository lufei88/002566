package com.github.catvod.spider.merge.Q0;

import android.app.Person;
import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Parcel;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.CookieManager;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.util.Predicate;
import com.github.catvod.spider.ApplvDV2;
import com.github.catvod.spider.FishHxq;
import com.github.catvod.spider.HBhaiM;
import com.github.catvod.spider.HBsuipian;
import com.github.catvod.spider.Mogg;
import com.github.catvod.spider.NG;
import com.github.catvod.spider.UC;
import com.github.catvod.spider.merge.E0.p;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0147d;
import com.github.catvod.spider.merge.F0.C0165w;
import com.github.catvod.spider.merge.F0.C0166x;
import com.github.catvod.spider.merge.F0.F;
import com.github.catvod.spider.merge.F0.G;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.G0.d;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.O.b;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.k;
import com.github.catvod.spider.merge.P0.n;
import com.github.catvod.spider.merge.P0.q;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.U.m;
import com.github.catvod.spider.merge.U0.C0174a;
import com.github.catvod.spider.merge.U0.M;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.c;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.C0229e;
import com.github.catvod.spider.merge.W.w;
import com.github.catvod.spider.merge.W.x;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.DialogInterfaceOnClickListenerC0248i;
import com.github.catvod.spider.merge.a0.S;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.C0273c;
import com.github.catvod.spider.merge.e.C0279i;
import com.github.catvod.spider.merge.f.AbstractC0296g;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f.C0295f;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.e;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.AbstractC0376b;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.InterfaceC0416b;
import com.github.catvod.spider.p000mergexbpq.P.B;
import com.github.catvod.spider.p000mergexbpq.P.C;
import com.github.catvod.spider.p000mergexbpq.P.s;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.Q.l0;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b.j;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c.g;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.j.l;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.r.EnumC0143b;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.github.catvod.spider.p000mergexbpq.x.f;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.zip.Inflater;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.Q0.ۨۦۤۤ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0026 {

    /* renamed from: ۣۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static int f490 = -445;

    /* renamed from: ۟۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static int m4876(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((k) obj).b;
        }
        return 0;
    }

    /* renamed from: ۣ۟۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static void m4877(Object obj, int i) {
        if (C0040.m6582() > 0) {
            ((TextView) obj).setHintTextColor(i);
        }
    }

    /* renamed from: ۟۠۟۠۠, reason: not valid java name and contains not printable characters */
    public static void m4878(Object obj, int i) {
        if (C0061.m9359() < 0) {
            ((TextView) obj).setTextColor(i);
        }
    }

    /* renamed from: ۟۠۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static String m4879(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0057.m9017() >= 0) {
            return ((c) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟۠ۡ۟۠, reason: not valid java name and contains not printable characters */
    public static boolean m4880(Object obj, boolean z) {
        if (C0032.m5686() <= 0) {
            return ((File) obj).setWritable(z);
        }
        return false;
    }

    /* renamed from: ۣۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m4881(Object obj) {
        if (C0057.m9017() > 0) {
            return ((M) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۡ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static Pattern m4882(Object obj) {
        if (C0031.m5628() > 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).o0;
        }
        return null;
    }

    /* renamed from: ۟ۡۢۤۧ, reason: not valid java name and contains not printable characters */
    public static Double m4883(Object obj) {
        if (C0041.m6823() < 0) {
            return ((b) obj).f;
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۢۢ, reason: not valid java name and contains not printable characters */
    public static JSONObject m4884(Object obj, Object obj2, Object obj3) {
        if (C0036.m6252() > 0) {
            return ApplvDV2.fixJsonVodHeader((JSONObject) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۡۤۡۡ, reason: not valid java name and contains not printable characters */
    public static Object m4885(Object obj, Object obj2) {
        if (C0040.m6582() > 0) {
            return ((AbstractMap) obj).remove(obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۦۢۡ, reason: not valid java name and contains not printable characters */
    public static LocaleList m4886(Object obj) {
        if (C0061.m9359() <= 0) {
            return ((TextPaint) obj).getTextLocales();
        }
        return null;
    }

    /* renamed from: ۟ۡۧۥ۠, reason: not valid java name and contains not printable characters */
    public static Set m4887(Object obj) {
        if (C0044.m7508() <= 0) {
            return ((Map) obj).keySet();
        }
        return null;
    }

    /* renamed from: ۣ۟ۢ۟۠, reason: not valid java name and contains not printable characters */
    public static int m4888(Object obj) {
        if (C0014.m3353() <= 0) {
            return ((DialogInterfaceOnClickListenerC0248i) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۢ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static String m4889() {
        if (C0015.m3433() >= 0) {
            return "ManualSniffer";
        }
        return null;
    }

    /* renamed from: ۟ۢ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static F m4890() {
        if (C0044.m7508() <= 0) {
            return F.c;
        }
        return null;
    }

    /* renamed from: ۟ۢۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static d m4891(Object obj) {
        if (C0011.m2755() >= 0) {
            return ((C0165w) obj).d;
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۨ۠, reason: not valid java name and contains not printable characters */
    public static void m4892(Object obj, Object obj2) {
        if (C0023.m4566() < 0) {
            ((com.github.catvod.spider.merge.X.a) obj).b((String) obj2);
        }
    }

    /* renamed from: ۣ۟ۢۤۧ, reason: not valid java name and contains not printable characters */
    public static int m4893(Object obj) {
        if (C0053.m8389() >= 0) {
            return ((j) obj).c;
        }
        return 0;
    }

    /* renamed from: ۟ۢۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Map m4894() {
        if (C0014.m3353() < 0) {
            return com.github.catvod.spider.merge.w0.d.b;
        }
        return null;
    }

    /* renamed from: ۟ۢۦۣۦ, reason: not valid java name and contains not printable characters */
    public static List m4895(Object obj) {
        if (C0007.m1886() >= 0) {
            return ((AccessibilityNodeInfo) obj).getActionList();
        }
        return null;
    }

    /* renamed from: ۟ۢۧۨۧ, reason: not valid java name and contains not printable characters */
    public static C0295f m4896() {
        if (C0029.m5282() > 0) {
            return C0295f.c;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static int m4897(Object obj) {
        if (C0051.m8216() < 0) {
            return ((ViewGroup) obj).getChildCount();
        }
        return 0;
    }

    /* renamed from: ۣۣ۟۠۠, reason: not valid java name and contains not printable characters */
    public static int m4898(Object obj, Object obj2) {
        if (C0038.m6471() > 0) {
            return ((C0273c) obj).indexOf(obj2);
        }
        return 0;
    }

    /* renamed from: ۣ۟ۥ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Handler m4899(Object obj) {
        if (C0008.m1975() >= 0) {
            return ((x) obj).h;
        }
        return null;
    }

    /* renamed from: ۣ۟ۦۥ۠, reason: not valid java name and contains not printable characters */
    public static float m4900(long j) {
        if (C0011.m2755() >= 0) {
            return Color.alpha(j);
        }
        return 0.0f;
    }

    /* renamed from: ۣۣ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static Handler m4901(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((w) obj).h;
        }
        return null;
    }

    /* renamed from: ۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m4902(Object obj, Object obj2) {
        if (C0001.m1164() <= 0) {
            return e.n((String) obj, (HashMap) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m4903(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((UUID) obj).toString();
        }
        return null;
    }

    /* renamed from: ۟ۤۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4904(Object obj) {
        if (C0059.m9257() < 0) {
            return ((NG.Rst) obj).isSuccess();
        }
        return false;
    }

    /* renamed from: ۟ۤۡ۠, reason: not valid java name and contains not printable characters */
    public static Drawable.ConstantState m4905(Object obj) {
        if (C0055.m8740() > 0) {
            return ((Drawable) obj).getConstantState();
        }
        return null;
    }

    /* renamed from: ۟ۤۥۣ۠, reason: not valid java name and contains not printable characters */
    public static String m4906() {
        if (C0050.m8121() < 0) {
            return "播放标题";
        }
        return null;
    }

    /* renamed from: ۟ۥ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static int m4907(Object obj) {
        if (C0048.m7971() > 0) {
            return ((NG.Rst) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۥۢۧۨ, reason: not valid java name and contains not printable characters */
    public static SeekBar m4908(Object obj) {
        if (C0051.m8216() < 0) {
            return ((C0229e) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۥۥۣۢ, reason: not valid java name and contains not printable characters */
    public static ShortcutInfo.Builder m4909(Object obj, Object obj2) {
        if (C0008.m1975() >= 0) {
            return ((ShortcutInfo.Builder) obj).setPersons((Person[]) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦ۠۠۟, reason: not valid java name and contains not printable characters */
    public static int m4910(Object obj) {
        if (C0051.m8216() <= 0) {
            return ((com.github.catvod.spider.merge.f1.c) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۦ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static AtomicReference m4911(Object obj) {
        if (C0009.m2047() > 0) {
            return ((m) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۦۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.Y0.a m4912(Object obj) {
        if (C0058.m9131() <= 0) {
            return ((com.github.catvod.spider.merge.Y0.c) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۦۦۡۡ, reason: not valid java name and contains not printable characters */
    public static void m4913(Object obj, Object obj2) {
        if (C0010.m2320() < 0) {
            ((g) obj).e((String) obj2);
        }
    }

    /* renamed from: ۟ۦۦۤۤ, reason: not valid java name and contains not printable characters */
    public static ArrayList m4914(Object obj) {
        if (C0025.m4797() > 0) {
            return ((p) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۦۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m4915(Object obj, Object obj2) {
        if (C0052.m8320() >= 0) {
            return com.github.catvod.spider.merge.f1.b.c((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m4916(Object obj, int i) {
        if (C0011.m2755() >= 0) {
            ((View) obj).setBackgroundResource(i);
        }
    }

    /* renamed from: ۟ۦۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Object m4917(Object obj) {
        if (C0034.m6048() <= 0) {
            return ((C0279i) obj).getValue();
        }
        return null;
    }

    /* renamed from: ۟ۦۨۢۦ, reason: not valid java name and contains not printable characters */
    public static int m4918(Object obj) {
        if (C0003.m1463() < 0) {
            return ((LinearLayout.LayoutParams) obj).topMargin;
        }
        return 0;
    }

    /* renamed from: ۟ۧ۟۠۟, reason: not valid java name and contains not printable characters */
    public static String m4919(Object obj) {
        if (C0045.m7538() <= 0) {
            return com.github.catvod.spider.p000mergexbpq.b0.b.g((StringBuilder) obj);
        }
        return null;
    }

    /* renamed from: ۟ۧ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static String m4920(String str) {
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

    /* renamed from: ۟ۧۢۨۡ, reason: not valid java name and contains not printable characters */
    public static float m4921(Object obj) {
        if (C0004.m1557() < 0) {
            return ((MotionEvent) obj).getRawX();
        }
        return 0.0f;
    }

    /* renamed from: ۟ۧۦۣۨ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.T0.m m4922(Object obj) {
        if (C0053.m8389() > 0) {
            return ((com.github.catvod.spider.merge.T0.m) obj).B();
        }
        return null;
    }

    /* renamed from: ۟ۧۦۨۤ, reason: not valid java name and contains not printable characters */
    public static String m4923(Object obj) {
        if (C0031.m5628() > 0) {
            return com.github.catvod.spider.merge.a0.M.h((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۧۧۤ, reason: not valid java name and contains not printable characters */
    public static void m4924(Object obj) {
        if (C0039.m6529() < 0) {
            ((Inflater) obj).end();
        }
    }

    /* renamed from: ۠۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static HashMap m4925(Object obj) {
        if (C0058.m9131() <= 0) {
            return ((HBhaiM) obj).a();
        }
        return null;
    }

    /* renamed from: ۠ۢۨۧ, reason: not valid java name and contains not printable characters */
    public static Parcel m4926() {
        if (C0016.m3596() < 0) {
            return Parcel.obtain();
        }
        return null;
    }

    /* renamed from: ۠ۤۨۢ, reason: not valid java name and contains not printable characters */
    public static JSONObject m4927(Object obj, Object obj2, Object obj3) {
        if (C0030.m5375() > 0) {
            return ((FishHxq) obj).d((String) obj2, (JSONObject) obj3);
        }
        return null;
    }

    /* renamed from: ۠ۦۢۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0416b m4928(Object obj) {
        if (C0047.m7837() > 0) {
            return ((com.github.catvod.spider.merge.w0.b) obj).computeReflected();
        }
        return null;
    }

    /* renamed from: ۠ۧۡ۟, reason: not valid java name and contains not printable characters */
    public static String m4929() {
        if (C0042.m7147() <= 0) {
            return "搜索请求头参数";
        }
        return null;
    }

    /* renamed from: ۠ۧۥۣ, reason: not valid java name and contains not printable characters */
    public static Pattern m4930(Object obj, int i) {
        if (C0009.m2047() >= 0) {
            return Pattern.compile((String) obj, i);
        }
        return null;
    }

    /* renamed from: ۠ۧۦۨ, reason: not valid java name and contains not printable characters */
    public static void m4931(Object obj, Object obj2, Object obj3) {
        if (C0020.m4210() <= 0) {
            ((Mogg) obj).init((Context) obj2, (String) obj3);
        }
    }

    /* renamed from: ۣ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4932(Object obj) {
        if (C0024.m4693() < 0) {
            return ((s) obj).k;
        }
        return false;
    }

    /* renamed from: ۠ۨۤۧ, reason: not valid java name and contains not printable characters */
    public static Throwable m4933(Object obj) {
        if (C0056.m8886() < 0) {
            return ((f) obj).c;
        }
        return null;
    }

    /* renamed from: ۠ۨۦۦ, reason: not valid java name and contains not printable characters */
    public static Pattern m4934(Object obj) {
        if (C0015.m3433() > 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).b0;
        }
        return null;
    }

    /* renamed from: ۡ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m4935(Object obj) {
        if (C0050.m8121() < 0) {
            return ((AbstractC0296g) obj).toString();
        }
        return null;
    }

    /* renamed from: ۣۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m4936(Object obj) {
        if (C0034.m6048() <= 0) {
            return ((C0166x) obj).e;
        }
        return 0;
    }

    /* renamed from: ۡ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static Predicate m4937(Object obj, Object obj2) {
        if (C0020.m4210() < 0) {
            return AbstractC0376b.a((Predicate) obj, (Predicate) obj2);
        }
        return null;
    }

    /* renamed from: ۡۡۢۥ, reason: not valid java name and contains not printable characters */
    public static EnumC0143b m4938() {
        if (C0007.m1886() >= 0) {
            return EnumC0143b.h;
        }
        return null;
    }

    /* renamed from: ۡۡۤ۠, reason: not valid java name and contains not printable characters */
    public static void m4939(Object obj) {
        if (C0000.m1116() < 0) {
            ((C0174a) obj).d();
        }
    }

    /* renamed from: ۡۢۦۣ, reason: not valid java name and contains not printable characters */
    public static String m4940(Object obj, int i) {
        if (C0025.m4797() > 0) {
            return S.f((List) obj, i);
        }
        return null;
    }

    /* renamed from: ۡۢۧۥ, reason: not valid java name and contains not printable characters */
    public static void m4941(Object obj, Object obj2) {
        if (C0060.m9355() >= 0) {
            ((com.github.catvod.spider.merge.F0.S) obj).a((View) obj2);
        }
    }

    /* renamed from: ۣۢۢۦ, reason: not valid java name and contains not printable characters */
    public static void m4942(Object obj, float f, float f2) {
        if (C0007.m1886() >= 0) {
            ((TextView) obj).setLineSpacing(f, f2);
        }
    }

    /* renamed from: ۣۢۤۢ, reason: not valid java name and contains not printable characters */
    public static int m4943(Object obj, int i) {
        if (C0059.m9257() < 0) {
            return ((Calendar) obj).get(i);
        }
        return 0;
    }

    /* renamed from: ۢۦۣۥ, reason: not valid java name and contains not printable characters */
    public static String[] m4944() {
        if (C0042.m7147() <= 0) {
            return com.github.catvod.spider.merge.V0.p.e;
        }
        return null;
    }

    /* renamed from: ۢۦۨۡ, reason: not valid java name and contains not printable characters */
    public static String m4945() {
        if (C0025.m4797() >= 0) {
            return "type_flag";
        }
        return null;
    }

    /* renamed from: ۢۨۥۤ, reason: not valid java name and contains not printable characters */
    public static String m4946(Object obj, Object obj2, int i) {
        if (C0013.m3167() >= 0) {
            return ((UC) obj).detailContentVodPlayFrom((List) obj2, i);
        }
        return null;
    }

    /* renamed from: ۣۥۦۨ, reason: not valid java name and contains not printable characters */
    public static void m4947(Object obj, Object obj2) {
        if (C0028.m5152() < 0) {
            ((com.github.catvod.spider.merge.E.m) obj).k((String) obj2);
        }
    }

    /* renamed from: ۣۨۡۤ, reason: not valid java name and contains not printable characters */
    public static String m4948(Object obj, Object obj2) {
        if (C0062.m9429() >= 0) {
            return System.getProperty((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۣۨ۠, reason: not valid java name and contains not printable characters */
    public static String m4949() {
        if (C0003.m1463() <= 0) {
            return com.github.catvod.spider.merge.a1.e.a();
        }
        return null;
    }

    /* renamed from: ۤۡۢ۠, reason: not valid java name and contains not printable characters */
    public static void m4950(Object obj) {
        if (C0016.m3596() < 0) {
            ((M) obj).o();
        }
    }

    /* renamed from: ۤۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m4952(Object obj) {
        if (C0046.m7701() >= 0) {
            return com.github.catvod.spider.merge.D.f.J((String) obj);
        }
        return null;
    }

    /* renamed from: ۥ۠ۡۢ, reason: contains not printable characters */
    public static String m4953(Object obj) {
        if (C0043.m7332() >= 0) {
            return ((com.github.catvod.spider.merge.L.a) obj).toString();
        }
        return null;
    }

    /* renamed from: ۥۣۡۧ, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.P0.j m4954(Object obj, int i, Object obj2) {
        if (C0030.m5375() >= 0) {
            return ((n) obj).a(i, (Calendar) obj2);
        }
        return null;
    }

    /* renamed from: ۥۡۥۢ, reason: contains not printable characters */
    public static String m4955(Object obj) {
        if (C0044.m7508() < 0) {
            return ((HBsuipian) obj).c;
        }
        return null;
    }

    /* renamed from: ۥۣ۠ۡ, reason: contains not printable characters */
    public static int m4956(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۥۣۦ, reason: contains not printable characters */
    public static int m4957(Object obj) {
        if (C0003.m1463() <= 0) {
            return ((com.github.catvod.spider.merge.V0.e) obj).a;
        }
        return 0;
    }

    /* renamed from: ۥۥۣ۟, reason: contains not printable characters */
    public static Double m4958(Object obj) {
        if (C0053.m8389() >= 0) {
            return ((com.github.catvod.spider.merge.X.a) obj).f;
        }
        return null;
    }

    /* renamed from: ۥۣۧ۟, reason: contains not printable characters */
    public static String m4959(Object obj) {
        if (C0002.m1242() > 0) {
            return l.e((InputStream) obj);
        }
        return null;
    }

    /* renamed from: ۥۨ۠ۡ, reason: contains not printable characters */
    public static boolean m4960(Object obj) {
        if (C0048.m7971() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.R.b) obj).b();
        }
        return false;
    }

    /* renamed from: ۥۨۤۢ, reason: contains not printable characters */
    public static String m4961(Object obj) {
        if (C0019.m4065() <= 0) {
            return ((C0233B) obj).f;
        }
        return null;
    }

    /* renamed from: ۦ۠ۢۡ, reason: contains not printable characters */
    public static String m4962() {
        if (C0022.m4497() >= 0) {
            return "四次";
        }
        return null;
    }

    /* renamed from: ۦۡ۠ۤ, reason: contains not printable characters */
    public static void m4963(Object obj, Object obj2) {
        if (C0040.m6582() >= 0) {
            ((com.github.catvod.spider.merge.a0.M) obj).q((String) obj2);
        }
    }

    /* renamed from: ۦۣۢ۟, reason: contains not printable characters */
    public static String m4964() {
        if (C0062.m9429() >= 0) {
            return "vod_id";
        }
        return null;
    }

    /* renamed from: ۦۣۢۧ, reason: contains not printable characters */
    public static boolean m4965(Object obj, Object obj2, Object obj3) {
        if (C0031.m5628() >= 0) {
            return ((l0) obj).c((B) obj2, (C) obj3);
        }
        return false;
    }

    /* renamed from: ۦۣۨ۠, reason: contains not printable characters */
    public static String m4966(Object obj, Object obj2) {
        if (C0045.m7538() < 0) {
            return ((UC) obj).detailContent((List) obj2);
        }
        return null;
    }

    /* renamed from: ۦۥ۠ۦ, reason: contains not printable characters */
    public static ArrayList m4967(Object obj, Object obj2) {
        if (C0007.m1886() >= 0) {
            return ((com.github.catvod.spider.merge.a0.M) obj).p((String) obj2);
        }
        return null;
    }

    /* renamed from: ۦۥۢۥ, reason: contains not printable characters */
    public static int m4968(Object obj) {
        if (C0009.m2047() >= 0) {
            return System.identityHashCode(obj);
        }
        return 0;
    }

    /* renamed from: ۦۥۤۡ, reason: contains not printable characters */
    public static String m4969() {
        if (C0002.m1242() > 0) {
            return ";+";
        }
        return null;
    }

    /* renamed from: ۧۡۡۨ, reason: not valid java name and contains not printable characters */
    public static void m4970(Object obj, boolean z) {
        if (C0034.m6048() < 0) {
            ((CookieManager) obj).setAcceptCookie(z);
        }
    }

    /* renamed from: ۧۢۦۧ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.Y0.a m4971(Object obj) {
        if (C0042.m7147() < 0) {
            return ((com.github.catvod.spider.merge.Y0.a) obj).c;
        }
        return null;
    }

    /* renamed from: ۣۧۡ۠, reason: not valid java name and contains not printable characters */
    public static void m4972(Object obj, Object obj2) {
        if (C0034.m6048() < 0) {
            ((Parcel) obj).writeString((String) obj2);
        }
    }

    /* renamed from: ۧۤۡ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.V0.n m4973(Object obj) {
        if (C0014.m3353() <= 0) {
            return com.github.catvod.spider.merge.V0.p.j((String) obj);
        }
        return null;
    }

    /* renamed from: ۧۦۧۤ, reason: not valid java name and contains not printable characters */
    public static String m4974(Object obj) {
        if (C0054.m8557() < 0) {
            return ((com.github.catvod.spider.merge.N0.b) obj).e;
        }
        return null;
    }

    /* renamed from: ۣۨۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4975(Object obj, Object obj2) {
        if (C0047.m7837() > 0) {
            return ((C0147d) obj).containsAll((Collection) obj2);
        }
        return false;
    }

    /* renamed from: ۨۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static q m4976() {
        if (C0061.m9359() <= 0) {
            return q.b;
        }
        return null;
    }

    /* renamed from: ۨۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m4977() {
        return 865 ^ C0043.f745;
    }

    /* renamed from: ۨۨۦۢ, reason: not valid java name and contains not printable characters */
    public static int m4978(Object obj) {
        if (C0060.m9355() >= 0) {
            return ((G) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣۤۡ۠, reason: not valid java name and contains not printable characters */
    public static String m4951(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}