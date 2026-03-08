package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiThumbDown: ImageVector
    get() {
        if (_SiThumbDown != null) {
            return _SiThumbDown!!
        }
        _SiThumbDown = ImageVector.Builder(
            name = "Regular.SiThumbDown",
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
                moveTo(6f, 14.174f)
                horizontalLineToRelative(2.665f)
                lineTo(13.798f, 22f)
                curveToRelative(2.136f, -1.049f, 2.32f, -3.209f, 1.36f, -4.938f)
                lineToRelative(-0.64f, -1.174f)
                curveToRelative(-0.476f, -0.978f, -0.034f, -1.734f, 1.001f, -1.714f)
                horizontalLineToRelative(3.237f)
                curveToRelative(0.628f, 0f, 3.408f, -0.192f, 3.236f, -4.304f)
                curveTo(21.836f, 6.293f, 18.866f, 4f, 18.272f, 4f)
                horizontalLineTo(6.066f)
                moveTo(2.8f, 16f)
                horizontalLineToRelative(2.4f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.8f, -0.8f)
                verticalLineTo(2.8f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, -0.8f)
                horizontalLineTo(2.8f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, 0.8f)
                verticalLineToRelative(12.4f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.8f, 0.8f)
            }
        }.build()

        return _SiThumbDown!!
    }

@Suppress("ObjectPropertyName")
private var _SiThumbDown: ImageVector? = null
