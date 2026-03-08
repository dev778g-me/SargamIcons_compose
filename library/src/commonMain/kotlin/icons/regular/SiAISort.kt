package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiAISort: ImageVector
    get() {
        if (_SiAISort != null) {
            return _SiAISort!!
        }
        _SiAISort = ImageVector.Builder(
            name = "Regular.SiAISort",
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
                moveTo(8.4f, 3f)
                horizontalLineTo(4.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 4.6f)
                verticalLineToRelative(3.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.6f, 10f)
                horizontalLineToRelative(3.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 8.4f)
                verticalLineTo(4.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.4f, 3f)
                moveTo(19.4f, 3f)
                horizontalLineToRelative(-3.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 4.6f)
                verticalLineToRelative(3.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.6f, 1.6f)
                horizontalLineToRelative(3.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 8.4f)
                verticalLineTo(4.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.4f, 3f)
                moveTo(8.4f, 14f)
                horizontalLineTo(4.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 15.6f)
                verticalLineToRelative(3.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.6f, 21f)
                horizontalLineToRelative(3.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.6f, -1.6f)
                verticalLineToRelative(-3.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.4f, 14f)
                moveTo(16.83f, 16.684f)
                lineToRelative(0.476f, -1.908f)
                curveToRelative(0.05f, -0.202f, 0.337f, -0.202f, 0.388f, 0f)
                lineToRelative(0.477f, 1.908f)
                arcToRelative(0.2f, 0.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.145f, 0.145f)
                lineToRelative(1.908f, 0.477f)
                curveToRelative(0.202f, 0.05f, 0.202f, 0.337f, 0f, 0.388f)
                lineToRelative(-1.908f, 0.477f)
                arcToRelative(0.2f, 0.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.145f, 0.145f)
                lineToRelative(-0.477f, 1.908f)
                curveToRelative(-0.05f, 0.202f, -0.337f, 0.202f, -0.388f, 0f)
                lineToRelative(-0.477f, -1.908f)
                arcToRelative(0.2f, 0.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.145f, -0.145f)
                lineToRelative(-1.908f, -0.477f)
                curveToRelative(-0.202f, -0.05f, -0.202f, -0.337f, 0f, -0.388f)
                lineToRelative(1.908f, -0.477f)
                arcToRelative(0.2f, 0.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.145f, -0.145f)
            }
        }.build()

        return _SiAISort!!
    }

@Suppress("ObjectPropertyName")
private var _SiAISort: ImageVector? = null
