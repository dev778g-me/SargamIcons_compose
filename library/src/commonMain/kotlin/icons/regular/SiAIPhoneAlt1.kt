package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiAIPhoneAlt1: ImageVector
    get() {
        if (_SiAIPhoneAlt1 != null) {
            return _SiAIPhoneAlt1!!
        }
        _SiAIPhoneAlt1 = ImageVector.Builder(
            name = "Regular.SiAIPhoneAlt1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(16.82f, 10.27f)
                lineToRelative(-6.504f, 6.46f)
                curveToRelative(-0.697f, -0.807f, -5.11f, -5.538f, -7.316f, 0.924f)
                curveToRelative(0f, 0f, 0.232f, 3.346f, 4.994f, 3.346f)
                curveToRelative(3.367f, 0f, 6.851f, -4.038f, 9.29f, -6.346f)
                curveToRelative(2.09f, -1.962f, 3.716f, -4.5f, 3.716f, -6.808f)
                curveTo(21f, 3.116f, 17.748f, 3f, 17.748f, 3f)
                curveToRelative(-7.432f, 2.538f, -0.929f, 7.27f, -0.929f, 7.27f)
                moveTo(7.742f, 5.967f)
                lineToRelative(-0.354f, -1.415f)
                curveToRelative(-0.1f, -0.404f, -0.675f, -0.404f, -0.776f, 0f)
                lineToRelative(-0.354f, 1.415f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.29f, 0.291f)
                lineToRelative(-1.416f, 0.354f)
                curveToRelative(-0.404f, 0.1f, -0.404f, 0.675f, 0f, 0.776f)
                lineToRelative(1.415f, 0.354f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.291f, 0.29f)
                lineToRelative(0.354f, 1.416f)
                curveToRelative(0.1f, 0.404f, 0.675f, 0.404f, 0.776f, 0f)
                lineToRelative(0.354f, -1.415f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.29f, -0.291f)
                lineToRelative(1.416f, -0.354f)
                curveToRelative(0.404f, -0.1f, 0.404f, -0.675f, 0f, -0.776f)
                lineToRelative(-1.415f, -0.354f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.291f, -0.29f)
            }
        }.build()

        return _SiAIPhoneAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _SiAIPhoneAlt1: ImageVector? = null
