package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiHomeDetailed: ImageVector
    get() {
        if (_SiHomeDetailed != null) {
            return _SiHomeDetailed!!
        }
        _SiHomeDetailed = ImageVector.Builder(
            name = "Regular.SiHomeDetailed",
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
                moveToRelative(1f, 9f)
                lineToRelative(10.26f, -6.76f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.44f, 0f)
                lineTo(23f, 9f)
                moveToRelative(-2f, -1.313f)
                verticalLineTo(19.6f)
                curveToRelative(0f, 1.33f, -1.07f, 2.4f, -2.4f, 2.4f)
                horizontalLineTo(5.4f)
                curveTo(4.07f, 22f, 3f, 20.93f, 3f, 19.6f)
                verticalLineTo(7.682f)
                moveTo(18f, 3f)
                verticalLineToRelative(2.718f)
                moveTo(15f, 8f)
                horizontalLineTo(9f)
                moveToRelative(0.8f, 4f)
                horizontalLineToRelative(4.4f)
                curveToRelative(0.44f, 0f, 0.8f, 0.36f, 0.8f, 0.8f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                verticalLineToRelative(-9.2f)
                curveToRelative(0f, -0.44f, 0.36f, -0.8f, 0.8f, -0.8f)
            }
        }.build()

        return _SiHomeDetailed!!
    }

@Suppress("ObjectPropertyName")
private var _SiHomeDetailed: ImageVector? = null
