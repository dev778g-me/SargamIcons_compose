package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiPhoneLocked: ImageVector
    get() {
        if (_SiPhoneLocked != null) {
            return _SiPhoneLocked!!
        }
        _SiPhoneLocked = ImageVector.Builder(
            name = "Regular.SiPhoneLocked",
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
                moveTo(15.5f, 7f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                verticalLineToRelative(2f)
                moveTo(7.18f, 10.27f)
                lineToRelative(6.504f, 6.46f)
                curveToRelative(0.697f, -0.807f, 5.11f, -5.538f, 7.316f, 0.924f)
                curveToRelative(0f, 0f, -0.232f, 3.346f, -4.994f, 3.346f)
                curveToRelative(-3.367f, 0f, -6.851f, -4.038f, -9.29f, -6.346f)
                curveTo(4.626f, 12.692f, 3f, 10.154f, 3f, 7.846f)
                curveTo(3f, 3.116f, 6.252f, 3f, 6.252f, 3f)
                curveToRelative(7.432f, 2.538f, 0.929f, 7.27f, 0.929f, 7.27f)
                moveTo(14.8f, 7f)
                horizontalLineToRelative(5.4f)
                curveToRelative(0.44f, 0f, 0.8f, 0.36f, 0.8f, 0.8f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.66f, -0.54f, 1.2f, -1.2f, 1.2f)
                horizontalLineToRelative(-4.6f)
                curveToRelative(-0.66f, 0f, -1.2f, -0.54f, -1.2f, -1.2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.44f, 0.36f, -0.8f, 0.8f, -0.8f)
            }
        }.build()

        return _SiPhoneLocked!!
    }

@Suppress("ObjectPropertyName")
private var _SiPhoneLocked: ImageVector? = null
