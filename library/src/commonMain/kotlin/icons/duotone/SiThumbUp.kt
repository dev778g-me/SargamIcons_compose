package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiThumbUp: ImageVector
    get() {
        if (_SiThumbUp != null) {
            return _SiThumbUp!!
        }
        _SiThumbUp = ImageVector.Builder(
            name = "Duotone.SiThumbUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(18.756f, 9.826f)
                curveToRelative(0.628f, 0f, 3.408f, 0.192f, 3.236f, 4.304f)
                curveToRelative(-0.156f, 3.577f, -3.126f, 5.87f, -3.72f, 5.87f)
                horizontalLineTo(6.066f)
                lineTo(6f, 9.826f)
                horizontalLineToRelative(2.665f)
                lineTo(13.798f, 2f)
                curveToRelative(2.136f, 1.049f, 2.32f, 3.209f, 1.36f, 4.938f)
                lineToRelative(-0.64f, 1.174f)
                curveToRelative(-0.476f, 0.978f, -0.034f, 1.734f, 1.001f, 1.714f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 9.826f)
                horizontalLineToRelative(2.665f)
                lineTo(13.798f, 2f)
                curveToRelative(2.136f, 1.049f, 2.32f, 3.209f, 1.36f, 4.938f)
                lineToRelative(-0.64f, 1.174f)
                curveToRelative(-0.476f, 0.978f, -0.034f, 1.734f, 1.001f, 1.714f)
                horizontalLineToRelative(3.237f)
                curveToRelative(0.628f, 0f, 3.408f, 0.192f, 3.236f, 4.304f)
                curveToRelative(-0.156f, 3.577f, -3.126f, 5.87f, -3.72f, 5.87f)
                horizontalLineTo(6.066f)
                moveTo(2.8f, 8f)
                horizontalLineToRelative(2.4f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.8f, 0.8f)
                verticalLineToRelative(12.4f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.8f, 0.8f)
                horizontalLineTo(2.8f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.8f, -0.8f)
                verticalLineTo(8.8f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.8f, -0.8f)
            }
        }.build()

        return _SiThumbUp!!
    }

@Suppress("ObjectPropertyName")
private var _SiThumbUp: ImageVector? = null
