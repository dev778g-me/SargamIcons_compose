package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiAIShield: ImageVector
    get() {
        if (_SiAIShield != null) {
            return _SiAIShield!!
        }
        _SiAIShield = ImageVector.Builder(
            name = "Regular.SiAIShield",
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
                moveTo(12.113f, 21.98f)
                arcToRelative(0.33f, 0.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.226f, 0f)
                curveTo(10.917f, 21.64f, 4f, 18.94f, 4f, 11.252f)
                verticalLineTo(4.304f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.303f, -0.389f)
                lineToRelative(7.6f, -1.903f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.194f, 0f)
                lineToRelative(7.6f, 1.903f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.303f, 0.389f)
                verticalLineToRelative(6.948f)
                curveToRelative(0f, 7.765f, -6.916f, 10.397f, -7.887f, 10.729f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(11.43f, 10.284f)
                lineToRelative(0.376f, -1.508f)
                curveToRelative(0.05f, -0.202f, 0.338f, -0.202f, 0.388f, 0f)
                lineToRelative(0.377f, 1.508f)
                arcToRelative(0.2f, 0.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.145f, 0.145f)
                lineToRelative(1.508f, 0.377f)
                curveToRelative(0.202f, 0.05f, 0.202f, 0.337f, 0f, 0.388f)
                lineToRelative(-1.508f, 0.377f)
                arcToRelative(0.2f, 0.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.145f, 0.145f)
                lineToRelative(-0.377f, 1.508f)
                curveToRelative(-0.05f, 0.202f, -0.338f, 0.202f, -0.388f, 0f)
                lineToRelative(-0.377f, -1.508f)
                arcToRelative(0.2f, 0.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.145f, -0.145f)
                lineToRelative(-1.508f, -0.377f)
                curveToRelative(-0.202f, -0.05f, -0.202f, -0.338f, 0f, -0.388f)
                lineToRelative(1.508f, -0.377f)
                arcToRelative(0.2f, 0.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.145f, -0.146f)
            }
        }.build()

        return _SiAIShield!!
    }

@Suppress("ObjectPropertyName")
private var _SiAIShield: ImageVector? = null
