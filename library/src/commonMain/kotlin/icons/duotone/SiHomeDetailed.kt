package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiHomeDetailed: ImageVector
    get() {
        if (_SiHomeDetailed != null) {
            return _SiHomeDetailed!!
        }
        _SiHomeDetailed = ImageVector.Builder(
            name = "Duotone.SiHomeDetailed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(15f, 22f)
                horizontalLineToRelative(3.6f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.4f, -2.412f)
                verticalLineTo(8.332f)
                curveToRelative(0f, -0.382f, -0.18f, -0.734f, -0.48f, -0.965f)
                lineTo(12.7f, 2.24f)
                arcToRelative(1.195f, 1.195f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.44f, 0f)
                lineTo(3.48f, 7.367f)
                curveToRelative(-0.3f, 0.231f, -0.48f, 0.583f, -0.48f, 0.965f)
                verticalLineToRelative(11.256f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.4f, 22f)
                horizontalLineTo(9f)
                verticalLineToRelative(-9.2f)
                curveToRelative(0f, -0.44f, 0.36f, -0.8f, 0.8f, -0.8f)
                horizontalLineToRelative(4.4f)
                curveToRelative(0.44f, 0f, 0.8f, 0.36f, 0.8f, 0.8f)
                close()
            }
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
