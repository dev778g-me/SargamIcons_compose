package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiAISmartphone: ImageVector
    get() {
        if (_SiAISmartphone != null) {
            return _SiAISmartphone!!
        }
        _SiAISmartphone = ImageVector.Builder(
            name = "Regular.SiAISmartphone",
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
                moveTo(11f, 5f)
                horizontalLineToRelative(2f)
                moveTo(8.4f, 2f)
                horizontalLineToRelative(7.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 4.4f)
                verticalLineToRelative(15.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                horizontalLineTo(8.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 19.6f)
                verticalLineTo(4.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.4f, 2f)
                moveToRelative(3.406f, 8.776f)
                lineToRelative(-0.377f, 1.508f)
                arcToRelative(0.2f, 0.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.145f, 0.145f)
                lineToRelative(-1.508f, 0.377f)
                curveToRelative(-0.202f, 0.05f, -0.202f, 0.338f, 0f, 0.388f)
                lineToRelative(1.508f, 0.377f)
                arcToRelative(0.2f, 0.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.145f, 0.145f)
                lineToRelative(0.377f, 1.508f)
                curveToRelative(0.05f, 0.202f, 0.338f, 0.202f, 0.388f, 0f)
                lineToRelative(0.377f, -1.508f)
                arcToRelative(0.2f, 0.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.145f, -0.145f)
                lineToRelative(1.508f, -0.377f)
                curveToRelative(0.202f, -0.05f, 0.202f, -0.338f, 0f, -0.388f)
                lineToRelative(-1.508f, -0.377f)
                arcToRelative(0.2f, 0.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.145f, -0.145f)
                lineToRelative(-0.377f, -1.508f)
                curveToRelative(-0.05f, -0.202f, -0.338f, -0.202f, -0.388f, 0f)
            }
        }.build()

        return _SiAISmartphone!!
    }

@Suppress("ObjectPropertyName")
private var _SiAISmartphone: ImageVector? = null
