package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiAlignBottomSimple: ImageVector
    get() {
        if (_SiAlignBottomSimple != null) {
            return _SiAlignBottomSimple!!
        }
        _SiAlignBottomSimple = ImageVector.Builder(
            name = "Regular.SiAlignBottomSimple",
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
                moveTo(2f, 22f)
                horizontalLineToRelative(20f)
                moveTo(10.6f, 2f)
                horizontalLineToRelative(2.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 3.6f)
                verticalLineToRelative(12.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, 1.6f)
                horizontalLineToRelative(-2.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 16.4f)
                verticalLineTo(3.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.6f, 2f)
            }
        }.build()

        return _SiAlignBottomSimple!!
    }

@Suppress("ObjectPropertyName")
private var _SiAlignBottomSimple: ImageVector? = null
