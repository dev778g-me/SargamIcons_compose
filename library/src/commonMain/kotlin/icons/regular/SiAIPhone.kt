package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiAIPhone: ImageVector
    get() {
        if (_SiAIPhone != null) {
            return _SiAIPhone!!
        }
        _SiAIPhone = ImageVector.Builder(
            name = "Regular.SiAIPhone",
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
                moveToRelative(7.18f, 10.27f)
                lineToRelative(6.504f, 6.46f)
                curveToRelative(0.697f, -0.807f, 5.11f, -5.538f, 7.316f, 0.924f)
                curveToRelative(0f, 0f, -0.232f, 3.346f, -4.994f, 3.346f)
                curveToRelative(-3.367f, 0f, -6.851f, -4.038f, -9.29f, -6.346f)
                curveTo(4.626f, 12.692f, 3f, 10.154f, 3f, 7.846f)
                curveTo(3f, 3.116f, 6.252f, 3f, 6.252f, 3f)
                curveToRelative(7.432f, 2.538f, 0.929f, 7.27f, 0.929f, 7.27f)
                moveTo(16.258f, 5.967f)
                lineToRelative(0.354f, -1.415f)
                curveToRelative(0.1f, -0.404f, 0.675f, -0.404f, 0.776f, 0f)
                lineToRelative(0.354f, 1.415f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.29f, 0.291f)
                lineToRelative(1.416f, 0.354f)
                curveToRelative(0.404f, 0.1f, 0.404f, 0.675f, 0f, 0.776f)
                lineToRelative(-1.415f, 0.354f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.291f, 0.29f)
                lineToRelative(-0.354f, 1.416f)
                curveToRelative(-0.1f, 0.404f, -0.675f, 0.404f, -0.776f, 0f)
                lineToRelative(-0.354f, -1.415f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.29f, -0.291f)
                lineToRelative(-1.416f, -0.354f)
                curveToRelative(-0.404f, -0.1f, -0.404f, -0.675f, 0f, -0.776f)
                lineToRelative(1.415f, -0.354f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.291f, -0.29f)
            }
        }.build()

        return _SiAIPhone!!
    }

@Suppress("ObjectPropertyName")
private var _SiAIPhone: ImageVector? = null
